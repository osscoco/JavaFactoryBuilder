package factoryBuilder.classes;

import factoryBuilder.enums.Enum_Moteur;
import factoryBuilder.enums.Enum_TypeJouet;

public abstract class Vehicule extends Jouet {
	
	private Enum_Moteur moteur;
	
	private int nbrRoues = 2;
	
	private Enum_TypeJouet nom;
	
	public Vehicule() {
		super();
	}

	public Enum_Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Enum_Moteur moteur) {
		this.moteur = moteur;
	}

	public int getNbrRoues() {
		return nbrRoues;
	}

	public void setNbrRoues(int nbrRoues) {
		this.nbrRoues = nbrRoues;
	}
	
	public String getNom() {
		return nom.toString();
	}
	
	public void setNom(Enum_TypeJouet nom) {
		this.nom = nom;
	}	


}
