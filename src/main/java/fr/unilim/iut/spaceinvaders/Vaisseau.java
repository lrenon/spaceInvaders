package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	private Position origine;
	private Dimension dimension;
	private int vitesse;

	// Constructeurs
	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
		this.dimension = dimension;
		this.origine = positionOrigine;
		this.vitesse = vitesse;
	}

	public Vaisseau(Dimension dimension, Position positionOrigine) {
		this(dimension, positionOrigine, 1);
	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this(new Dimension(longueur, hauteur), new Position(x, y));
	}

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

	// Getters et Setters
	public int abscisseLaPlusAGauche() {
		return this.origine.abscisse();
	}

	int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}

	int ordonneeLaPlusBasse() {
		return ordonneeLaPlusHaute() - this.dimension.hauteur() + 1;
	}

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse() + this.dimension.longueur() - 1;
	}
	
	public Dimension dimension() {
		return this.dimension;
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
		this.origine.changerAbscisse(this.origine.abscisse() + vitesse);
	}

	public void seDeplacerVersLaGauche() {
		this.origine.changerAbscisse(this.origine.abscisse() - vitesse);
	}

	public void positionner(int x, int y) {
		this.origine.changerAbscisse(x);
		this.origine.changerOrdonnee(y);
	}

	// toString

}