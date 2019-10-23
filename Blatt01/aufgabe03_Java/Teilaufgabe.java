package aufgabe03;

import java.util.LinkedList;

/**
 * Diese Klasse stellt eine Teilaufgabe dar
 * 
 * @author Antonius Mende -
 * @author Anika Herbermann -
 * @author Matthias Wolff - 458766
 * 
 * @author "Gruppe_A"
 */
public class Teilaufgabe {
	private String name;
	private int bearbeitungsZeit;
	// Hilfsvariablen fuer Verknuepfung
	private LinkedList<Teilaufgabe> vorgaenger;
	private LinkedList<Teilaufgabe> nachfolger;

	/**
	 * Erstellt eine neue Teilaufgabe
	 * 
	 * @param name             Aufgabenname
	 * @param bearbeitungsZeit Bearbeitungszeit
	 */
	public Teilaufgabe(String name, int bearbeitungsZeit) {
		if (bearbeitungsZeit < 0) {
			throw new IllegalArgumentException("Bearbeitungszeit kann nicht negativ sein.");
		}
		this.name = name;
		this.bearbeitungsZeit = bearbeitungsZeit;
		this.vorgaenger = new LinkedList<Teilaufgabe>();
		this.nachfolger = new LinkedList<Teilaufgabe>();

	}

	/**
	 * Fuegt eine Teilaufgabe zu den Nachfolgern dieser Teilaufgabe hinzu
	 * 
	 * @param pNachfolger Nachfolge-Teilaufgabe
	 */
	public void addNachfolger(Teilaufgabe pNachfolger) {
		//Hier werden direkte Kreis-Verbindungen ausgeschlossen. Zyklen mit 3 Teilaufgaben sind trotzdem noch moeglich
		if (pNachfolger != this && !this.nachfolger.contains(pNachfolger)) {
			this.nachfolger.add(pNachfolger);
		}
	}

	/**
	 * Fuegt eine Teilaufgabe zu den Vorgaengern dieser Teilaufgabe hinzu
	 * 
	 * @param pVorgaenger Vorgaenger-Teilaufgabe
	 */
	public void addVorgaenger(Teilaufgabe pVorgaenger) {
		//Hier werden direkte Kreis-Verbindungen ausgeschlossen. Zyklen mit 3 Teilaufgaben sind trotzdem noch moeglich
		if (pVorgaenger != this && !this.vorgaenger.contains(pVorgaenger)) {
			this.vorgaenger.add(pVorgaenger);
		}
	}

	/**
	 * Gibt Liste mit allen Vorgaengern zurueck
	 * 
	 * @return Vorgaenger-Liste
	 */
	public LinkedList<Teilaufgabe> getVorgaenger() {
		return this.vorgaenger;
	}

	/**
	 * Gibt Liste mit allen Nachfolgern zurueck
	 * 
	 * @return Nachfolger-Liste
	 */
	public LinkedList<Teilaufgabe> getNachfolger() {
		return this.nachfolger;
	}

	/**
	 * Gibt die Bearbeitungszeit zurueck
	 * 
	 * @return Bearbeitungszeit
	 */
	public int getBearbeitungsZeit() {
		return this.bearbeitungsZeit;
	}

}
