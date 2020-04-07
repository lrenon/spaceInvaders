package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;
	int longueur;
	int hauteur;

	// Constructeurs
	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur = longueur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

	// Getters et Setters
	public int abscisseLaPlusAGauche() {
		return this.x;
	}

	private int ordonneeLaPlusHaute() {
		return this.y;
	}

	private int ordonneeLaPlusBasse() {
		return ordonneeLaPlusHaute() - this.hauteur + 1;
	}

	public int abscisseLaPlusADroite() {
		return this.x + this.longueur - 1;
	}

	// Méthodes
	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse() <= y) && (y <= ordonneeLaPlusHaute());
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}

	public void seDeplacerVersLaDroite() {
		this.x = this.x + 1;
	}

	public void seDeplacerVersLaGauche() {
		this.x = this.x - 1;
	}

	public void positionner(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toString

}