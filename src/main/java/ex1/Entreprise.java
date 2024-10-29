package ex1;

import java.util.Date;

/**
 * Représente le concept d'entreprise
 * @author diginamic
 */
public class Entreprise {

	/** siret: numéro de siret */
	private int siret;
	/** nom: nom de l'entreprise */
	private String nom;
	/** adresse: adresse de l'entreprise */
	private String adresse;

	/** dateCreation: date de création de l'entreprise */
	private Date dateCreation;
	/**
	 * Le nombre d'habitant dans la plus grande capitale
	 */
	public static final int CAPITALE_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise
	 */
	public void afficherStatut(){
		System.out.println(siret + nom + adresse + dateCreation.toString());
	}
	/**
	 * Getter for siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Setter for siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}
	/**
	 * Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Getter for adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * Setter for adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter
	 *
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter for dateCreation
	 *
	 * @param dateCreation set the dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
