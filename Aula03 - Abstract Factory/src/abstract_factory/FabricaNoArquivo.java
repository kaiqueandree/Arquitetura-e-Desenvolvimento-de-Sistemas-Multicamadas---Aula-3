package abstract_factory;

public class FabricaNoArquivo extends HelloWorldAbstractFactory{


@Override
public HelloWorldImpressora criaImpressoraDeHelloWorld() {
	// TODO Auto-generated method stub
	return new NoArquivo();
}
	
}
