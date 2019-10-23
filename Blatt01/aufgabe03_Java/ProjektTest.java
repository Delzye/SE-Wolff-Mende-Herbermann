package aufgabe03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Diese Klasse dient zum Testen des Projektes
 * 
 * 
 * @author Antonius Mende -
 * @author Anika Herbermann -
 * @author Matthias Wolff - 458766
 * 
 * @author "Gruppe_A"
 */
class ProjektTest {

	/**
	 * Baut das Projekt aus der Aufgabenstellung nach und prueft Bearbeitungszeit
	 */
	@Test
	void testBlatt() {
		Projekt p = new Projekt("test");
		Teilaufgabe v1 = new Teilaufgabe("v1", 10);
		Teilaufgabe v2 = new Teilaufgabe("v2", 25);
		Teilaufgabe v3 = new Teilaufgabe("v3", 15);
		Teilaufgabe v4 = new Teilaufgabe("v4", 15);
		Teilaufgabe v5 = new Teilaufgabe("v5", 24);
		Teilaufgabe v6 = new Teilaufgabe("v6", 42);
		Teilaufgabe v7 = new Teilaufgabe("v7", 89);
		Teilaufgabe v8 = new Teilaufgabe("v8", 1337);
		Teilaufgabe v9 = new Teilaufgabe("v9", 1);

		p.fuegeAufgabeHinzu(v1);
		v2.addVorgaenger(v1);
		p.fuegeAufgabeHinzu(v2);
		v3.addVorgaenger(v1);
		p.fuegeAufgabeHinzu(v3);
		v6.addVorgaenger(v2);
		v5.addVorgaenger(v2);
		p.fuegeAufgabeHinzu(v6);
		p.fuegeAufgabeHinzu(v5);
		v7.addVorgaenger(v6);
		p.fuegeAufgabeHinzu(v7);
		v9.addVorgaenger(v7);
		v9.addVorgaenger(v8);
		p.fuegeAufgabeHinzu(v9);
		v8.addVorgaenger(v5);
		v8.addVorgaenger(v4);
		v4.addVorgaenger(v3);
		p.fuegeAufgabeHinzu(v8);
		p.fuegeAufgabeHinzu(v4);

		assertEquals(p.getMinDauer(), 1397, "Falsche minimale Laufzeit");

	}

	// Weitere Tests?

}
