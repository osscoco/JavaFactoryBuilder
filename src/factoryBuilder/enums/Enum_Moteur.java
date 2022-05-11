package factoryBuilder.enums;

public enum Enum_Moteur {
	
	DIESEL, ESSENCE, ELECTRO;
	
	public String toString(){
        switch(this){
        case DIESEL :
            return "DIESEL";
        case ESSENCE :
            return "ESSENCE";
        case ELECTRO :
            return "ELECTRO";
        }
        return null;
    }

	public static double size() {
		// TODO Auto-generated method stub
		return 8;
	}

}


