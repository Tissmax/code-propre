package ex5;

import java.util.ArrayList;
import java.util.List;

/** Représente le concept d'une caisse contenant des items */
public class Caisse {

	/** nom: nom de la liste */
	private String nom;
	/** items: une liste d'item que l'on tente d'insérer dans une caisse*/
	private List<Item> items;


	/** Constructeur
	 * @param nom le nom de la liste
	 */
	public Caisse(String nom) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
	}

	/** Méthode permettant aux caisses de savoir si elle peuvent accepter l'item passer en paramètre
	 * @param item l'item que l'on insére dans la liste de caisse
	 * @return un indice qui permettra d'insérer l'item dans la bonne caisse
	 */
	public int accept(Item item){
		if (item.getPoids() < 5) {
			return 0;
		}
		if (item.getPoids() >= 5 && item.getPoids() <= 20) {
			return 1;

		}
		if (item.getPoids() >= 20) {
			return 2;

		}
		return 0;
	}
	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}

