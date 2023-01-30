public class Test { // Création d'une class Test
	public static void main (String [] arguments) { // Création d'une méthode statique main, qui renvoit une chaine de caractère en liste

		String string [] = new String [5]; // Création d'un nouveau string, qui est de taille 5 

		string [0] = "a"; // String 0 est a
		string [1] = "b"; // String 1 est b
		string [2] = "c"; // String 2 est c
		string [3] = "d"; // String 3 est d
		string [4] = "e"; // String 4 est e

		System.out.println ("Creation d'une liste : " + string.length + " elements"); // Affiche la création d'une liste

		ListeChainee listeChainee1 = new ListeChainee (); // Création d'une nouvelle listeChainee1

		System.out.println ("\n" + "Affichage de la liste vide     : "); // Affiche la liste vide
		System.out.println ("listeChainee1                  : " + listeChainee1); // Affiche la listeChainee1

		System.out.println ("\n" + "Initialisation avec ajouteTete  : "); // Affiche l'initialisation avec ajouteTete

		int i = 0; // Initialise i à 0

		while (i < string.length) { // Tant que i est inférieur à la taille de l'arguments 

			listeChainee1.ajouteTete (string [i]); // ListeChainee1 ajoute la tête de la cellule

			i++; // I augmente
		}

		System.out.println ("Affichage de la liste obtenue   : "); // Affiche la liste obtenue
		System.out.println ("listeChainee1                   : " + listeChainee1); // Affiche la listeChainee1

		System.out.println ("\n" + "Creation d'une autre liste vide : "); // Affiche la création d'une autre liste vide

		ListeChainee listeChainee2 = new ListeChainee (); // Création d'une nouvelle listeChainee2

		System.out.println ("Initialisation avec ajouteQueue : "); // Affiche l'initialisation avec ajouteQueue

		i = 0; // Initialise i à 0

		while (i < string.length) { // Tant que i est inférieur à la taille de l'arguments

			listeChainee2.ajouteQueue (string [i]); // ListeChainee2 ajoute la queue de la cellule

			i++; // I augmente
		}

		System.out.println ("Affichage de la liste obtenue   : "); // Affiche la liste obtenue
		System.out.println ("listeChainee2                   : " + listeChainee2); // Affiche la listeChainee2

		System.out.println ("\n" + "Creation d'une autre liste      : "); // Affiche un autre liste

		ListeChainee listeChainee3 = new ListeChainee (listeChainee2.getTete ()); // Création d'une nouvelle listeChainee3 avec la tête de la listeChainee2

		System.out.println ("Affichage de la liste obtenue   : "); // Affiche la liste obtenue
		System.out.println ("listeChainee3                   : " + listeChainee3); // Affiche la listeChainee3

		listeChainee1.retireTete (); // Retire la tête de la listeChainee1

		System.out.println ("\n" + "Affichage de listeChainee1 apres retrait de listeChainee1.tete : "); // Affiche la listeChainee1, après le retrait de la tête de la listeChainee1
		System.out.println ("listeChainee1                                                  : " + listeChainee1); // Affiche la listeChainee1

		listeChainee1.retireQueue (); // Retire la queue de la listeChainee1

		System.out.println ("\n" + "Affichage de listeChainee2 et listeChainee3 apres retrait de listeChainee2.queue : "); // Affiche la liste chainée 2 et 3, après le retrait de la queue de la listeChainee2
		System.out.println ("listeChainee2                                                                    : " + listeChainee2); // Affiche listeChainee2
		System.out.println ("listeChainee3                                                                    : " + listeChainee3); // Affiche listeChainee3

		System.out.println ("\n" + "Affichage de listeChainee3 : "); // Affiche la listeChainee3
		System.out.println ("tête listeChainee3         : " + listeChainee3.getTete ()); // Affiche la tête de la listeChainee3
		System.out.println ("courant listeChainee3      : " + listeChainee3.getCourant ()); // Affiche l'élément courant de la listeChainee3
		System.out.println ("queue listeChainee3        : " + listeChainee3.getQueue ()); // Affiche la queue de la listeChainee3
		
		listeChainee3.suivante (); // Elément suivant de la listeChainee3

		listeChainee3.retireCourant (); // Retire l'élément courant de la listeChainee3

		System.out.println ("\n" + "Affichage de listeChainee2 et listeChainee3 apres retrait de listeChainee3.courant : "); // Affiche la listeChainee2 et listeChainee3, après le retrait de l'élément courant de la listeChainee3
		System.out.println ("listeChainee2                                                                      : " + listeChainee2); // Affiche la listeChainee2
		System.out.println ("listeChainee3                                                                      : " + listeChainee3 + "\n"); // Affiche la listeChainee3

		listeChainee2.suivante (); // Elémént suivant de la listeChainee2

		if (listeChainee2.possedeSuivante ()) { // Si la listeChainee2 possède un élément suivant 

			listeChainee2.suivante (); // Elément suivant de la listeChainee2

			System.out.println ("Contenu de la cellule suivante : " + listeChainee2.getContenuCourant ()); // Affiche le contenu de la listeChainee2
		}

		listeChainee2.retireCourant (); // Retire l'élément courant de la listeChainee2

		System.out.println ("Affichage de listeChainee2 apres retrait de listeChainee2.courant : "); // Affiche la liste chainée 2, après le retrait de l'élément courant de la listeChainee2
		System.out.println ("listeChainee2                                                     : " + listeChainee2); // Affiche la listeChainee2 

		System.out.println ("\n" + "Affichage de listeChainee3 apres reinitialisation de listeChainee3.courant : "); // Affiche la listeChainee3, après la réinitialisation de l'élément courant de la listeChainee3
		
		listeChainee3.reinitialiseCourant (); // Réinitialise l'élément courant de la listeChainee3
		
		while (listeChainee3.getCourant () != null) { // Tant que l'élément courant de la listeChainee3 n'est pas nul
			
			System.out.println ("Contenu de la cellule à supprimer : " + listeChainee3.getContenuCourant ()); // Affiche le contenu de la liste chainée 3
			
			listeChainee3.retireCourant (); // Retire l'élément courant de la listeChainee2
		}

		System.out.println ("listeChainee3                                                              : " + listeChainee3); // Affiche la listeChainee3
	}
}