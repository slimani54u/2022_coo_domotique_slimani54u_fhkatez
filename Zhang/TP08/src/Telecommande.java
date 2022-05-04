import java.util.ArrayList;

public class Telecommande {
    ArrayList<Appareil>appareils;

    public Telecommande() {
        appareils = new ArrayList<Appareil>(0);
    }

    public void activerAppareil(int i) {
        appareils.get(i).allumer();
    }


    public void desactiverAppareil(int i) {
        appareils.get(i).eteindre();
    }


    public void ajouterAppareil(Appareil a) {
        if (a != null) {
            appareils.add(a);
        }
    }

    public String toString() {
        return "Telecommande{"+
                appareils;
    }

    public void activerTout() {
        for (Appareil a : appareils) {
            a.allumer();
        }
    }

    public void eteindretous(){
        for(Appareil a : appareils){
            a.eteindre();
        }
    }

    public int getNombre(){
        return appareils.size();
    }


}
