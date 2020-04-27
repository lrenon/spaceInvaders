package fr.unilim.iut.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

	private SpaceInvaders jeu;

	// Constructeur
	public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
		this.jeu = spaceInvaders;
	}

	// Méthodes
	@Override
	public void dessiner(BufferedImage im) {
		if (this.jeu.aUnVaisseau()) {
			Vaisseau vaisseau = this.jeu.vaisseau();
			this.dessinerUnVaisseau(vaisseau, im);
		}
	}

	private void dessinerUnVaisseau(Vaisseau vaisseau, BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		crayon.setColor(Color.gray);
		crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusBasse(),
				vaisseau.dimension().longueur(), vaisseau.dimension().hauteur());
	}
}