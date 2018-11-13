package package1;

public class Papagei  extends Vogel{
	String name;
	// kann sprechen(seinen Namen sagen) und fliegen
	public Papagei(String name) {
		this.name = name;
		this.kannFliegen = true;
		this.Zootier = true;
		zooTier();
	}
	public String getGeraeusch() {
		return "Mein Name ist " +name;
	}
}
