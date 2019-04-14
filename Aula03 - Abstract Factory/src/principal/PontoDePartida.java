package principal;

import java.util.Random;

import abstract_factory.FabricaNoArquivo;
import abstract_factory.HelloWorldAbstractFactory;
import abstract_factory.HelloWorldImpressora;
import abstract_factory.HelloWorldNaTelaFactory;

public class PontoDePartida {
	public static void main(String[] args) {
		HelloWorldAbstractFactory[] fabricas = new HelloWorldAbstractFactory[2];
		fabricas[0] = new HelloWorldNaTelaFactory();
		fabricas[1] = new FabricaNoArquivo();
		Random gerador = new Random();
		HelloWorldImpressora impressora;
		while (true) {
			int qualFabrica = gerador.nextInt(2);
			impressora = fabricas[qualFabrica].criaImpressoraDeHelloWorld();
			impressora.imprime();
		}
		// impressora.imprime();

	}
}
