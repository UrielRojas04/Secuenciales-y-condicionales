import javax.swing.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.*/
        String genero="";
        genero= JOptionPane.showInputDialog("¿Cuál es tu género de libro favorito? (fantasia / misterio / romance / ciencia ficcion)");
        genero=genero.toLowerCase();
        String recomendacion="";
        switch (genero){
            case "fantasia":
                recomendacion=libro_fantasia();
                break;
            case "misterio":
                recomendacion=libro_misterio();
                break;
            case "romance":
                recomendacion=libro_romance();
                break;
            case "ciencia ficcion":
                recomendacion=libro_ciencia_ficcion();
                break;
            default:
                recomendacion="Ingresa un género valido por favor!!!";

        }
        if (recomendacion.length()==37){
            JOptionPane.showMessageDialog(null,recomendacion);
        }
        else {
            JOptionPane.showMessageDialog(null,"El libro de "+genero+" perfecto para vos es "+recomendacion);
        }

    }
    public static String libro_fantasia(){
        return "El Nombre del Viento de Patrick Rothfuss:";

    }
    public static String libro_misterio(){
        return "El Guardián Invisible de Dolores Redondo";

    }
    public static String libro_romance(){
        return "En los zapatos de Valeria de Elísabet Benavent";

    }
    public static String libro_ciencia_ficcion(){
        return "Fahrenheit 451 de Ray Bradbury";
    }
}
