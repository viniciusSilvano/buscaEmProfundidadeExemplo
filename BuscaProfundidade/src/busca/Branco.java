package busca;

import java.util.List;

public class Branco extends Cor {
	@Override
	public void busca(No no, List<No> list) {
		no.setCor(new Cinza(), list);
	}
}