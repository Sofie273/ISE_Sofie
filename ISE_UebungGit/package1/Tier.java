package package1;

public class Tier {
	boolean lebendig; 
	boolean kannFliegen;
	
	public void leben() {
		lebendig = true;
	}
	public void sterben() {
		lebendig = false;
	}
	public String fortbewegen() {
		if (kannFliegen == true) return this.fliegen();
		if (kannFliegen == false) return laufen();
		else return "";
	}
	public String fliegen() {return "";};
	public String laufen() {return "";};
	
	
}
