/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ort.agenda.utils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author matiasc
 */
public class FontUtils {

    public static final String ROBOTO_CLASSIC_FONT_PATH = "./fonts/Roboto-Regular.ttf";
    public static final String ROBOTO_BOLD_FONT_PATH = "./fonts/Roboto-Bold.ttf";
    public static final String ROBOTO_THIN_FONT_PATH = "./fonts/Roboto-Thin.ttf";
    public static final String ROBOTO_MEDIUM_FONT_PATH = "./fonts/Roboto-Medium.ttf";

    public static Font getCustomFont(String fontName, float fontSize) {
        try {
            InputStream inputStream = getFontInputStream(ROBOTO_CLASSIC_FONT_PATH);
            switch (fontName) {
                case "Roboto-Regular": {
                    inputStream = getFontInputStream(ROBOTO_CLASSIC_FONT_PATH);
                    break;
                }
                case "Roboto-Bold": {
                    inputStream = getFontInputStream(ROBOTO_BOLD_FONT_PATH);
                    break;
                }
                case "Roboto-Thin": {
                    inputStream = getFontInputStream(ROBOTO_THIN_FONT_PATH);
                    break;
                    
                }case "Roboto-Medium": {
                    inputStream = getFontInputStream(ROBOTO_MEDIUM_FONT_PATH);
                    break;
                }
            }
            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);
            GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            genv.registerFont(font);
            font = font.deriveFont(fontSize);
            return font;
        } catch (IOException | FontFormatException ex) {
            //TODO
        }
        return null;
    }

    private static InputStream getFontInputStream(String pathFile) {
        return ClassLoader.getSystemClassLoader().getResourceAsStream(pathFile);
    }
}
