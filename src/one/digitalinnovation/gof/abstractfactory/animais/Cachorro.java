package one.digitalinnovation.gof.abstractfactory.animais;

public class Cachorro implements Animal {

    @Override
    public String getAnimal() {
        return "Cachorro";
    }

    @Override
    public String fazerSom() {
        return "Auau";
    }
}
