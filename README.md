# Space Invaders 

- [Glossaire]
- [Semaine n°1 : du 30 mars au 3 avril]

-------------


## Glossaire <a id="glossaire"></a>

* **Vaisseau** :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

------------- 


## Semaine n°1 : du 30 mars au 3 avril <a id="semaine1"></a>


### Sprints et fonctionnalités réalisées 

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (en cours)

- Story n°1 : Créer un espace de jeu  
Un espace de jeu est créé aux dimensions données (2D). 
Cet espace de jeu est vide.

-  Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu  
Un nouveau vaisseau est créé.
Le vaisseau est positionné aux coordonnées transmises.
Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
 Contraintes :
    - La position souhaitée est transmise par ses coordonnées x et y.
    - Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)
    - La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    

### Fonctionnalité en cours d’implémentation : 
#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu

**L'objectif** de cette première *grosse* fonctionnalité est de pouvoir **déplacer un vaisseau dans l'espace de jeu**.

Pour réaliser cet objectif, d'après notre rapide analyse, nous devons implémenter les *stories* suivantes (considérez pour le moment que les *stories* sont des fonctionnalités de granularité plus fine) :  
- [créer un espace de jeu](#creerEspaceJeu)  
- [positionner un nouveau vaisseau dans l'espace de jeu](#positionnerVaisseau)  
- [déplacer le vaisseau vers la droite dans l'espace de jeu](#déplacerVaisseauDroite)    
- [déplacer le vaisseau vers la gauche dans l'espace de jeu](#déplacerVaisseauGauche)  

### Diagramme de classes  

![Diagrammes de classes de la semaine 1](images/DiagClasses_S1_F1_1et2.png)

### Nuage de mots du projet spaceinvaders (séance n°1)  

![Nuage de mots de la semaine 1](images/NuageMots_S1_F1_1et2.png)


### Difficultés rencontrées 
Aucune

### Remarques diverses
 Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.

-------------

