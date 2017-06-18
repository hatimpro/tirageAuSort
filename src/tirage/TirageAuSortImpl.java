package tirage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TirageAuSortImpl implements TirageAuSort {

	@Override
	public List<Integer> choisir() {
		
		int i = 0;
		List<Integer> listChoix = new ArrayList<>();
		while (i < 5) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("SVP entrer un numero de votre choix entre 1 et 47 :");
			String choix = scanner.next();
			
			int intChoix = Integer.parseInt(choix);
			if (intChoix <1 || intChoix >47) {
				System.err.println("Tu as entrer un nombre Hors tirage, SVP saisir un nombre entre 1 et 47");
				continue;
			}
			if (listChoix.contains(intChoix)) {
				System.err.println("Tu as deja choisi ce nombre, SVP entrer un autre");
				continue;
			}
			listChoix.add(intChoix);
			i++;
		}
		
		return listChoix;
	}

	@Override
	public List<Integer> tirer() {
		int i = 0;
		List<Integer> randomlistChoix = new ArrayList<>();
		while (i < 5) {
			Integer randomTire = (int) (Math.random() * 47);
			if (randomTire <1 || randomTire >47) {
				continue;
			}
			if (randomlistChoix.contains(randomTire)) {
				continue;
			}
			randomlistChoix.add(randomTire);
			i++;
		}
		
		return randomlistChoix;
	}

	@Override
	public List<Integer> comparer(List<Integer> listChoixUser, List<Integer> listChoixTirer) {
		
		List<Integer> listChoixTrue = new ArrayList<>();
		for (Integer choixUser:listChoixUser) {
			for (Integer choixTirer:listChoixTirer) {
				if (choixUser.equals(choixTirer)) {
					listChoixTrue.add(choixUser);
				}
			}
		}
		
		return listChoixTrue;
	}

}
