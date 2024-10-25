import javax.swing.*;

public class Ejercicio_7 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.*/
        String estado="";
        String recomendacion="";
        estado= JOptionPane.showInputDialog("Ingresa tu estado de animo (feliz / triste / relajado / energico)");
        estado=estado.toLowerCase();
        switch (estado){
            case "feliz":
                recomendacion=actividad_feliz();
                break;
            case "triste":
                recomendacion=actividad_triste();
                break;
            case "relajado":
                recomendacion=actividad_relajado();
                break;
            case "energico":
                recomendacion=actividad_energico();
                break;
            default:
                recomendacion="Ingresa un estado valido";
        }
        JOptionPane.showMessageDialog(null,recomendacion);

    }
    public static  String actividad_feliz(){
        return "Feliz\n" +
                "Bailar: Cuando te sientes feliz, bailar es una excelente manera de expresar esa alegría. Puedes poner tu música favorita y dejarte llevar por el ritmo" +
                ". Bailar no solo mejora tu estado de ánimo, sino que también es una buena forma de ejercicio";
    }
    public static String actividad_triste(){
        return "Triste\n" +
                "Escribir en un diario: Si te sientes triste, escribir tus pensamientos y sentimientos en un diario puede ser muy terapéutico." +
                " Te ayuda a procesar tus emociones y a entender mejor lo que estás sintiendo. Además, puede ser un buen momento para reflexionar y encontrar soluciones a lo que te preocupa.\n" +
                "\n";

    }
    public static String actividad_relajado(){
        return "Relajado\n" +
                "Meditación: Si te sientes relajado, la meditación puede ayudarte a profundizar ese estado de calma. Encuentra un lugar tranquilo, siéntate cómodamente y" +
                " concéntrate en tu respiración. La meditación puede reducir el estrés y mejorar tu bienestar general";
    }
    public static String actividad_energico(){
        return "Energico\n" +
                "Hacer ejercicio: Cuando te sientes lleno de energía, hacer ejercicio es una excelente manera de canalizar esa vitalidad. Puedes ir a correr, hacer una sesión de entrenamiento en el gimnasio o practicar un deporte que te guste." +
                " El ejercicio no solo te ayuda a mantenerte en forma, sino que también libera endorfinas, lo que mejora aún más tu estado de ánimo.";
    }
}
