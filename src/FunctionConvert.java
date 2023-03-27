import Medidas.ConvertirMedidas;
import Monedas.ConvertirMonedas;

import javax.swing.*;

public class FunctionConvert {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirMedidas medidas = new ConvertirMedidas();

    public void ConvertirMedidas(double valor0) {
        String opcion0 = (JOptionPane.showInputDialog(null, "Elije la medida a la que deseas convertir",
                "Medidas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Metro a Milla", "Milla a Metro", "Centímetro a Pulgada", "Pulgada a Centímetro"}, "Selección")).toString();
        switch (opcion0) {
            case "Metro a Milla":
                medidas.metroAMilla(valor0);
                break;
            case "Milla a Metro":
                medidas.millaAMetro(valor0);
                break;
            case "Centímetro a Pulgada":
                medidas.centimetroAPulgada(valor0);
                break;
            case "Pulgada a Centímetro":
                medidas.pulgadaACentimetro(valor0);
                break;
        }
    }

        public void ConvertirMonedas(double valor){
            String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir el dinero",
                    "Monedas", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Pesos a Dólar", "Dólar a Pesos", "Pesos a Euros", "Euros a Pesos"}, "Selección")).toString();
            switch (opcion) {
                case "Pesos a Dólar":
                    monedas.pesosADolares(valor);
                    break;
                case "Dólar a Pesos":
                    monedas.dolaresAPesos(valor);
                    break;
                case "Euros a Pesos":
                    monedas.eurosAPesos(valor);
                    break;
                case "Pesos a Euros":
                    monedas.pesosAEuros(valor);
                    break;
            }

        }

    }
