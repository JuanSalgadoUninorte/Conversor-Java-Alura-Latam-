package Medidas;

import javax.swing.*;

public class ConvertirMedidas {

    public void metroAMilla(double valor){
        double metroMilla = valor / 1609;
        JOptionPane.showMessageDialog(null, "Tienes "+metroMilla+" millas");
    }

    public void millaAMetro(double valor){
        double millaMetro = valor * 1609;
        JOptionPane.showMessageDialog(null, "Tienes "+millaMetro+" metros");
    }

    public void centimetroAPulgada(double valor){
        double pulgadaCentimetro = valor / 2.5;
        JOptionPane.showMessageDialog(null, "Tienes "+pulgadaCentimetro+" pulgadas");
    }

    public void pulgadaACentimetro(double valor){
        double pulgadaCentimetro = valor * 2.5;
        JOptionPane.showMessageDialog(null, "Tienes "+pulgadaCentimetro+" centimetro");
    }

}
