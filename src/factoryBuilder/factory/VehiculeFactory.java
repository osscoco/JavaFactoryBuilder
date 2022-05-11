package factoryBuilder.factory;

import factoryBuilder.builder.VehiculeBuilder;
import factoryBuilder.classes.Camion;
import factoryBuilder.classes.Scooter;
import factoryBuilder.classes.Vehicule;
import factoryBuilder.classes.Voiture;
import factoryBuilder.enums.Enum_Moteur;
import factoryBuilder.enums.Enum_TypeJouet;
import factoryBuilder.interfaces.IJouet;

public class VehiculeFactory extends JouetFactory {

	public static Vehicule create(String typeVehicule) throws VehiculeCreationException {
		  
		if(typeVehicule.equalsIgnoreCase(Enum_TypeJouet.CAMION.toString())) {
			return new Camion(typeVehicule);
	    }
		
		else if(typeVehicule.equalsIgnoreCase(Enum_TypeJouet.VOITURE_BATMAN.toString())) {
			return new Voiture(typeVehicule);
	    }
		
	    else if(typeVehicule.equalsIgnoreCase(Enum_TypeJouet.VOITURE_OUIOUI.toString())) {
	    	return new Voiture(typeVehicule);
		}
	    
	    else if(typeVehicule.equalsIgnoreCase(Enum_TypeJouet.SCOOTER.toString())) {
	    	return new Scooter(typeVehicule);
		}
		
		throw new VehiculeCreationException("Impossible de créer un(e) " + typeVehicule);
	}

	@Override
	public void createJouet(Enum_TypeJouet t) {
		// TODO Auto-generated method stub
		VehiculeBuilder builder;
	}
}