/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.utils;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author matiasc
 */
public class FieldUtils {

    private static final String REGULAR_FONT = "Roboto-Regular";
    private static final Color COLOR_ALERT_WARN = new Color(244, 244, 244);

    public static JLabel addWarningMessage(String alertMessage) {
        JLabel label = new JLabel(alertMessage);
        label.setForeground(COLOR_ALERT_WARN);
        label.setFont(FontUtils.getCustomFont(REGULAR_FONT, 12f));
        return label;
    }
    
    public static void cleanJLabel(JLabel jLabel){
        jLabel.setText("");
    }

}
