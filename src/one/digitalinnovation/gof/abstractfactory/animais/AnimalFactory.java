package one.digitalinnovation.gof.abstractfactory.animais;

import one.digitalinnovation.gof.abstractfactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Cachorro".equalsIgnoreCase(animalType)) {
            return new Cachorro();
        } else if ("Pato".equalsIgnoreCase(animalType)) {
            return new Pato();
        }

        return null;
    }

}
