package ex3;

import java.util.List;

/** Représente le concept d'animal
 * Les caractéristiques sont rangées dans des listes
 */
public abstract class Animal {

    /** Une liste comprennant les types des animuax*/
    private List<String> types;
    /** Une liste comprennant les noms des animuax*/
    private List<String> noms;
    /** Une liste comprennant les comportements des animuax*/
    private List<String> comportements;

    /** Permet d'ajouter un animal au Zoo
     * @param typeAnimal le type de l'annimal
     * @param nomAnimal le nom de l'annimal
     * @param comportement le comportement de l'annimal
     */
    public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
        types.add(typeAnimal);
        noms.add(nomAnimal);
        comportements.add(comportement);
    }

    /** Permet de calculer la quantité (en kg) de nourriture par jour*/
    public abstract double calculerKgsNourritureParJour();

    /** Compte le nombre d'animaux présent dans la liste
     * @return int nombres d'animaux
     */
    public int compterAnimaux(){
        return noms.size();
    };

   /** Affiche la liste des animaux */
    public void afficherListeAnimaux(){
        for (String nom: noms){
            System.out.println(nom);
        }
    }

    /**
     * Getter
     *
     * @return types
     */
    public List<String> getTypes() {
        return types;
    }

    /**
     * Setter for types
     *
     * @param types set the types
     */
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * Getter
     *
     * @return noms
     */
    public List<String> getNoms() {
        return noms;
    }

    /**
     * Setter for noms
     *
     * @param noms set the noms
     */
    public void setNoms(List<String> noms) {
        this.noms = noms;
    }

    /**
     * Getter
     *
     * @return comportements
     */
    public List<String> getComportements() {
        return comportements;
    }

    /**
     * Setter for comportements
     *
     * @param comportements set the comportements
     */
    public void setComportements(List<String> comportements) {
        this.comportements = comportements;
    }
}
