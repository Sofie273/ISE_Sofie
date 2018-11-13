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
}
