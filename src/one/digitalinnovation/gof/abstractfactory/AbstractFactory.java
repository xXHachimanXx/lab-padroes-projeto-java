package one.digitalinnovation.gof.abstractfactory;

public interface AbstractFactory<T> {
    T create(String objType) ;
}