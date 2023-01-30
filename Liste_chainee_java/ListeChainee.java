public class ListeChainee { // Création d'une class ListeChainee

	private Cellule tete; // Tête de la cellule
	
	private Cellule queue; // Queue de la cellule
	
	private Cellule courant; // Elément courant de la cellule

	public ListeChainee () { // Création d'un constructeur de la ListeChainee sans paramètress tête, queue et courant qui sont la tête, queue et l'élément courant de la liste chainée

		this.tete = null;
		
		this.queue = null;
		
		this.courant = null;
	}

	public ListeChainee (Cellule tete) { // Création d'un constructeur de la ListeChainee avec un paramètre tête, qui est la tête de la cellule de la liste chainée

		this.tete = tete;
		
		this.queue = this.tete;

		this.courant = this.tete;
	}

	public ListeChainee (ListeChainee listeChainee) { // Création d'un constructeur par recopie de la ListeChainee avec un paramètre listeChainee, qui recopie la listeChainee

		this.tete = null;
		
		this.queue = null;
		
		this.courant = null;

		Cellule courant = listeChainee.getTete (); // Elément courant est la tête de la cellule
	
		while (this.courant != null) { // Tant que l'élément courant n'est pas vide

			ajouteQueue (this.courant.getContenu ()); // AjouteQueue est le contenu courant de la cellule

			this.courant = courant.getSuivante (); // Elément courant suivant
		}
	}

	public boolean estVide () { // Création d'un boolean (méthode) estVide, qui vérifie la tête de la cellule

		if (this.tete == null) { // Si la tête de la cellule est vide 

			return true; // Retourne la tête de la cellule est vide

		} else { // Sinon on retourne que la tête de la cellule n'est pas vide

			return false; // Retourne la tête de la cellule n'est vide
		}
	}

	public Cellule getTete () { // Création d'un accesseur Tete, qui retourne la tête de la cellule

		return this.tete;
	}
	
	private void setTete (Cellule cellule) { // Création d'une méthode Tete, qui modifie la tête de la cellule avec le paramètre cellule

		this.tete = cellule;
	}

	public Cellule getQueue () { // Création d'un accesseur Queue, qui retourne la queue de la cellule

		return this.queue;
	}

	private void setQueue (Cellule cellule) { // Création d'une méthode Queue, qui modifie la queue de la cellule avec le paramètre cellule

		this.queue = cellule;
	}

	public Cellule getCourant () { // Création d'un accesseur Courant, qui retourne la cellule suivante

		return this.courant;
	}

	public Object enTete () { // Création d'un Object (méthode) enTete, qui vérifie le contenu de la tête

		return this.tete.getContenu ();
	}

	public Object enQueue () { // Création d'un Object (méthode) enQueue, qui vérifie le contenu de la queue

		return this.queue.getContenu ();
	}

	public Object getContenuCourant () { // Création d'un accesseur ContenuCourant, qui retourne le contenu courant de la cellule

		if (this.courant == null) { // Si l'élément courant de la cellule est nul

			return null; // Retourne nul
		}

		return this.courant.getContenu ();
	}

	public void insereCourant (Object objectInsere) { // Création d'une méthode insereCourant, qui vérifie l'insertion d'un élément courant avec le paramètre objectInsere

		if (this.tete == null) { // Si la tête de la cellule est vide 

			ajouteTete (objectInsere); // Ajoute une tête

		} else { // Sinon on retourne un nouvel élément courant de la cellule

			Cellule nouveauCourant = new Cellule (objectInsere); // Création d'un nouvel élément courant dans la cellule

			nouveauCourant.setSuivante (this.courant); // Nouvel élément courant suivant

			Cellule preCourant = this.tete; // Elément précourant est la tête de la cellule

			preCourant.setSuivante (nouveauCourant); // Elément précourant suivant est le nouvel élément courant
		}
	}

	public boolean possedeSuivante () { // Création d'un boolean (méthode) possedeSuivante, qui retourne l'élémént suivante

		if (this.courant != this.queue) { // Si l'élément courant n'est pas la queue de la cellule

			return true; // Retourne que l'élément courant n'est pas la queue de la cellule

		} else { // Sinon on retourne que l'élément courant est la queue de la cellule

			return false; // Retourne que l'élément courant est la queue de la cellule
		}
	}

	public void ajouteTete (Object objectTete) { // Création d'une méthode ajouteTete, qui vérifie l'ajout de la tête avec le paramètre objectTete

		Cellule nouvelleTete = new Cellule (objectTete); // Création d'une nouvelle tête dans la cellule

		if (estVide ()) { // Si c'est vide

			this.tete = nouvelleTete; // Tête est la nouvelle tête de la cellule 
			
			this.queue = nouvelleTete; // Queue est la nouvelle tête de la cellule 
			
			this.courant = nouvelleTete; // Elément courant est la nouvelle tête de la cellule 

		} else { // Sinon on retourne la nouvelle tête de la cellule 

			nouvelleTete.setSuivante (this.tete); // Nouvelle tête suivante

			this.tete = nouvelleTete; // Tête est la nouvelle tête de la cellule
		}
	}

	public void ajouteQueue (Object objectQueue) { // Création d'une méthode ajouteQueue, qui vérifie l'ajout de la queue avec le paramètre objectQueue

		Cellule nouvelleQueue = new Cellule (objectQueue); // Création d'une nouvelle queue dans la cellule

		if (estVide ()) { // Si c'est vide 

			this.tete = nouvelleQueue; // Tête est la nouvelle queue de la cellule
			
			this.queue = nouvelleQueue; // Queue est la nouvelle queue de la cellule
			
			this.courant = nouvelleQueue; // Elément courant est la nouvelle queue de la cellule

		} else { // Sinon on retourne la nouvelle queue de la cellule

			nouvelleQueue.setSuivante (this.queue); // Nouvelle queue suivante

			this.queue = nouvelleQueue; // Queue est la nouvelle queue de la cellule
		}
	}	

	public void retireTete () { // Création d'une méthode retireTete, qui retourne la tête à retirer

		if (estVide ()) { // Si c'est vide 

			this.tete = null; // Tête est vide
			
			this.courant = null; // Elément courant est vide
			
			this.queue = null; // Queue est vide	

		} else { // Sinon on retourne la tête de la cellule à retirer

			Cellule temporaire = this.tete.getSuivante (); // Cellule temporaire est la tête de la cellule

			this.tete.setSuivante (null); // Tête de la cellule est vide

			setTete (temporaire); // Tête temporaire de la cellule
		}
	}

	public void retireQueue () { // Création d'une méthode retireQueue, qui retourne la queue à retirer

		if (estVide ()) { // Si c'est vide 

			this.tete = null; // Tête est vide
			
			this.courant = null; // Elément courant est vide
			
			this.queue = null; // Queue est vide

		} else { // Sinon on retourne qu'on réinitailise l'élément courant

			reinitialiseCourant (); // Réinitialise l'élément courant

			while (this.courant.getSuivante () != this.queue) { // Tant que l'élément courant suivant n'est pas la queue de la cellule  

				suivante (); // Elément suivant
			}

			this.courant.setSuivante (null); // Elément courant suivant de la cellule est vide

			setQueue (this.courant); // Queue de l'élément courant 
		}
	}

	public void retireCourant () { // Création d'une méthode retireCourant, qui retourne l'élément courant à retirer

		if (this.courant == this.tete) { // Si l'élément courant est la queue de la cellule

			retireTete (); // Retire la tête

		} else if (this.courant == this.queue) { // Sinon si l'élément courant est la queue de la cellule

			retireQueue (); // Retire la queue

		} else { // Sinon on retourne la queue de la cellule à retirer

			Cellule temporaire = this.courant.getSuivante (); // Cellule temporaire est l'élément courant suivant de la cellule 

			this.courant.setSuivante (null); // Elément courant suivant de la cellule est vide

			Cellule preCourant = this.tete; // Cellule précourant est la tête de la cellule 

			while (preCourant.getSuivante () != this.courant) { // Tant que l'élément précourant suivant n'est pas l'élément courant de la cellule 

				preCourant = preCourant.getSuivante (); // Elément précourant est l'élément précourant suivant
			}

			preCourant.setSuivante (temporaire); // Elément précourant suivant temporaire de la cellule
		}
	}

	public void reinitialiseCourant () { // Création d'une méthode reinitialiseCourant, qui retourne l'élémént courant à réinistialiser

		this.courant = this.tete;
	}

	public void suivante () { // Création d'une méthode suivante, qui retourne l'élément suivante

		if (this.courant != null) { // Si l'élément courant n'est pas vide

 	    	this.courant = this.courant.getSuivante (); // Elément courant est l'élément courant suivant
		}
	}

	public String toString () { // Création d'un String (méthode) toString, qui affiche la liste chainée sous forme de chaine de caractère

		String string = ""; // Affiche la chaine de caractère

		if (estVide ()) { // Si c'est vide 

			return "vide"; // Retourne vide

		} else { // Sinon on retourne 

			reinitialiseCourant (); // Réinitialise l'élément courant

			while (this.courant != null) { // Tant que l'élément courant n'est pas vide

				string += this.courant.getContenu () + " -> "; // Elément courant est vide 

				suivante (); // Elément suivant
			}

			string += "null"; // Elément courant est nul
		}

		reinitialiseCourant (); // Réinitialise l'élément courant

		return string; // Retourne si c'est vide 
	}
}
