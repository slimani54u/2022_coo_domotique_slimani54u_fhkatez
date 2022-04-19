import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Telecommande {
    ArrayList<Lampe> lampes;
    ArrayList<Hifi> Hifis;
    public Telecommande() {
        lampes = new ArrayList<Lampe>(0);
        Hifis =new ArrayList<Hifi>(0);
    }

    public void ajouterHifi (Hifi h){
        if(h!=null) {
            Hifis.add(h);
        }
    }
    public void ajouterLampe (Lampe l){
        if(l!=null) {
            lampes.add(l);
        }
    }
    public void activerLampe(int i){
        lampes.get(i).allumer();
    }
    public void desactiverLampe(int i){
        lampes.get(i).eteindre();
    }
    public void ajouterSonATout(){
        for(Hifi h : Hifis){
            h.allumer();
        }

    }
    public void activerTout(){
    for(Lampe l : lampes){
        l.allumer();
    }

    }

    @Test
    public void TestTelecommande (){

        //ajoute d'une lampe dans une telecommande vide
        ArrayList<Lampe> t1 = new ArrayList<Lampe>(0);
        Lampe l1 = new Lampe("lampe1");
        t1.add(l1);
        System . out . println ( t1 . contains ( l1 ));

        //ajout d'une lampe à une télécommande avec 1 élément ;
        ArrayList<Lampe> t2 = new ArrayList<Lampe>(1);
        Lampe l2 = new Lampe("lampe2");
        t2.add(l2);
        System . out . println ( t2 . contains ( l2 ));

        //activation d'une lampe existante en position 0 ;
        ArrayList<Lampe> t3 = new ArrayList<Lampe>(2);
        t3.add(l1);
        t3.add(l2);
        System.out.println(t3.get(0));
        t3.get(0).allumer();
        System.out.println(t3.get(0));
        assertEquals("la lampe est pas allumer",l1.isAllume(),true);
        t3.get(1).allumer();
        assertEquals("la lampe est pas allumer",l2.isAllume(),true);


        IndexOutOfBoundsException exception = assertThrows (
                IndexOutOfBoundsException .class ,
                 () -> { t3.get(4).allumer(); }
         ) ;
    }

}