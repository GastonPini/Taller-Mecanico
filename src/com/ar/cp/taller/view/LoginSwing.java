/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cp.taller.view;

import javax.swing.JFrame;

/**
 *
 * @author gaston
 */
public class LoginSwing {
    public static void main(String[] args) {
	Home ventana = new Home();
	ventana.setSize(500,300);
	ventana.setVisible(true);
	JFrame jf = new JFrame();
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setSize(600,300);
	jf.add(ventana);
	jf.setVisible(true);
        
    }
}
