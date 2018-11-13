package package1;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void testPapageiSprache() {
		//kann Papagei sprechen?
		
		Papagei alex = new Papagei("Alex");
		
		assertEquals("Mein Name ist Alex",alex.machGeraeusche());
		
	}
	
	@org.junit.jupiter.api.Test
	void testPapageiLeben() {
		//lebt Papagei?
		
		Papagei tom = new Papagei("Tom");
		
		assertEquals(true, tom.lebendig);
		
	}
	
	@org.junit.jupiter.api.Test
	void testKannFliegen() {
		//kann Papagei fliegen? und okapi laufen? und pinguin laufen?
		
		Papagei kiki = new Papagei("Kiki");
		Okapi nils = new Okapi();
		Pinguin gabriel = new Pinguin();
		
		assertEquals("Ich fliege", kiki.fortbewegen());
		assertEquals("*galoppel galoppel*", nils.fortbewegen());
		assertEquals("",gabriel.fortbewegen());
	}
}
