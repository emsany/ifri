/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bj.ifri.master1.emploi.vue;

import java.awt.LayoutManager;

/**
 *
 * @author SANNI Emmanuel
 */
public class JFormPanel extends javax.swing.JPanel  {

    protected MODE_OUVERTURE mode;
    
    public JFormPanel(MODE_OUVERTURE mode, LayoutManager layout, boolean isDoubleBuffered) {
        super(layout, isDoubleBuffered);
        this.mode = mode;
    }

    public JFormPanel(MODE_OUVERTURE mode, LayoutManager layout) {
        super(layout);
        this.mode = mode;
    }

    public JFormPanel(MODE_OUVERTURE mode, boolean isDoubleBuffered) {
        super(isDoubleBuffered);
    }

    public JFormPanel(MODE_OUVERTURE mode) {
        super();
        this.mode = mode;
    }
    public JFormPanel() {
        super();
        this.mode = mode;
    }
    
    
}
