package aufgabe03;

import java.util.LinkedList;

/**
 * 
 * Diese Klasse stellt ein Projekt bestehend aus mehreren miteinander
 * verknüpften Teilaufgaben dar
 * 
 * @author Antonius Mende - 461 328
 * @author Anika Herbermann - 461 655
 * @author Matthias Wolff - 458 766
 * 
 * @author "Gruppe_A"
 */
public class Projekt {
	private String projektName;
	// Hilfsvariablen um Abzweigungen am Anfang und Ende zu buendeln
	private Teilaufgabe projektstart;
	private Teilaufgabe projektende;

	/**
	 * Erstellt ein neues Projekt
	 * 
	 * @param projektName Projektname
	 */
	public Projekt(String projektName) {
		this.projektName = projektName;
		// Anfang und Ende des Projekts, um geschachtelte Aufgaben wieder
		// zusammenzufuehren
		projektstart = new Teilaufgabe(null, 0);
		projektende = new Teilaufgabe(null, 0);
	}

	/**
	 * Fuegt eine Teilaufgabe zum Projekt hinzu. Fuer alle in der Teilaufgabe
	 * gespeicherten Vorgaenger und Nachfolger werden die Beziehungen automatisch
	 * aktualisiert
	 * 
	 * @param aufgabe
	 */
	public void fuegeAufgabeHinzu(Teilaufgabe aufgabe) {
		if (aufgabe == null) {
			throw new IllegalArgumentException("Aufgabe darf nicht gleich null sein.");
		}
		// Hole Gewuenschte Vorgaenger und Nachfolger aus der Aufgabe
		LinkedList<Teilaufgabe> vorgaenger = aufgabe.getVorgaenger();
		LinkedList<Teilaufgabe> nachfolger = aufgabe.getNachfolger();
		// Hilfsvariablen
		boolean ohneVorgaenger = (vorgaenger == null || vorgaenger.isEmpty());
		boolean ohneNachfolger = (nachfolger == null || nachfolger.isEmpty());

		// Wenn die Aufgabe keinen Vorgaenger hat
		if (ohneVorgaenger) {
			// Setze sie direkt an den Projekt-Anfang
			projektstart.addNachfolger(aufgabe);
		}
		// Wenn die Aufgabe keine Nachfolger hat
		if (ohneNachfolger) {
			// Setze sie direkt ans Projektende
			projektende.addVorgaenger(aufgabe);
		}

		// Fuege in allen Aufgaben, die Vorgaenger der neuen Aufgabe sind die neue
		// Aufgabe als Nachfolger hinzu
		for (Teilaufgabe ta : vorgaenger) {
			ta.addNachfolger(aufgabe);
		}
		// Fuege in allen Aufgaben, die Nachfolger der neuen Aufgabe sind die neue
		// Aufgabe als Vorgaenger hinzu
		for (Teilaufgabe ta : nachfolger) {
			ta.addVorgaenger(aufgabe);
		}
	}

	/**
	 * Diese Methode berechnet die Mindest-Bearbeitungszeit des Projektes
	 * 
	 * @return minimale Bearbeitungszeit
	 */
	public int getMinDauer() {

		int dauer = 0;
		// Berechne rekursiv die Dauer aller Vorgaenger des Projektendes. Das Maximum
		// davon ist die minimale Bearbeitungszeit
		for (Teilaufgabe aufgabe : this.projektende.getVorgaenger()) {
			int teilDauer = getDauerRekursiv(aufgabe);
			if (teilDauer > dauer) {
				dauer = teilDauer;
			}
		}

		return dauer;

	}

	/**
	 * Diese Methode berechnet rekursiv die minimale Dauer um eine Teilaufgabe
	 * fertig zu stellen
	 * 
	 * @param aufgabe Teilaufgabe
	 * @return minimale Dauer bis Aufgabe fertig
	 */
	private int getDauerRekursiv(Teilaufgabe aufgabe) {
		int max = 0;
		// Schleife durch alle Vorgaenger durch und ermittle Maximum der
		// Bearbeitungszeiten
		for (Teilaufgabe vorgaenger : aufgabe.getVorgaenger()) {
			if (getDauerRekursiv(vorgaenger) > max) {
				max = getDauerRekursiv(vorgaenger);
			}
		}
		// Gebe die maximale Bearbeitungszeit der Vorgaenger + die eigene
		// Bearbeitungszeit zurueck
		return max + aufgabe.getBearbeitungsZeit();

	}

}
