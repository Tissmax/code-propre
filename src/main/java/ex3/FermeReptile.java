package ex3;
import java.util.List;

/** Représente les reptiles */
public class FermeReptile extends Animal{

	@Override
	public double calculerKgsNourritureParJour(){
		return getNoms().size() * 0.1;
	}
}