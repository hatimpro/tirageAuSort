package tirage;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		TirageAuSort tirageAuSort = new TirageAuSortImpl();
		
		List<Integer> listChoixUser = tirageAuSort.choisir();
		System.out.println(listChoixUser);
		
		List<Integer> listChoixTirer = tirageAuSort.tirer();
		System.out.println(listChoixTirer);

		List<Integer> finalList = tirageAuSort.comparer(listChoixUser, listChoixTirer);
		System.out.println(finalList);
		
		if (finalList.size() == 5) {
			System.out.println("Winner");
		}else {
			System.out.println("You lose");
		}
		
	}

}
