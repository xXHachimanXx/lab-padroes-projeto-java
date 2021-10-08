package one.digitalinnovation.gof.abstractfactory;

import one.digitalinnovation.gof.abstractfactory.animais.AnimalFactory;
import one.digitalinnovation.gof.abstractfactory.cores.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Cor".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }
}
