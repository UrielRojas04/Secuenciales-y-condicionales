import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección. */
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuál es tu genero de pelicula favorita?:  accion / comedia / drama / ciencia ficcion");
        String genero=sc.nextLine();
        String recomendacion="";
        genero=genero.toLowerCase();

        switch (genero){
            case "accion":
                recomendacion=pelicula_accion();
                break;
            case "comedia":
                recomendacion=pelicula_comedia();
                break;
            case "drama":
                recomendacion=pelicula_drama();
                break;
            case "ciencia ficcion":
                recomendacion=pelicula_ciencia_ficcion();
                break;
            default:
                recomendacion="Ingrese un genero valido por favor!!!";
        }
        if (recomendacion.length()==37){
            System.out.println(recomendacion);


        }
        else {
            System.out.println("La pelicula de "+genero+" perfecta para vos es "+recomendacion);
        }



    }
    public  static String pelicula_accion(){
        return "Mision de rescate";
    }
    public static String pelicula_comedia(){
        return "Luna de miel en familia";
    }
    public static String pelicula_drama(){
        return "El secreto de sus ojos";

    }
    public static String pelicula_ciencia_ficcion(){
        return "Los ilusionistas";
    }
}
