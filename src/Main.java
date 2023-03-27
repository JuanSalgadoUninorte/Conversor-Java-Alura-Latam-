import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FunctionConvert monedas = new FunctionConvert();
        FunctionConvert medidas = new FunctionConvert();

        boolean flag = true;
        while (flag) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ",
                    "Menú", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conversor de monedas", "Conversor de medidas"}, "Selección")).toString();

            switch (opciones) {
                case "Conversor de monedas":
                    double moneda = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir"));
                    if (ValidarNumero(moneda)) {
                        monedas.ConvertirMonedas(moneda);
                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
                        if (respuesta == JOptionPane.OK_OPTION) {

                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Gracias por preferirnos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inváldo");
                    }
                    break;
                case "Conversor de medidas":
                    double medida = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la medida que deseas convertir"));
                    if (ValidarNumero(medida)) {
                        medidas.ConvertirMedidas(medida);
                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
                        if (respuesta == JOptionPane.OK_OPTION) {

                        } else {
                            flag = false;
                            JOptionPane.showMessageDialog(null, "Gracias por preferirnos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inváldo");
                    }
                    break;
            }
        }
    }

    public static boolean ValidarNumero(double moneda) {
        try {
            if (moneda >= 0 || moneda <= 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}