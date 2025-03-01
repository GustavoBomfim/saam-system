/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.util;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author gustavo
 */
public class ValidadorEmail {
    
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean validarEmail(String email) {

        if (PATTERN.matcher(email).matches()){
            return true;
        }
        
        JOptionPane.showMessageDialog(null, "Formato de e-mail inválido");
        return false;
    }
}
