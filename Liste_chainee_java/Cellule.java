public class Cellule { // Création d'une class Cellule

	protected Object contenu; // Contenu de la cellule
	
	protected Cellule suivante; // Cellule suivante

	public Cellule () { // Création d'un constructeur de la Cellule sans paramètres contenu et suivante, qui sont le contenu et la cellule suivante

		this.contenu = null;

		this.suivante = null;
	}

	public Cellule (Object contenu) { // Création d'un constructeur de la Cellule avec un paramètre contenu, qui est le contenu de la cellule

		this.contenu = contenu;

		this.suivante = null;
	}

	public Cellule getSuivante () { // Création d'un accesseur Suivante, qui retourne la cellule suivante

		return this.suivante;
	}

	public void setSuivante (Cellule cellule) { // Création d'une méthode Suivante, qui modifie la cellule suivante avec le paramètre cellule

		this.suivante = cellule;
	}

	public void setSuivante (Object object) { // Création d'une méthode Suivante, qui modifie le contenu de la cellule avec le paramètre object

		this.suivante = new Cellule (object);
	}

	public Object getContenu () { // Création d'un accesseur Contenu, qui retourne le contenu de la cellule

		return this.contenu;
	}

	public void setContenu (Object contenu) { // Création d'une méthode Contenu, qui modifie le contenu de la cellule avec le paramètre contenu

		this.contenu = contenu;
	}

	public String toString () { // Création d'un String (méthode) toString, qui affiche le contenu de la cellule sous forme de chaine de caractère

		if (this.contenu == null) { // Si le contenu est nul

			return "null"; // Retourne nul

		} else { // Sinon on retourne le contenu de la cellule

			return this.contenu.toString (); // Retourne le contenu de la cellule
		}
	}
}