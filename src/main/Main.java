package main;

import model.Meteo;
import service.MeteoServiceImpl;

public class Main {

    public static void main (String[] argv) {

        if(argv.length>0){
            String ville = argv[0];
            Meteo meteo = MeteoServiceImpl.getMeteo(ville);
            if(meteo.getVille() == null) {
                System.out.println("/!/ Mauvaise écriture du nom de la ville /!/");
            } else {
                System.out.println(meteo.toString());
            }
        } else {
            System.out.println("/!/ Entrez une ville en argument de ligne de commande /!/");
        }

    }

}
