package ex3;
import java.util.List;

/** Représente les poisson */
public class Aquarium extends Animal{

	@Override
	public double calculerKgsNourritureParJour(){
		return getNoms().size() * 0.2;
	}
}