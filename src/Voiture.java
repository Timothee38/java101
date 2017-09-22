import external.Marque;
import external.Roue;
import utils.VehiculeStatus;

import java.util.List;

/**
 * Created by timothee on 18/09/17.
 */
public class Voiture {

    // Paramètres
    private Marque marque;
    private List<Roue> roues;
    private VehiculeStatus status;
    private int nombrePassagers;
    private static int NOMBRE_MAX_PASSAGERS_VOITURE = 5;

    // Constructeur
    public Voiture(Marque marque, List<Roue> roues, VehiculeStatus status, int nombrePassagers) {
        this.marque = marque;
        this.roues = roues;
        this.status = status;
        this.nombrePassagers = nombrePassagers;
    }

    // Méthodes
    public boolean monterEnVoiture() {
        if(this.nombrePassagers < this.NOMBRE_MAX_PASSAGERS_VOITURE && this.status == VehiculeStatus.ARRETE) {
            return true;
        }
        System.out.println("Trop de monde dans la voiture pour monter");
        return false;
    }

    public void rouler() {
        if(this.status == VehiculeStatus.ARRETE) {
            this.status = VehiculeStatus.ROULE;
        }
        if(this.nombrePassagers >= 1 && this.nombrePassagers <= this.NOMBRE_MAX_PASSAGERS_VOITURE) {
            System.out.println("La voiture roule");
        }
        else if(this.nombrePassagers < 1) {
            System.out.println("Il faut au moins 1 personne dans la voiture.");
        }
        else {
            System.out.println("Trop de monde dans la voiture");
        }
    }

    public void freiner() {
        if(this.status == VehiculeStatus.ROULE) {
            this.status = VehiculeStatus.ARRETE;
        }
    }

}

