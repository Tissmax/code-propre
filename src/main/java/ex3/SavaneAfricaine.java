package ex3;
import java.util.List;

/** Représente les animaux de la savanne */
public class SavaneAfricaine extends Animal{


	@Override
	public double calculerKgsNourritureParJour(){
		return getNoms().size() * 10;
	}
}