import java.util.ArrayList;

public class Telecommande {
    ArrayList<Lampe> lampes;

    public Telecommande(){
        lampes = new ArrayList<Lampe>(0);
    }

    public void activerLampe(int i) {
        lampes.get(i).allumer();
    }


    public void desactiverLampe(int i) {
        lampes.get(i).eteindre();
    }


    public void ajouterLampe(Lampe l) {
        lampes.add(l);
    }

}
