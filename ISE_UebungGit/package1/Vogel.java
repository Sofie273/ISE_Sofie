package package1;

public class Vogel extends Tier {
	String geraeusch ;
	
	public Vogel() {
		
	}
	
	public String machGeraeusche() {
		return this.getGeraeusch();
	}
	public String getGeraeusch() {
		return geraeusch;
	}
	public String fliegen() {
		return "Ich fliege";
	}
}
