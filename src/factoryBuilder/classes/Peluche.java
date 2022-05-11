package factoryBuilder.classes;

import factoryBuilder.enums.Enum_Moteur;
import factoryBuilder.enums.Enum_TypeJouet;

public abstract class Peluche extends Jouet{

	private Enum_TypeJouet nom;	
	
	public Peluche(String nom) {
		super(nom);
	}

	public String getNom() {
		return nom.toString();
	}

	public void setNom(Enum_TypeJouet nom) {
		this.nom = nom;
	}	
	
	
	
}
