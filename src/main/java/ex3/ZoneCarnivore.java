package ex3;
import java.util.List;
/** Représente les carnivores */
public class ZoneCarnivore extends Animal {

	@Override
	public double calculerKgsNourritureParJour(){
		return getNoms().size() * 10;
	}
}