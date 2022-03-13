package expedicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class Feec {

    private String nom;

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        preguntarDesicio();
        int desicio = lec.nextInt();

        ArrayList<Membre> GuardarMembres = new ArrayList();
        ArrayList GuardarExpedicio = new ArrayList();


        while (desicio != 7) {
            switch (desicio) {
                case 1:
                    //ALTA MEMBRE
                    Membre membre = (Membre) CrearMembre();
                    GuardarMembres.add(membre);
                    preguntarDesicio();
                    desicio = lec.nextInt();
                    break;


                case 2:
                    //ALTA EXPEDICIO
                    Expedicio expedicio = (Expedicio) CrearExpedicio();
                    GuardarExpedicio.add(expedicio);
                    preguntarDesicio();
                    desicio = lec.nextInt();
                    break;

                case 3:
                    //BAIXA MEMBRE
                    BaixaMembre(GuardarMembres);
                    preguntarDesicio();
                    desicio = lec.nextInt();
                    break;

                case 4:
                    //BAIXA Expedicio
                    BaixaExpedicio(GuardarExpedicio);
                    preguntarDesicio();
                    desicio = lec.nextInt();
                    break;
                case 5:

                    break;
                case 6:
                    for (int i = 0; i < GuardarMembres.size(); i++) {
                        System.out.println(GuardarMembres.get(i).toString());
                    }
                    preguntarDesicio();
                    desicio = lec.nextInt();
                    break;
            }


        }

    }


    public static Object CrearMembre() {

        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu el nom del membre");
        String nom = lec.next();
        System.out.println("Escriu l'edat");
        int edat = lec.nextInt();
        System.out.println("Nivell d'escalada");
        int escalada = lec.nextInt();
        System.out.println("Nivell d'esqui");
        int esqui = lec.nextInt();
        System.out.println("Nivell d'alpinisme");
        int alpinisme = lec.nextInt();


        Membre membreCreat = new Membre(nom, edat, escalada, esqui, alpinisme);

        return membreCreat;
    }

    public static Object CrearExpedicio() {

        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu el nom de la expedicio");
        String nom = lec.next();
        int edat = lec.nextInt();
        int subvencionable = lec.nextInt();

        LocalDate data = LocalDate.now();
        int horaEntrada = Calendar.HOUR;


        Expedicio expedicioCreada = new Expedicio(nom, data, edat, subvencionable);

        return expedicioCreada;
    }

    public static ArrayList BaixaMembre(ArrayList<Membre> GuardarMembres) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu el nom del membre que vols donar de baixa");
        String nom = lec.next();

        for (int i = 0; i < GuardarMembres.size(); i++) {

            String nomObjecte = GuardarMembres.get(i).getNom();

            if (nomObjecte.equals(nom)) {
                System.out.println("si esta");
                GuardarMembres.remove(i);
            }


        }
        return GuardarMembres;
    }

    public static ArrayList BaixaExpedicio(ArrayList GuardarExpedicio) {
        Scanner lec = new Scanner(System.in);
        System.out.println("Escriu el nom de l'expedicio que vols donar de baixa");
        String nom = lec.next();
        if (GuardarExpedicio.contains(nom)) { // SI EL ARRAY CONTE EL NOM
            GuardarExpedicio.remove(1); // FALTA ELIMINAR EL INDEX CORRECTE
        }
        return GuardarExpedicio;
    }

    public static ArrayList GuardarSubvencio(ArrayList<Membre> GuardarMembres, ArrayList<Membre> GuardarExpedicions) {
        Scanner lec = new Scanner(System.in);

        ArrayList GuardarSub = new ArrayList();

        System.out.println("Quin membre ets donam el teu nom");
        String nom = lec.next();

        for (int i = 0; i < GuardarMembres.size(); i++) {
            if (GuardarMembres.get(i).getNom().equals(nom)){
                GuardarSub.add(GuardarMembres.get(i).getNom());
            }
        }

        System.out.println("Digues en quina expedicio vas");
        String expedicio = lec.next();
        for (int i = 0; i < GuardarMembres.size(); i++) {
            if (GuardarExpedicions.get(i).getNom().equals(nom)){
                GuardarSub.add(GuardarExpedicions.get(i).getNom());
            }
        }


        return GuardarSub;

    }

    public static void preguntarDesicio() {
        System.out.println("Qina opcio vols escollir ara? Escull 1 afegeix nou membre, 2 afegeix una nova expedicio," +
                "3 baixa mmembre, 4 baixa expedicio, 5  Solicitar subvencio  , 6-  Mostrar tots els membres, 7 Sortir del programa ");
    }

}