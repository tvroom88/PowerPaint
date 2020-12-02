package view;

import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

/**
 * Build a menu bar for this application. 
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */

public class MenuBar extends JMenuBar {

    /** A generated serialization ID. */
    private static final long serialVersionUID = -111659266189879540L;


    /**
     * A fully-stocked menu bar.
     * 
     * @param theThicknessAction the action for change tool's thickness
     * @param theColorActions the list of color actions for this menu. 
     * @param theClearAction the action for clear
     * @param theToolActions the list of tool actions
     * @param theAboutAction the action for about menu
     */
    public MenuBar(final JMenu theThicknessAction, final List<JMenuItem> theColorActions,
            final JMenuItem theClearAction, final List<Action> theToolActions, final JMenuItem theAboutAction) {

        super();
        add(buildOptionMenu(theThicknessAction, theColorActions, theClearAction));
        add(buildToolMenu(theToolActions));
        add(buildHelpMenu(theAboutAction));

    }
    
    /**
     * Build the Option JMenu. 
     * 
     * @param theThicknessAction the action for change tool's thickness
     * @param theColorActions the list of color actions for this menu. 
     * @param theClearAction the action for clear
     * @return the option menu
     */
    private JMenu buildOptionMenu(final JMenu theThicknessAction, final List<JMenuItem> theColorActions,
            final JMenuItem theClearAction) {
        // setup the file menu
        final JMenu optionMenu = new JMenu("Options");
        optionMenu.setMnemonic(KeyEvent.VK_O);

        optionMenu.add(theThicknessAction);
        optionMenu.addSeparator();
        for (final JMenuItem menu : theColorActions) {
            optionMenu.add(menu);
        }
        optionMenu.addSeparator();
        optionMenu.add(theClearAction);

        return optionMenu;
    }

    /**
     * Build the Tool JMenu. 
     * 
     * @param theToolActions the list of tool actions
     * @return the tool menu
     */
    private JMenu buildToolMenu(final List<Action> theToolActions) {
        final JMenu toolMenu = new JMenu("Tool");

        final ButtonGroup btngrp = new ButtonGroup();
        for (final Action action : theToolActions) {
            final JRadioButton btn = new JRadioButton(action);
            btngrp.add(btn);
            toolMenu.add(btn);
        }

        return toolMenu;
    }


    /**
     * Build the Help JMenu. 
     * 
     * @param theAboutAction the action for about menu
     * @return the help menu
     */
    private JMenu buildHelpMenu(final JMenuItem theAboutAction) {

        final JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        helpMenu.add(theAboutAction);

        return helpMenu;
    }

}
