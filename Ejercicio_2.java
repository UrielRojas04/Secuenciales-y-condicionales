import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.*/
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresa tu peso en kg: ");
        float peso;
        peso= lectura.nextFloat();
        System.out.print("Ingresa el tipo de ejercicio (correr/nadar/bicicleta): ");
        String tipoEjercicio= lectura.next();
        System.out.print("Ingresa los minutos del ejercicio: ");
        double enHoras= lectura.nextInt();
        enHoras=enHoras/60;
        System.out.println(enHoras);
        System.out.println("Califica la intensidad aplicada: 1.Lento   2.Moderado   3.Rapido ");
        int intensidad= lectura.nextInt();
        System.out.printf("Peso: "+peso+"\nEjercicio: "+tipoEjercicio+"\nTiempo: "+enHoras+" hs\n");
        tipoEjercicio=tipoEjercicio.toLowerCase();
        double caloriasQuemadas=0;
        switch (tipoEjercicio){
            case "correr":
                caloriasQuemadas=calcular_calorias_correr(peso,enHoras,intensidad);
                break;
            case "nadar":
                caloriasQuemadas=calcular_calorias_nadar(peso,enHoras,intensidad);
                break;
            case "bicicleta":
                caloriasQuemadas=calcular_calorias_bicicleta(peso,enHoras,intensidad);
                break;
            default:
                System.out.println("Error¡¡¡ Ingrese alguna de las opciones dadas");
        }
        System.out.print("Calorias quemadas: "+caloriasQuemadas);
    }

    public static double calcular_calorias_correr(float peso,double horas,int intensidad){
        float met=0;
        double resultado;
        switch (intensidad){
            case 1:
                met=8.3f;
                break;
            case 2:
                met=11.5f;
                break;
            case 3:
                met=14.5f;
                break;

        }
        resultado=met*peso*horas;
        return resultado;

    }
    public  static  double calcular_calorias_nadar(float peso,double horas,int intensidad){

        float met=0;
        double resultado;
        switch (intensidad){
            case 1:
                met=4.8f;
                break;
            case 2:
                met=5.8f;
                break;
            case 3:
                met=9;
                break;
        }
        resultado=met*peso*horas;
        return  resultado;
    }
    public static  double calcular_calorias_bicicleta(float peso,double horas,int intensidad){
        float met=0;
        double resultado;
        switch (intensidad){
            case 1:
                met=4;
                break;
            case 2:
                met=6.8f;
                break;
            case 3:
                met=8;
                break;

        }
        resultado=met*peso*horas;
        return  resultado;
    }
}
