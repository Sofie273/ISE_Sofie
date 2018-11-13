package package1;

public class Vogel extends Tier {
	String geraeusch ;
	
	public Vogel() {
		leben();
	}
	public String machGeraeusche() {
		return this.getGeraeusch();
	}
	public String getGeraeusch() {
		return geraeusch;
	}
}
