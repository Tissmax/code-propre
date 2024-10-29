package ex5;

import java.util.ArrayList;
import java.util.List;

/**Classe utilitaire permettant de construire et de remplir une liste de caisse */
public class Inventaire {

	/**caisses: une liste de caisse	 */
	private List<Caisse> caisses;

	/** Constructeur permettant de génrérer les différentes taille de caisses	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets"));
		caisses.add(new Caisse("Moyens objets"));
		caisses.add(new Caisse("Grands objets"));
	}

	/**
	 * @param item l'item à indexer dans la caisse
	 */
	public void addItem(Item item) {
		for (Caisse caisse: caisses){
			caisses.add(caisses.get(caisse.accept(item)));
		}
	}

	/**
	 * @return la taille de la caisse
	 */
	public int taille() {
		for (Caisse caisse: caisses){
			return caisse.getItems().size();
		}
		return 0;
	}
}
