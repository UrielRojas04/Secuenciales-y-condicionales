import javax.swing.*;

public class Ejercicio_6 {
    public static void main(String[] args) {
        /*Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.*/
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas al dia que puede estudiar: "));
        int prioridad = Integer.parseInt(JOptionPane.showInputDialog("¿A qué materia desea darle mas prioridad? (1.Matematica / 2.Lengua / 3.Fisica)"));

        switch (horas) {
            case 1:
                switch (prioridad) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Matematica!!!");
                        crear_plan_1h(prioridad);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Lengua!!!");
                        crear_plan_1h(prioridad);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Fisica!!!");
                        crear_plan_1h(prioridad);
                        break;
                }
                break;
            case 2:
                switch (prioridad) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Matematica!!!");
                        crear_plan_2h(prioridad);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Lengua!!!");
                        crear_plan_2h(prioridad);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Fisica!!!");
                        crear_plan_2h(prioridad);
                        break;
                }
                break;
            case 3:
                switch (prioridad) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Matematica!!!");
                        crear_plan_3h(prioridad);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Lengua!!!");
                        crear_plan_3h(prioridad);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Fisica!!!");
                        crear_plan_3h(prioridad);
                        break;
                }
                break;
            case 4:
                switch (prioridad) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Matematica!!!");
                        crear_plan_4h(prioridad);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Lengua!!!");
                        crear_plan_4h(prioridad);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "<<<<PLAN DE ESTUDIO>>>>\nPrioridad Fisica!!!");
                        crear_plan_4h(prioridad);
                        break;
                }

        }
    }

    public static void crear_plan_1h(int prioridad) {
        switch (prioridad) {
            case 1:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Matemáticas: 40 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Matemáticas: 40 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Matemáticas: 40 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Matemáticas: 40 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Matemáticas: 40 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "Física: 10 minutos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Lengua: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Lengua: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Lengua: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Lengua: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Física: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Lengua: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Física: 10 minutos");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Física: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Física: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Física: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Física: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Lengua: 10 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Física: 40 minutos\n" +
                        "Matemáticas: 10 minutos\n" +
                        "Lengua: 10 minutos");
                break;
        }


    }

    public static void crear_plan_2h(int prioridad) {
        switch (prioridad) {
            case 1:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Matemáticas: 1 hora y 10 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Matemáticas: 1 hora y 10 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Matemáticas: 1 hora y 10 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Matemáticas: 1 hora y 10 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Matemáticas: 1 hora y 10 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "Física: 20 minutos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Lengua: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Lengua: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Lengua: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Lengua: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Física: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Lengua: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Física: 20 minutos\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Fisica: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Lengua: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Fisica: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Lengua: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Fisica: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Lengua: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Fisica: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Lengua: 20 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Fisica: 1 hora y 10 minutos\n" +
                        "Matematica: 30 minutos\n" +
                        "Lengua: 20 minutos\n");
                break;


        }
    }

    public static void crear_plan_3h(int prioridad) {
        switch (prioridad) {
            case 1:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Matemáticas: 1 hora y 40 minutos\n" +
                        "Lengua: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Matemáticas: 1 hora y 40 minutos\n" +
                        "Lengua: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Matemáticas: 1 hora y 40 minutos\n" +
                        "Lengua: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Matemáticas: 1 hora y 40 minutos\n" +
                        "Lengua: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Matemáticas: 1 hora y 40 minutos\n" +
                        "Lengua: 50 minutos\n" +
                        "Física: 30 minutos\n");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Lengua: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Lengua: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Lengua: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Lengua: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Física: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Lengua: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Física: 30 minutos\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "<<<LUNES>>>\n" +
                        "Fisica: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Fisica: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Fisica: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Fisica: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Lengua: 30 minutos\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Fisica: 1 hora y 40 minutos\n" +
                        "Matematica: 50 minutos\n" +
                        "Lengua: 30 minutos\n");
                break;


        }
    }
    public static void crear_plan_4h(int prioridad){
        switch (prioridad){
            case 1:
                JOptionPane.showMessageDialog(null,"<<<LUNES>>>\n" +
                        "Hora 1-2: Matemática (Teoría y ejercicios)\n" +
                        "Hora 3: Lengua (Lectura y comprensión)\n" +
                        "Hora 4: Física (Teoría)\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Hora 1-2: Matemática (Resolución de problemas)\n" +
                        "Hora 3: Lengua (Escritura y redacción)\n" +
                        "Hora 4: Física (Ejercicios prácticos)\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Hora 1-2: Matemática (Repaso y ejercicios adicionales)\n" +
                        "Hora 3: Lengua (Gramática y ortografía)\n" +
                        "Hora 4: Física (Teoría)\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Hora 1-2: Matemática (Teoría avanzada y ejercicios)\n" +
                        "Hora 3: Lengua (Literatura y análisis de textos)\n" +
                        "Hora 4: Física (Ejercicios prácticos)\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Hora 1-2: Matemática (Repaso y resolución de problemas)\n" +
                        "Hora 3: Lengua (Escritura creativa)\n" +
                        "Hora 4: Física (Teoría y ejercicios)");
                break;
            case  2:
                JOptionPane.showMessageDialog(null,"<<<LUNES>>>\n" +
                        "Hora 1-2: Lengua (Lectura y comprension)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Física (Teoría)\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Hora 1-2: Lengua (Lectura y comprension)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Física (Teoría)\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Hora 1-2: Lengua (Lectura y comprension)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Física (Teoría)\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Hora 1-2: Lengua (Lectura y comprension)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Física (Teoría)\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Hora 1-2: Lengua (Lectura y comprension)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Física (Teoría)\n");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"<<<LUNES>>>\n" +
                        "Hora 1-2: Fisica (Teoria)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Lengua (Lectura y comprension)\n" +
                        "------------------------\n" +
                        "<<<MARTES>>>\n" +
                        "Hora 1-2: Fisica (Teoria)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Lengua (Lectura y comprension)\n" +
                        "------------------------\n" +
                        "<<<MIERCOLES>>>\n" +
                        "Hora 1-2: Fisica (Teoria)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Lengua (Lectura y comprension)\n" +
                        "------------------------\n" +
                        "<<<JUEVES>>>\n" +
                        "Hora 1-2: Fisica (Teoria)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Lengua (Lectura y comprension)\n" +
                        "------------------------\n" +
                        "<<<VIERNES>>>\n" +
                        "Hora 1-2: Fisica (Teoria)\n" +
                        "Hora 3: Matemática (Teoría y ejercicios)\n" +
                        "Hora 4: Lengua (Lectura y comprension)\n");
                break;


        }
    }
}
