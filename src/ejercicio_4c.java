import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad). */
        double peso=0;
        double altura=0;
        double imc=0;
        String recomendacion="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa tu peso en kg: ");
        peso=sc.nextDouble();
        System.out.println("Ingresa tu altura en metros: ");
        altura=sc.nextDouble();
        System.out.println(peso);
        System.out.println(altura);
        imc=peso/(altura*altura);
        System.out.println(imc);
        if (imc<18.5){
            System.out.println("<<<<<Bajo peso>>>>>");
            recomendacion=bajo_peso();
            
        } else if (imc<24.9) {
            System.out.println("<<<<<Peso normal>>>>>");
            recomendacion=peso_normal();
            
        } else if (imc<29.9) {
            System.out.println("<<<<<Sobre peso>>>>>");
            recomendacion=sobrepeso();

        } else if (imc>=30) {
            System.out.println("<<<<<Obesidad>>>>>");
            recomendacion=obesidad();

            
        }
        System.out.println(recomendacion);
    }
    public static String bajo_peso(){
        return "Recomendación: Aumentar la ingesta calórica de manera saludable.\n" +
                "\n" +
                "Alimentos ricos en nutrientes: Incluye más frutos secos, aguacates, y batidos de proteínas en tu dieta.\n" +
                "Ejercicio: Realiza ejercicios de resistencia para ganar masa muscular.\n" +
                "Consulta médica: Habla con un nutricionista para crear un plan de alimentación adecuado.";
    }
    public static String peso_normal(){
        return "Recomendación: Mantener un estilo de vida equilibrado.\n" +
                "\n" +
                "Dieta balanceada: Sigue una dieta rica en frutas, verduras, proteínas magras y granos enteros.\n" +
                "Actividad física: Mantén una rutina de ejercicio regular que incluya cardio y entrenamiento de fuerza.\n" +
                "Chequeos regulares: Realiza chequeos médicos periódicos para asegurarte de que todo está en orden.";

    }
    public static String sobrepeso(){
        return "Recomendación: Adoptar hábitos saludables para perder peso gradualmente.\n" +
                "\n" +
                "Dieta controlada: Reduce el consumo de azúcares y grasas saturadas, y aumenta la ingesta de fibra.\n" +
                "Ejercicio regular: Incorpora al menos 150 minutos de actividad física moderada a la semana.\n" +
                "Apoyo profesional: Considera trabajar con un dietista o entrenador personal para obtener orientación.";

    }
    public static String obesidad(){
        return "Recomendación: Implementar cambios significativos en el estilo de vida.\n" +
                "\n" +
                "Plan de alimentación: Sigue una dieta estructurada y supervisada por un profesional de la salud.\n" +
                "Ejercicio: Comienza con actividades de bajo impacto como caminar o nadar, y aumenta gradualmente la intensidad.\n" +
                "Apoyo médico: Consulta a un médico para evaluar posibles tratamientos adicionales, como terapia conductual o, en algunos casos, cirugía bariátrica.";
    }
}
