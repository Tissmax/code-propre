package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/** Classe utilitaire permettant de formatter une date */
public class DateUtils {

	/** Le pattern par défaut de formatage*/
	private final String DEFAUT = "dd/MM/yyyy HH:mm:ss";

	/** Permet de formater une date
	 * @param pattern le format de la date
	 * @param date la date que l'on souhaite foramter
	 * @return la date avec le format voulue
	 */
	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * Getter
	 *
	 * @return DEFAUT
	 */
	public String getDEFAUT() {
		return DEFAUT;
	}
}
