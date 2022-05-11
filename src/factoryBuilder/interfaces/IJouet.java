package factoryBuilder.interfaces;

import factoryBuilder.enums.Enum_TypeJouet;

public interface IJouet {
	
	public IJouet createJouet(Enum_TypeJouet t);

}
