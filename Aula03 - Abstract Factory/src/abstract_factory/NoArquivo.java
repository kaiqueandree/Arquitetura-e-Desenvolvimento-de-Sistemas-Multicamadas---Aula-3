package abstract_factory;

import java.io.FileWriter;
import java.io.PrintWriter;

public class NoArquivo extends HelloWorldImpressora {

	@Override
	public void imprime() {
		try {
			FileWriter imprimeArquivo = new FileWriter(System.getProperty("user.dir") + "\\log.txt", true);
			PrintWriter esc = new PrintWriter(imprimeArquivo);
			esc.write("HelloWorld");
			esc.flush();
			esc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
