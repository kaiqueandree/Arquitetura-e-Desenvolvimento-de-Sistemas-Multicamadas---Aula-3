package abstract_factory;

public class HelloWorldNaTelaFactory extends HelloWorldAbstractFactory {

	
	@Override
	public HelloWorldNaTelaImpressora criaImpressoraDeHelloWorld(){
		
		return new HelloWorldNaTelaImpressora();
	}
	
}
