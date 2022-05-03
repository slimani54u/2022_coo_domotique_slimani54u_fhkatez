import java.util.ArrayList;

public class Telecommande {
    ArrayList<Appareil>appareils;

    public Telecommande() {
        appareils = new ArrayList<Appareil>(0);
    }

    public void activer(int i) {
        appareils.get(i).allumer();
    }


    public void desactiver(int i) {
        appareils.get(i).eteindre();
    }


    public void ajouter(Appareil a) {
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


}
