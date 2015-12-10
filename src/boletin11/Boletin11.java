package boletin11;

import javax.swing.JOptionPane;

public class Boletin11 {

    public static void main(String[] args) {
        long time_end, time_start;
        time_start = System.currentTimeMillis(); //El metodo pertenece a la clase System
        JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE: \n A documentación é todo aquel conxunto de manuais impresos ou en \n formato dixital que explique unha aplicación informática .");
        JOptionPane.showMessageDialog(null, "PREME ENTER PARA REMATAR");
        time_end = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null,"TARDACHES " + (time_end - time_start) / 1000 + " SEGUNDOS EN ESCRIBIR A FRASE");
        
    }

}
