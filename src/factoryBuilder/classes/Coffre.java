package factoryBuilder.classes;

import java.util.ArrayList;
import java.util.List;

public class Coffre {

	private static final int NB_JOUETS = 10;
	
	List<Jouet> coffre = new ArrayList<Jouet>();

	public List<Jouet> getCoffre() {
		return coffre;
	}

	public static int getNbJouets() {
		return NB_JOUETS;
	}
}
