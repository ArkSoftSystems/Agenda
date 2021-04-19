/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.ui.components;

import com.ort.agenda.utils.ImageUtils;
import java.awt.Color;
import javax.swing.JWindow;

/**
 *
 * @author matiasc
 */
public class CustomSplashScreen {

    private static final Color BACKGROUND_SLASH_COLOR = new Color(29, 29, 29);
    private static final String SPLASH_IMAGE = "splash-5.png";

    public void renderSplashFrame() {
        JWindow window = new JWindow();
        window.getContentPane().add(ImageUtils.getJLabelImage(SPLASH_IMAGE));
        window.setBounds(700, 500, 700, 400);
        window.setLocationRelativeTo(null);
        window.repaint();
        window.setVisible(true);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        window.setVisible(false);
    }

    public static void main(String args[]) {
        CustomSplashScreen test = new CustomSplashScreen();
        test.renderSplashFrame();
    }

}
