package fr.unilim.iut.spaceinvaders;

public class Position {
	int x;
	int y;

	// Constructeurs
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getters et setters
	public int abscisse() {
		return this.x;
	}

	public int ordonnee() {
		return this.y;
	}

	// Méthodes
	public void changerAbscisse(int nouvelleAbscisse) {
		this.x = nouvelleAbscisse;
	}

	public void changerOrdonnee(int nouvelleOrdonnee) {
		this.y = nouvelleOrdonnee;
	}

	// toString

}