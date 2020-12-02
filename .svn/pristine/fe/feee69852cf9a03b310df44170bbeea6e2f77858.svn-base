package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.TextArea;
import java.awt.event.InputEvent;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import tools.EllipseTool;
import tools.LineTool;
import tools.PencilTool;
import tools.RectangleTool;
import tools.Tool;
import view.PaintPanel;

public class TestPaintPanel {

    private PaintPanel myPaintPanel;

    @Before
    public void setUp() throws Exception {
        myPaintPanel = new PaintPanel();
        
    }

    @Test
    public void testCurrentTool() {
        Tool thePencil = new PencilTool(), theEllipse = new EllipseTool(), theRectangle = new RectangleTool(),
                theLine = new LineTool();

        myPaintPanel.setTool(thePencil);
        assertEquals(" Tool is Pencil", myPaintPanel.getTool(), thePencil);
        assertNotEquals(" Tool is not elipse", myPaintPanel.getTool(), theRectangle);
        assertNotEquals(" Tool is not rectangle", myPaintPanel.getTool(), theEllipse);

        myPaintPanel.setTool(theLine);
        assertEquals(" Tool is Pencil", myPaintPanel.getTool(), theLine);
        assertNotEquals(" Tool is not elipse", myPaintPanel.getTool(), thePencil);
        assertNotEquals(" Tool is not rectangle", myPaintPanel.getTool(), theRectangle);

    }

    @Test
    public void testThickness() {

        assertEquals("initial thickness", myPaintPanel.getThickness(), 10);

        myPaintPanel.setThickness(2);
        assertEquals("initial thickness", myPaintPanel.getThickness(), 2);
        assertNotEquals("initial thickness", myPaintPanel.getThickness(), 3);

    }

    @Test
    public void testPrimaryColor() {

        myPaintPanel.setPrimaryColor(Color.YELLOW);

        assertEquals("current primary color", myPaintPanel.getPrimaryColor(), Color.YELLOW);
        assertNotEquals("current primary color1", myPaintPanel.getPrimaryColor(), Color.BLACK);
        
 

    }

    @Test
    public void testSecondaryColor() {
        myPaintPanel.setSeconaryColor(Color.GRAY);

        assertEquals("current secondary color", myPaintPanel.getSecondaryColor(), Color.GRAY);
        assertNotEquals("current secondary color1", myPaintPanel.getSecondaryColor(), Color.red);

        myPaintPanel.setSeconaryColor(Color.green);
        assertEquals("current secondary color", myPaintPanel.getSecondaryColor(), Color.green);
    }

}
