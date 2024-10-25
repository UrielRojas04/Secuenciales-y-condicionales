import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int animo=0;
        ArrayList<String> lista_canciones=new ArrayList<>(10);
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa segun tu estado de animo: 1.Feliz   2.Triste   3.Energico    4.Relajado");
        animo=sc.nextInt();
        switch (animo){
            case 1:
                System.out.println("<<<<<<<<Canciones Felices>>>>>>>>");
                lista_canciones=llenar_lista_feliz();
                break;
            case 2:
                System.out.println("<<<<<<<<Canciones Tristes>>>>>>>>");
                lista_canciones=llenar_lista_triste();
                break;
            case 3:
                System.out.println("<<<<<<<<Canciones Energicas>>>>>>>>");
                lista_canciones=llenar_lista_energica();
                break;
            case 4:
                System.out.println("<<<<<<<<Canciones Relajadas>>>>>>>>");
                lista_canciones=llenar_lista_relajada();
                break;
        }




        for (String canciones:lista_canciones){
            System.out.println(canciones);
        }

    }
    public static ArrayList<String> llenar_lista_feliz(){
        ArrayList<String> lista_feliz=new ArrayList<>();
        lista_feliz.add("Happy by Pharrell Williams");
        lista_feliz.add("Don't Stop Me Now by Queen");
        lista_feliz.add("Good Life by OneRepublic");
        lista_feliz.add("Walking on Sunshine by Katrina and the Waves");
        lista_feliz.add("Can't Stop the Feeling! by Justin Timberlake");
        lista_feliz.add("I Gotta Feeling by The Black Eyed Peas");
        lista_feliz.add("Uptown Funk by Mark Ronson ft. Bruno Mars");
        lista_feliz.add("Shake It Off by Taylor Swift");
        lista_feliz.add("Best Day of My Life by American Authors");
        lista_feliz.add("On Top of the World by Imagine Dragons");
        return lista_feliz;
    }
    public static ArrayList<String> llenar_lista_triste(){
        ArrayList<String> lista_triste=new ArrayList<>();
        lista_triste.add("Someone Like You by Adele");
        lista_triste.add("Fix You by Coldplay");
        lista_triste.add("Hurt by Johnny Cash");
        lista_triste.add("Yesterday by The Beatles");
        lista_triste.add("Everybody Hurts by R.E.M.");
        lista_triste.add("Mad World by Gary Jules");
        lista_triste.add("The Sound of Silence by Simon & Garfunkel");
        lista_triste.add("Tears in Heaven by Eric Clapton");
        lista_triste.add("Unchained Melody by The Righteous Brothers");
        lista_triste.add("My Immortal by Evanescence");
        return lista_triste;
    }
    public static ArrayList<String> llenar_lista_energica(){
        ArrayList<String> lista_energica = new ArrayList<>();
        lista_energica.add("Eye of the Tiger - Survivor");
        lista_energica.add("Uptown Funk - Mark Ronson ft. Bruno Mars");
        lista_energica.add("Turn Down for What - DJ Snake & Lil Jon");
        lista_energica.add("Don't Start Now - Dua Lipa");
        lista_energica.add("Levitating - Dua Lipa");
        lista_energica.add("Can't Hold Us - Macklemore & Ryan Lewis");
        lista_energica.add("On Top of the World - Imagine Dragons");
        lista_energica.add("Shake It Off - Taylor Swift");
        lista_energica.add("Happy - Pharrell Williams");
        lista_energica.add("Good Feeling - Flo Rida");
        return lista_energica;
    }
    public static ArrayList<String> llenar_lista_relajada(){
        ArrayList<String> lista_relajada=new ArrayList<>();
        lista_relajada.add("Weightless - Marconi Union");
        lista_relajada.add("Clair de Lune - Claude Debussy");
        lista_relajada.add("The Sound of Silence - Simon & Garfunkel");
        lista_relajada.add("Spiegel im Spiegel - Arvo Pärt");
        lista_relajada.add("Nocturne Op. 9 No. 2 - Frédéric Chopin");
        lista_relajada.add("Luna - Alhambra");

        lista_relajada.add("El Mar - Niño Josele");
        lista_relajada.add("Canción del Mar - Mercedes Sosa");
        lista_relajada.add("Agua de Beber - Astrud Gilberto");
        lista_relajada.add("Sueño - Buika");
        return lista_relajada;
    }
}
