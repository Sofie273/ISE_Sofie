package package1;
import java.util.ArrayList;

public class Zoo {
	//hier Tiere erstellen
	protected ArrayList<Tier> tiere = new ArrayList<Tier> ();
	
	public Zoo() {
		Pinguin oskar = new Pinguin();
		Papagei alex = new Papagei("Alex");
		Okapi bento = new Okapi();
		Amsel angelina = new Amsel();
		
		tiere.add(oskar);
		tiere.add(alex);
		tiere.add(bento);
		tiere.add(angelina);
	}
	
	public static void main (String[] args) {
		Zoo zoo = new Zoo();
	}
}
