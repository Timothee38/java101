import external.Marque;
import external.Roue;
import utils.VehiculeStatus;

import java.util.ArrayList;

/**
 * Created by timothee on 20/09/17.
 */
public class Main {
    public static void main(String args[]) throws Exception {
        Marque marqueVoiture = new Marque("Volvo");
        Marque marquePneus = new Marque("Michellin");

        ArrayList<Roue> lesRouesDeMaVoiture = Roue.recupListeRoues(marquePneus, 4, 5);

        Voiture maVoiture = new Voiture(marqueVoiture, lesRouesDeMaVoiture, VehiculeStatus.ARRETE, 5);

    }
}
