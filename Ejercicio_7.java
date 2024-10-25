import javax.swing.*;

public class Ejercicio_7 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.*/
        float felicidad=Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 ¿Qué tan feliz sos?: "));
        float estres=Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 ¿Qué tan estresado estas?: "));
        float salud=Integer.parseInt(JOptionPane.showInputDialog("Del 1 al 10 ¿Qué tan saludable estas?: "));
        float suma=0;
        estres=estres/3;
        suma=felicidad+salud-estres;
        float indiceFelicidad=suma/2;
        JOptionPane.showMessageDialog(null,"Del 1 al 10 tu indice de felicidad es: "+indiceFelicidad);
    }
}
