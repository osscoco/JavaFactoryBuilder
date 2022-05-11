package factoryBuilder.factory;

import factoryBuilder.enums.Enum_Moteur;
import factoryBuilder.enums.Enum_TypeJouet;

public abstract class JouetFactory<IJouet> {

	public abstract void createJouet(Enum_TypeJouet t);
}
