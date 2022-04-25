import java.util.ArrayList;

public class Telecommande {
    ArrayList<Lampe> lampes;
    ArrayList<Hifi>hifis;

    public Telecommande() {
        lampes = new ArrayList<Lampe>(0);
        hifis = new ArrayList<Hifi>(0);
    }

    public void activerLampe(int i) {
        lampes.get(i).allumer();
    }


    public void desactiverLampe(int i) {
        lampes.get(i).eteindre();
    }


    public void ajouterLampe(Lampe l) {
        if (l != null) {
            lampes.add(l);
        }
    }

    public String toString() {
        String s = "";
        for (Lampe lampe : lampes) {
            s += lampe + "\n";
        }

        for(Hifi i : hifis){
            s += i+"\n";
        }
        return s;
    }

    public void activerTout() {
        for (Lampe l : lampes) {
            l.allumer();
        }
    }

    public void eteindretoushifi(){
        for(Hifi i : hifis){
            i.eteindre();
        }
    }

    public void ajouthifi(Hifi i){
        if(i != null){
            hifis.add(i);
        }
    }

    public void allmuercertainhifi(int i){
        hifis.get(i).allumer();
    }

    public void eteindrecertainhifi(int i){
        hifis.get(i).eteindre();
    }


}
