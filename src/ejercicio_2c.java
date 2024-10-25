import javax.swing.*;
import java.util.Locale;

public class Ejercicio_2 {
    public static void main(String[] args) {
       /*Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.*/
        float precio=0;
        String categoria="";
        precio=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
        categoria=JOptionPane.showInputDialog("Ingrese su categoria (estudiante / adulto / jubilado): ");
        categoria=categoria.toLowerCase();
       float descuento=0;
        switch (categoria){
            case "estudiante":
                descuento= (float) (precio*0.10);
                JOptionPane.showMessageDialog(null,"Descuento del %10");
                break;
            case "adulto":
                descuento= (float) (precio*0.05);
                JOptionPane.showMessageDialog(null,"Descuento del %5");
                break;
            case "jubilado":
                descuento= (float) (precio*0.15);
                JOptionPane.showMessageDialog(null,"Descuento del %15");
                break;

        }
        JOptionPane.showMessageDialog(null,"El descuento aplicado es de $"+descuento+" .El total del producto es $"+(precio-descuento));

    }
}
