/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author matiasc
 */
public class ImageUtils {

    public static JLabel getJLabelImage(String imageName) {
        URL url = ClassLoader.getSystemClassLoader().getResource("./images/" + imageName);
        try {
            BufferedImage myPicture = ImageIO.read(new File(url.getPath()));
            return new JLabel(new ImageIcon(myPicture));
        } catch (IOException ex) {
            Logger.getLogger(ImageUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
