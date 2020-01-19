package a18;

import java.util.LinkedList;

/**
 * 
 * @author Antonius Mende - 461 328
 * @author Anika Herbermann - 461 655
 * @author Matthias Wolff - 458 766
 * 
 * @author "Gruppe_A"
 */
public class Pizza {
	protected int pizzaId;
	protected double preis;
	protected String name;
	protected LinkedList<Bestellung> bestellungen;

	public Pizza(int pizzaId, double preis, String name) {
		this.pizzaId = pizzaId;
		this.preis = preis;
		this.name = name;
		this.bestellungen = new LinkedList<Bestellung>();
	}

	public int getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public LinkedList<Bestellung> getBestellungen() {
		return bestellungen;
	}

	public void setBestellungen(LinkedList<Bestellung> bestellungen) {
		this.bestellungen = bestellungen;
	}

}
