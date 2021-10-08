package one.digitalinnovation.gof.abstractfactory.animais;

public class Pato implements Animal {

    @Override
    public String getAnimal() {
        return "Pato";
    }

    @Override
    public String fazerSom() {
        return "Quak";
    }
}
