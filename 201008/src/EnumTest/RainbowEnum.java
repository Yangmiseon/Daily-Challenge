package EnumTest;

public enum RainbowEnum {
	
	RED,
    
    ORANGE,
 
    YELLOW,
    
    GREEN,
    
    BLUE,
    
    INDIGO,
    
    VIOLET;    
    
    public static RainbowEnum get(String name) {
        try {
            return RainbowEnum.valueOf(name);
        }
        catch (java.lang.IllegalArgumentException _e) {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "." + name() + "(" + ordinal() +")";
    }

}
