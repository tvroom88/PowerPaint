package view;

import java.util.List;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 * Build a tool bar for this application. 
 * 
 * @author Jaehong Lee Student
 * @version Fall 2020 
 */

public class ToolBar extends JToolBar {

    /** A generated serialization ID. */
    private static final long serialVersionUID = 4268951943328073987L;

    /**
     * @return a fully-stocked tool bar.
     */
    public void buildToolBarButton(final List<Action> theToolActions) {
       
        final ButtonGroup btngrp = new ButtonGroup();
        for (final Action ac : theToolActions) {
            final JToggleButton toggleButton = new JToggleButton(ac);
            add(toggleButton);
            btngrp.add(toggleButton);
        }
       
    }
}
