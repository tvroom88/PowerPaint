/*
 * TCSS 305 – Fall 2020
 * Assignment 4 - PowerPaint.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import actions.ToolActions;
import model.ColorItemIcon;
import tools.EllipseTool;
import tools.EraserTool;
import tools.LineTool;
import tools.PencilTool;
import tools.RectangleTool;

/**
 * A frame that uses a menu bar and Toolbar
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020
 */


public class PowerPaintGUI {

    /** GUI window. */
    private JFrame myFrame;

    /** A painting Panel in window. */
    private PaintPanel myPanel;

    /** A Icon for primary color. */
    private final ColorItemIcon myPrimaryColorIcon;

    /** A Icon for secondary color. */
    private final ColorItemIcon mySecondaryColorIcon;

    /** JMenuItem list for menu bar. */
    private List<JMenuItem> myColorActions;

    /** Action list for tool bar */
    private List<Action> myToolActions;

    // Constructor
    /**
     * Constructs a new PowerPaintGUI with tool bar and menu bar.
     */
    public PowerPaintGUI() {
        myPrimaryColorIcon = new ColorItemIcon(new Color(51, 0, 111));
        mySecondaryColorIcon = new ColorItemIcon(new Color(232, 211, 162));

        myFrame = new JFrame("Power Paint");

        myPanel = new PaintPanel();

        myFrame.add(myPanel, BorderLayout.CENTER);

        addListeners();

        final ToolBar toolBar = new ToolBar();
        toolBar.buildToolBarButton(myToolActions);

        myFrame.add(toolBar, BorderLayout.SOUTH);

        final JMenuBar menuBar = new MenuBar(thicknessAction(), myColorActions, clearAction(), myToolActions,
                aboutAction());
        myFrame.setJMenuBar(menuBar);

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLocationRelativeTo(null);
        myFrame.pack();
        myFrame.setVisible(true);

        myPanel.setColor(myPrimaryColorIcon.getColor());
        myPanel.setPrimaryColor(myPrimaryColorIcon.getColor());
        myPanel.setSeconaryColor(mySecondaryColorIcon.getColor());

    }

    /**
     * Sets up all the Actions.
     */
    private void addListeners() {

        myToolActions = new ArrayList<>();
//        myToolActions.add(new PencilAction(myPanel));
//        myToolActions.add(new LineAction(myPanel));
//        myToolActions.add(new RectangleAction(myPanel));
//        myToolActions.add(new EllipseAction(myPanel));
//        myToolActions.add(new EraserAction(myPanel));
        myToolActions.add(new ToolActions(myPanel, new PencilTool()));
        myToolActions.add(new ToolActions(myPanel, new LineTool()));
        myToolActions.add(new ToolActions(myPanel, new RectangleTool()));
        myToolActions.add(new ToolActions(myPanel, new EllipseTool()));
        myToolActions.add(new ToolActions(myPanel, new EraserTool()));

        myColorActions = new ArrayList<JMenuItem>();
        myColorActions.add(primaryColorAction());
        myColorActions.add(secondaryColorAction());

    }

    /**
     * @return tool menu with action
     */
    private JMenu thicknessAction() {

        JMenu inThicknessMenu = new JMenu("Thickness");
        inThicknessMenu.setMnemonic(KeyEvent.VK_T);
        final JSlider inThicknessBar = new JSlider(JSlider.HORIZONTAL, 0, 20, 1);

        inThicknessBar.setMajorTickSpacing(5);
        inThicknessBar.setMinorTickSpacing(1);
        inThicknessBar.setPaintTicks(true);
        inThicknessBar.setPaintLabels(true);
        inThicknessMenu.add(inThicknessBar);

        inThicknessBar.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(final ChangeEvent theEvent) {
                final int thickness = inThicknessBar.getValue();

                if (thickness >= 0) {
                    myPanel.setThickness(thickness);
                }
            }
        });
        return inThicknessMenu;
    }

    /**
     * @return primary color menu with action
     */
    private JMenuItem primaryColorAction() {

        JMenuItem inPrimaryColorMenu = new JMenuItem("Primary Color", myPrimaryColorIcon);
        inPrimaryColorMenu.setMnemonic(KeyEvent.VK_F);
        inPrimaryColorMenu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                final Color colorResult = JColorChooser.showDialog(null, "Select a color",
                        myPrimaryColorIcon.getColor());
                myPrimaryColorIcon.setColor(colorResult);

                if (colorResult != null) {
                    myPanel.setPrimaryColor(colorResult);
                }
            }
        });

        return inPrimaryColorMenu;
    }

    /**
     * @return secondary color menu with action
     */
    private JMenuItem secondaryColorAction() {

        JMenuItem inSecondaryColorMenu = new JMenuItem("Secondary Color", mySecondaryColorIcon);
        inSecondaryColorMenu.setMnemonic(KeyEvent.VK_S);

        inSecondaryColorMenu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                final Color colorResult = JColorChooser.showDialog(null, "Select a color",
                        mySecondaryColorIcon.getColor());
                mySecondaryColorIcon.setColor(colorResult);

                if (colorResult != null) {
                    myPanel.setSeconaryColor(colorResult);
                }
            }

        });

        return inSecondaryColorMenu;
    }

    /**
     * @return a clear menu with action
     */
    private JMenuItem clearAction() {

        JMenuItem inClearMenu = new JMenuItem("Clear");
        inClearMenu.setMnemonic(KeyEvent.VK_C);
        inClearMenu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                myPanel.clearPaintPanel();
            }
        });

        return inClearMenu;
    }

    /**
     * @return a about menu with action
     */
    private JMenuItem aboutAction() {

        final JMenuItem inAboutMenu = new JMenuItem("About");
        final ImageIcon myImageIcon = new ImageIcon(
                new ImageIcon("./images/w.gif").getImage().getScaledInstance(40, 30, 0));
        inAboutMenu.setMnemonic(KeyEvent.VK_A);

        inAboutMenu.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(final ActionEvent theEvent) {

                JOptionPane.showMessageDialog(null, "Jaehong.Lee \nAutumn 2020 \nTCSS 305 Assignment 4", "About",
                        JOptionPane.DEFAULT_OPTION, myImageIcon);

            }
        });

        return inAboutMenu;
    }

}
