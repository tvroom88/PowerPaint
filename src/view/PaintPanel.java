package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import model.PaintedShape;
import tools.EraserTool;
import tools.PencilTool;
import tools.Tool;

/**
 * Build a paint panel for this application. 
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */

public class PaintPanel extends JPanel {

    /** A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 6427559347084723386L;

    /** The initial thickness. */
    private static final int INITIAL_THICKNESS = 10;

    /** The panel width. */
    private static final int WIDTH = 500;

    /** The panel height. */
    private static final int HEIGHT = 300;

    /** The background color of the panel. */
    public static final Color BACKGROUND_COLOR = Color.WHITE;


    /** A collection of drawn shapes. */
    private final Queue<PaintedShape> myShapesList;

    private Tool myTool;

    private int myThickness;

    private boolean myDraggingStatus;

    private Color myColor;
    private Color myPrimaryColor;
    private Color mySecondaryColor;

    PaintedShape shape;

    /**
     * Constructs a paint panel
     */
    public PaintPanel() {
        super();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(BACKGROUND_COLOR);

        this.myTool = new PencilTool();
        this.myThickness = INITIAL_THICKNESS;
        this.myColor = Color.BLACK;
        addListeners();

//       지울지 유지할지 저하
        myShapesList = new LinkedList<PaintedShape>();
        myDraggingStatus = false;
        

    }

    private void addListeners() {
        // TODO Auto-generated method stub
        addMouseListener(new DrawingListener1());
        addMouseMotionListener(new DrawingListener2());
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    public void setTool(final Tool theTool) {
        this.myTool = theTool;
    }

    public Tool getTool() {
        return myTool;
    }

    public void setThickness(final int theThickness) {
        this.myThickness = theThickness;
    }
    public int getThickness() {
        return myThickness;
    }
    // set and get Color method
    public void setColor(final Color theColor) {
        this.myColor = theColor;
    }

    public Color getColor() {
        return myColor;
    }

    public void setPrimaryColor(final Color theColor) {
        this.myPrimaryColor = theColor;
    }

    public Color getPrimaryColor() {
        return myPrimaryColor;
    }

    public void setSeconaryColor(final Color theColor) {
        this.mySecondaryColor = theColor;
    }

    public Color getSecondaryColor() {
        return mySecondaryColor;
    }

    public void clearPaintPanel() {

        myShapesList.clear();
        repaint();

    }

    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (final PaintedShape shape : myShapesList) {
            g2d.setStroke(new BasicStroke(shape.getThickness()));
            g2d.setColor(shape.getColor());
            g2d.draw(shape.getShape());
        }

        if (myDraggingStatus) {

            g2d.setStroke(new BasicStroke(myThickness));
            g2d.setColor(myColor);

            if (myThickness != 0) {
                g2d.draw(myTool.paintedShape());
            }
        }
    }
    
    
    /**
     * Mouse Adapter to handle Mouse Events and pass the tool's starting Point and
     * ending Point
     */
    class DrawingListener1 extends MouseAdapter {
        /**
         * {@inheritDoc}
         */
        @Override
        public void mousePressed(final MouseEvent theEvent) {

            if (myTool instanceof EraserTool) {
                myDraggingStatus = true;
                setColor(Color.white);

            } else {
                if (SwingUtilities.isRightMouseButton(theEvent)) {
                    myDraggingStatus = true;
                    setColor(mySecondaryColor);
                } else if (SwingUtilities.isLeftMouseButton(theEvent)) {
                    myDraggingStatus = true;
                    setColor(myPrimaryColor);
                } else if (SwingUtilities.isLeftMouseButton(theEvent)) {
                    myDraggingStatus = false;
                }

            }

            myTool.setStartingPoint(theEvent.getPoint());
            myTool.setEndingPoint(theEvent.getPoint());
            repaint();
        }
        
        /**
         * {@inheritDoc} 
         */
        @Override
        public void mouseReleased(final MouseEvent theEvent) {

            myTool.setEndingPoint(theEvent.getPoint());
            if (myDraggingStatus && myThickness != 0) {
                myDraggingStatus = false;
                myShapesList.add(new PaintedShape(myTool.paintedShape(), myThickness, myColor));
            }
        }

    }
  
    /**
     * Mouse Motion Adapter to handle MouseMotion Events 
     */
    class DrawingListener2 extends MouseMotionAdapter {
        /**
         * {@inheritDoc} 
         */
        @Override
        public void mouseDragged(final MouseEvent theEvent) {
//            myDraggingStatus = true;
            myTool.setEndingPoint(theEvent.getPoint());
            repaint();
        }
    }


}
