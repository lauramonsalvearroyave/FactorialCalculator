package com.mycompany.factorialcalculator_or;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class FactorialCalculator_or {

    public static void main(String[] args) {
        int factorial=1;
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para conocer su factorial"));
        for (int i=1; i<=numero; i++)
        {factorial*=i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero+ "es: "+ factorial);
    }
}
