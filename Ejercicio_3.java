import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.*/
        Scanner sc=new Scanner(System.in);
        int cond=0;
        System.out.println("Ingrese su nivel de condicion fisica: 1.Principiante    2.Intermedio    3.Avanzado");
        cond= sc.nextInt();
        switch (cond){
            case 1:
                System.out.println("<<<RUTINA PRINCIPIANTE>>>");
                rutina_principiante();
                break;
            case 2:
                System.out.println("<<<<<<RUTINA INTERMEDIO>>>>>>");
                rutina_intermedio();
                break;
            case 3:
                System.out.println("<<<<<<<<<<<<<<RUTINA AVANZADO>>>>>>>>>>>>>>");
                rutina_avanzado();
                break;
        }


    }
    public static void rutina_principiante(){
        System.out.println("Lunes: Cuerpo Completo\n" +
                "Sentadillas - 3 series de 12 repeticiones\n" +
                "Flexiones - 3 series de 10 repeticiones\n" +
                "Remo con mancuernas - 3 series de 12 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Martes: Cardio\n" +
                "Caminata rápida o trote - 30 minutos\n" +
                "Saltos de tijera - 3 series de 20 repeticiones\n" +
                "Burpees - 3 series de 10 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Miércoles: Descanso o Estiramientos\n" +
                "Estiramientos de cuerpo completo - 20 minutos");
        System.out.println("--------------------------------------------");
        System.out.println("Jueves: Cuerpo Superior\n" +
                "Press de banca con mancuernas - 3 series de 12 repeticiones\n" +
                "Elevaciones laterales - 3 series de 15 repeticiones\n" +
                "Curl de bíceps - 3 series de 12 repeticiones\n" +
                "Fondos en banco - 3 series de 10 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Viernes: Cardio\n" +
                "Bicicleta estática o elíptica - 30 minutos\n" +
                "Mountain climbers - 3 series de 20 repeticiones\n" +
                "Jump squats - 3 series de 15 repeticiones");




    }
    public  static  void rutina_intermedio(){
        System.out.println("Lunes: Cuerpo Completo\n" +
                "Sentadillas con barra - 4 series de 10 repeticiones\n" +
                "Press de banca - 4 series de 10 repeticiones\n" +
                "Remo con barra - 4 series de 10 repeticiones\n" +
                "Plancha con elevación de pierna - 3 series de 30 segundos por pierna");
        System.out.println("--------------------------------------------");
        System.out.println("Martes: Cardio y Core\n" +
                "Correr o trotar - 30-45 minutos\n" +
                "Mountain climbers - 4 series de 20 repeticiones\n" +
                "Russian twists - 4 series de 20 repeticiones\n" +
                "Bicicleta abdominal - 4 series de 20 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Miércoles: Cuerpo Superior\n" +
                "Press militar con mancuernas - 4 series de 12 repeticiones\n" +
                "Dominadas - 4 series de 8-10 repeticiones\n" +
                "Fondos en paralelas - 4 series de 10 repeticiones\n" +
                "Curl de bíceps con barra - 4 series de 12 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Jueves: Cardio y Piernas\n" +
                "Bicicleta estática o elíptica - 30-45 minutos\n" +
                "Zancadas con mancuernas - 4 series de 12 repeticiones por pierna\n" +
                "Peso muerto rumano - 4 series de 12 repeticiones\n" +
                "Elevaciones de talones - 4 series de 15 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Viernes: Cuerpo Inferior\n" +
                "Sentadillas búlgaras - 4 series de 12 repeticiones por pierna\n" +
                "Prensa de pierna - 4 series de 12 repeticiones\n" +
                "Curl de pierna - 4 series de 12 repeticiones\n" +
                "Puente de glúteos con barra - 4 series de 15 repeticiones");

    }
    public  static void rutina_avanzado(){
        System.out.println("Lunes: Pecho y Tríceps\n" +
                "Press de banca con barra - 4 series de 8-10 repeticiones\n" +
                "Press inclinado con mancuernas - 4 series de 10-12 repeticiones\n" +
                "Fondos en paralelas con peso - 4 series de 10-12 repeticiones\n" +
                "Aperturas con mancuernas - 4 series de 12-15 repeticiones\n" +
                "Extensiones de tríceps en polea - 4 series de 12-15 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Martes: Espalda y Bíceps\n" +
                "Dominadas lastradas - 4 series de 8-10 repeticiones\n" +
                "Remo con barra - 4 series de 8-10 repeticiones\n" +
                "Peso muerto - 4 series de 6-8 repeticiones\n" +
                "Remo con mancuernas - 4 series de 10-12 repeticiones\n" +
                "Curl de bíceps con barra - 4 series de 10-12 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Miércoles: Piernas\n" +
                "Sentadillas con barra - 4 series de 8-10 repeticiones\n" +
                "Prensa de pierna - 4 series de 10-12 repeticiones\n" +
                "Peso muerto rumano - 4 series de 10-12 repeticiones\n" +
                "Zancadas con mancuernas - 4 series de 12 repeticiones por pierna\n" +
                "Elevaciones de talones - 4 series de 15-20 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Jueves: Hombros y Abdominales\n" +
                "Press militar con barra - 4 series de 8-10 repeticiones\n" +
                "Elevaciones laterales con mancuernas - 4 series de 12-15 repeticiones\n" +
                "Elevaciones frontales con mancuernas - 4 series de 12-15 repeticiones\n" +
                "Encogimientos de hombros con barra - 4 series de 10-12 repeticiones\n" +
                "Plancha con peso - 4 series de 1 minuto\n" +
                "Levantamiento de piernas colgado - 4 series de 15 repeticiones");
        System.out.println("--------------------------------------------");
        System.out.println("Viernes: Cardio de Alta Intensidad (HIIT)\n" +
                "Sprints en cinta o al aire libre - 10 series de 30 segundos de sprint con 1 minuto de descanso\n" +
                "Burpees - 4 series de 15 repeticiones\n" +
                "Mountain climbers - 4 series de 20 repeticiones por pierna\n" +
                "Saltos de caja - 4 series de 12 repeticiones");

    }
}
