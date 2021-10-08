package one.digitalinnovation.gof;

import one.digitalinnovation.gof.abstractfactory.AbstractFactory;
import one.digitalinnovation.gof.abstractfactory.FactoryProvider;
import one.digitalinnovation.gof.abstractfactory.animais.Cachorro;
import one.digitalinnovation.gof.abstractfactory.animais.Pato;
import one.digitalinnovation.gof.abstractfactory.cores.Amarelo;
import one.digitalinnovation.gof.abstractfactory.cores.Cor;
import one.digitalinnovation.gof.abstractfactory.cores.Vermelho;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");

		// Abstract factory
		AbstractFactory abstractFactory;

		abstractFactory = FactoryProvider.getFactory("Cor");
		Amarelo amarelo = (Amarelo) abstractFactory.create("Amarelo");
		Vermelho vermelho = (Vermelho) abstractFactory.create("Vermelho");

		abstractFactory = FactoryProvider.getFactory("Animal");
		Cachorro cachorro = (Cachorro) abstractFactory.create("Cachorro");
		Pato pato = (Pato) abstractFactory.create("Pato");

		System.out.printf(
				"O %s é %s e o %s é %s",
				cachorro.getAnimal(),
				vermelho.getCor(),
				pato.getAnimal(),
				amarelo.getCor()
		);
	}

}
