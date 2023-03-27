package Monedas;

import javax.swing.*;

public class ConvertirMonedas {

    public void dolaresAPesos(double valor){
        double monedaPesos = valor * 4773.00;
        monedaPesos = (double) Math.round(monedaPesos*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+monedaPesos+" Pesos");
    }

    public void pesosADolares(double valor){
        double monedaDolar = valor / 4773.00;
        monedaDolar = (double) Math.round(monedaDolar*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+monedaDolar+" Dólares");
    }

    public void eurosAPesos(double valor){
        double monedaPesos = valor * 5189.85;
        monedaPesos = (double) Math.round(monedaPesos*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+monedaPesos+" pesos");
    }

    public void pesosAEuros(double valor){
        double monedaEuro = valor / 5189.85;
        monedaEuro = (double) Math.round(monedaEuro*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes "+monedaEuro+"€ Euros");
    }

}
