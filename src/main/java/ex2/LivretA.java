package ex2;

/** Représente un livret A
 * C'est une extension du compte bancaire à la différence qu'il y a un taux de rémunération
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {

	private double tauxRemuneration;

	/** Ce constructeur construit un Livret A
	 * @param type type
	 * @param solde solde
	 * @param decouvert decouvert
	 * @param tauxRemuneration taux de rémunération
	 */
	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}

	/** Permet de calculer la rémunération du livret A */
	public double appliquerRemuAnnuelle(){

		return getSolde() + getSolde()*tauxRemuneration/100;
	}

	/**
	 * Getter
	 *
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter for tauxRemuneration
	 *
	 * @param tauxRemuneration set the tauxRemuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}

