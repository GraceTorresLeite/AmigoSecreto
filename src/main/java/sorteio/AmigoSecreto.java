package sorteio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AmigoSecreto {
	
	public static void main(String[] args) {
		 Sorteio sorteio = new Sorteio();
		
		List<String> alunos= new ArrayList<String>();
		alunos.add("Grace");
		alunos.add("Gabriela");
		alunos.add("Guilherme Karam");
		alunos.add("Guilherme");
		alunos.add("Mateus");
		alunos.add("Matias");
		alunos.add("Fabio");

		Collections.shuffle(alunos);

		Set sorteados = new HashSet();
		String aux = "";
		for (int i = 0; i < alunos.size() ; i++) {
			boolean novo = false;
			while (!novo) {
				aux = Sorteio.regraDoSorteio();
				if (!sorteados.contains(aux) && !alunos.get(i).equals(aux)) {
					novo = true;
					sorteados.add(aux);
					System.out.println("Aluno(a) "+ alunos.get(i)+" Recebe o trabalho do(a) " + aux);
				}
				
			}
		}
	}
}
