
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterAppareil(l1);

		Cheminee_adapt c1 = new Cheminee_adapt();
		Hifi h1 = new Hifi();
		t.ajouterAppareil(c1);
		t.ajouterAppareil(h1);
		/****** A COMPLETER ******/
		// TODO
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
