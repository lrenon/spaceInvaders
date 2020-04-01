package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;

	// Constructeurs
	public Vaisseau(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Getters et Setters

	// Méthodes
	public boolean occupeLaPosition(int x, int y) {
		return (this.x == x) && (this.y == y);
	}

	// toString

}