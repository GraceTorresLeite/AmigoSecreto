package sorteio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteio {
	
	public static String regraDoSorteio() {

		List<String> trabalhos = new ArrayList<String>();
		trabalhos.add("Grace");
		trabalhos.add("Gabriela");
		trabalhos.add("Guilherme Karam");
		trabalhos.add("Guilherme");
		trabalhos.add("Mateus");
		trabalhos.add("Matias");
		trabalhos.add("Fabio");

		Collections.shuffle(trabalhos);

		return trabalhos.get((int) Math.random() * trabalhos.size());
	}

}
