package factoryBuilder.factory;

import factoryBuilder.classes.*;
import factoryBuilder.enums.*;

public class PelucheFactory extends JouetFactory {

	public static Peluche create(String typePeluche) throws PelucheCreationException {
		 
		if(typePeluche.equalsIgnoreCase(Enum_TypeJouet.PELUCHE_CHAT.toString())) {
			return new PelucheAnimal(typePeluche);
	    }
	    
		else if(typePeluche.equalsIgnoreCase(Enum_TypeJouet.PELUCHE_LION.toString())) {
			return new PelucheAnimal(typePeluche);
	    }
		
	    else if(typePeluche.equalsIgnoreCase(Enum_TypeJouet.PELUCHE_OBELIX.toString())) {
	    	return new PeluchePersonnage(typePeluche);
		}
	    
	    else if(typePeluche.equalsIgnoreCase(Enum_TypeJouet.PELUCHE_OUIOUI.toString())) {
	    	return new PeluchePersonnage(typePeluche);
		}
		
		throw new PelucheCreationException("Impossible de créer un " + typePeluche);
	}

	@Override
	public void createJouet(Enum_TypeJouet t) {
		// TODO Auto-generated method stub
		
	}
}