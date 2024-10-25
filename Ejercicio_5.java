import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.*/
        String distancia=JOptionPane.showInputDialog("Ingrese la distancia del viaje en Km: ");
        String consumo=JOptionPane.showInputDialog("Ingrese el consumo de litros de combustible por Km: ");
        String precio=JOptionPane.showInputDialog("Ingrese el precio por litro del combustible: ");
        float km=Float.parseFloat(distancia);
        float c=Float.parseFloat(consumo);
        float p=Float.parseFloat(precio);
        float costo=calcular_costo(km,c,p);
        JOptionPane.showMessageDialog(null,"El costo total del viaje es de $"+costo);


    }
    public static float calcular_costo(float km,float consumo,float precio){

        consumo=consumo*km;
        float costoTotal=consumo*precio;
        return  costoTotal;
    }
}
