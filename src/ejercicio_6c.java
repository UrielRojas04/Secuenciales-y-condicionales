import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos.*/
       int horasSueño=0;
       int minEjercicio=0;
       float horasEjercicio=0;
       int comidasSaludables=0;
       Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa tus horas de sueño: ");
        horasSueño=sc.nextInt();
        System.out.println("Ingresa cuantos minutos al dia haces ejercicio: ");
        minEjercicio=sc.nextInt();
        horasEjercicio=(float) minEjercicio/60;
        System.out.println("Ingresa cuantas comidas saludables consumis por dia:");
        comidasSaludables=sc.nextInt();
        System.out.println("<<<<<<EVALUACION HORAS DE SUEÑO>>>>>>\n.Tus horas de sueño: "+horasSueño);
        if (horasSueño<=5){
            System.out.println("--MAL--\n.Las horas de sueño recomendables son entre 7 y 8");

        } else if (horasSueño<=6) {
            System.out.println("--NO ESTA MAL--\n.Las horas de sueño recomendables son entre 7 y 8");

        } else if (horasSueño<=8) {
            System.out.println("¡¡EXELENTE!!\n.Las horas de sueño recomendables son entre 7 y 8");

        } else if (horasSueño>8) {
            System.out.println("--DEMASIADO--\n.Las horas de sueño recomendables son entre 7 y 8");

        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("<<<<<<EVALUACION HORAS DE EJERCICIO>>>>>>\n.Tus minutos de ejercicio: "+minEjercicio+" min");
        if (horasEjercicio<=1){
            System.out.println("--POR ALGO SE EMPIEZA--\n.Las horas de ejercicio recomendadas son entre 1:30 y 2 hs");
        } else if (horasEjercicio<=2) {
            System.out.println("¡¡MUY BIEN!!\n.Las horas de ejercicio recomendadas son entre 1:30 y 2 hs");

        } else if (horasEjercicio>2) {
            System.out.println("--DEMASIADO--\n.Las horas de ejercicio recomendadas son entre 1:30 y 2 hs");

        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("<<<<<<EVALUACION DE COMIDAS AL DIA>>>>>>\n.Tus comidas al dia: "+comidasSaludables);
        if (comidasSaludables<=3){
            System.out.println("--POCO--\n.Recomendación: Desayuno, almuerzo, cena y 1-2 colaciones (media mañana y media tarde).");
        } else if (comidasSaludables<=5) {
            System.out.println("¡¡EXELENTE!!\n.Recomendación: Desayuno, almuerzo, cena y 1-2 colaciones (media mañana y media tarde).");

        } else if (comidasSaludables>5) {
            System.out.println("--DEMASIADO--\n.Recomendación: Desayuno, almuerzo, cena y 1-2 colaciones (media mañana y media tarde).");

        }

    }
}
