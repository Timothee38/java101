package external;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timothee on 18/09/17.
 */
public class Roue {

    private Marque marque;
    private int diametre;

    public Roue(Marque marque, int diametre) {
        this.marque = marque;
        this.diametre = diametre;
    }

    public static ArrayList<Roue> recupListeRoues(Marque marque, int nombreDeRoues, int diametre) throws Exception {
        ArrayList<Roue> nouvellesRoues = new ArrayList<Roue>();

        if(nombreDeRoues <= 0) {
            throw new Exception("Un véhicule doit posséder au moins 1 roue.");
        }

        for(int i = 0; i < nombreDeRoues; i++) {
            nouvellesRoues.add(new Roue(marque, diametre));
        }

        return nouvellesRoues;
    }

}
