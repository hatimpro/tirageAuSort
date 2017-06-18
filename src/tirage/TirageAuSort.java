package tirage;

import java.util.List;

public interface TirageAuSort {

	public List<Integer> choisir();
	public List<Integer> tirer();
	public List<Integer> comparer(List<Integer> listChoixUser, List<Integer> listChoixTirer);
}
