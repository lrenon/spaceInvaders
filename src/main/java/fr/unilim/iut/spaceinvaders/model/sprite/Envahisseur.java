package fr.unilim.iut.spaceinvaders.model.sprite;

import fr.unilim.iut.spaceinvaders.model.Dimension;
import fr.unilim.iut.spaceinvaders.model.Direction;
import fr.unilim.iut.spaceinvaders.model.Position;

public class Envahisseur extends Sprite {
	private Direction sensDeDeplacement;

	// Constructeur
	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		this.sensDeDeplacement = Direction.DROITE;
	}

	// Getters
	public Direction sensDeDeplacement() {
		return sensDeDeplacement;
	}

	public void changerSens() {
		if (this.sensDeDeplacement == Direction.DROITE) {
			this.sensDeDeplacement = Direction.GAUCHE;
		} else {
			this.sensDeDeplacement = Direction.DROITE;
		}
	}

}
