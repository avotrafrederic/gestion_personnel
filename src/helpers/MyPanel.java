/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import javax.swing.JPanel;

/**
 *
 * @author zandry_kely
 */
public class MyPanel {
    public static void addpanel(JPanel content, JPanel newpanel){
        content.removeAll();
        content.add(newpanel);
        content.revalidate();
        content.repaint();
    }
}
