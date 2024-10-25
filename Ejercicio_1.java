import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Ejercicio_1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String birthDateStr = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = dateFormat.parse(birthDateStr);

            int day = birthDate.getDate();
            int month = birthDate.getMonth() + 1; // getMonth() devuelve un valor de 0 a 11
            System.out.println(month);

            String zodiacSign = getZodiacSign(day, month);
            String horoscopeMessage = getHoroscopeMessage(zodiacSign);

            System.out.println("Su signo del zodiaco es: " + zodiacSign);
            System.out.println("Mensaje de horóscopo: " + horoscopeMessage);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Por favor, use el formato DD/MM/AAAA.");
        }
    }

    private static String getZodiacSign(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Géminis";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cáncer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricornio";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    private static String getHoroscopeMessage(String zodiacSign) {
        switch (zodiacSign) {
            case "Aries":
                return "Hoy es un día lleno de energía y entusiasmo para ti.";
            case "Tauro":
                return "Disfruta de la estabilidad y la paz que te rodea.";
            case "Géminis":
                return "Es un buen momento para comunicarte y expresar tus ideas.";
            case "Cáncer":
                return "Conéctate con tus emociones y cuida de tus seres queridos.";
            case "Leo":
                return "Brilla con toda tu fuerza y liderazgo.";
            case "Virgo":
                return "Organiza tus tareas y mantén el orden en tu vida.";
            case "Libra":
                return "Busca el equilibrio y la armonía en tus relaciones.";
            case "Escorpio":
                return "Explora tus pasiones y misterios internos.";
            case "Sagitario":
                return "Aprovecha tu espíritu aventurero y explora nuevos horizontes.";
            case "Capricornio":
                return "Trabaja duro y mantén la disciplina para alcanzar tus metas.";
            case "Acuario":
                return "Innova y comparte tus ideas únicas con el mundo.";
            case "Piscis":
                return "Deja fluir tu creatividad y empatía.";
            default:
                return "Mensaje de horóscopo no disponible.";
        }
    }

}




