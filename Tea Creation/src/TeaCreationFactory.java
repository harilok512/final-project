/**
 * This class implements the factory design pattern
 */

public class TeaCreationFactory {
    public TeaCreation getItem(String type, String quantity){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Milk")) {
            TeaCreation g= new Milk();
            ((Milk) g).selectQuantity(quantity);
            return g;
        }
        else if(type.equalsIgnoreCase("Water")){
            TeaCreation g= new Water();
            ((Water) g).selectQuantity(quantity);
            return g;
        }
        else if(type.equalsIgnoreCase("Tealeaves")) {
            TeaCreation g= new Tealeaves();
            ((Tealeaves) g).selectQuantity(quantity);
            return g;
        }
        return null;
    }
}