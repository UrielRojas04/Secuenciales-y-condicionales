import javax.swing.*;
import java.util.Random;

public class Ejercicio_5 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.*/
        int eleccionUsuario=0;
        int maquina=0;
        int resultado=0;
        String objetoUsuario="";
        String objetoMaquina="";
        Random random=new Random();
        do {
            eleccionUsuario=Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion (1.Piedra  /  2.Papel  /  3.Tijera)"));

        }while (eleccionUsuario<=0 || eleccionUsuario>=4);

        maquina=random.nextInt(3)+1;
        resultado=eleccionUsuario-maquina;
        switch (eleccionUsuario){
            case 1:
                objetoUsuario="Piedra";
                break;
            case 2:
                objetoUsuario="Papel";
                break;
            case 3:
                objetoUsuario="Tijera";
                break;
        }
        switch (maquina){
            case 1:
                objetoMaquina="Piedra";
                break;
            case 2:
                objetoMaquina="Papel";
                break;
            case 3:
                objetoMaquina="Tijera";
                break;
        }
        JOptionPane.showMessageDialog(null,"Tu eleccion: "+objetoUsuario+"\nObjeto rival: "+objetoMaquina);
        switch (resultado){
            case 0:
                JOptionPane.showMessageDialog(null,"Empate");
                break;
            case -1:
                JOptionPane.showMessageDialog(null,"Perdiste");
                break;
            case -2:
                JOptionPane.showMessageDialog(null,"Ganaste");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Ganaste");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Perdiste");
                break;


        }


    }
}
