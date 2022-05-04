public class Cheminee_adapt extends Cheminee implements Appareil{
    @Override
    public void allumer() {
        this.changerIntensite(this.getLumiere()+10);
    }

    @Override
    public void eteindre() {
        this.changerIntensite(0);
    }
}
