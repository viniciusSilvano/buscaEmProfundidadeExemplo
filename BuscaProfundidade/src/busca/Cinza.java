package busca;

import java.util.List;

public class Cinza extends Cor {
	@Override
	public void assumiu(No no, List<No> list) {
		for (No adj : no.getAdjacentes()) {
			adj.buscaProfundidade(list);
		}
		no.setCor(new Preto(), list);
	}
}
