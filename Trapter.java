/*
* File: Trapter.java
* Author: Gubis Zsombor Dániel
* Copyright: 2022, Gubis Zsombor Dániel
* Group: Szoft_I_N
* Date: 2022-02-22
* Github: https://github.com/Zsomi4/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Trapter {
	public static void main(String[] args) {
		System.out.println("Gubis Zsombor Dániel, Szoft_I_N");
		try (Scanner scan = new Scanner(System.in)) {

			System.out.print("A oldal: ");
			double aoldal = scan.nextDouble();

			System.out.print("B oldal: ");
			double boldal = scan.nextDouble();

			System.out.print("C oldal: ");
			double coldal = scan.nextDouble();

			System.out.print("D oldal: ");
			double doldal = scan.nextDouble();

			double teruletegyikresze = (aoldal + boldal) / 4 * (aoldal - coldal);
			double teruletmasikresze = Math.sqrt((aoldal + boldal - coldal + doldal) * (aoldal - boldal - coldal + doldal) * (aoldal + boldal - coldal - doldal) * (-aoldal + boldal + coldal + doldal));
			double terulet = teruletegyikresze * teruletmasikresze;

			if (aoldal == 0) {
				System.out.println("Sajnálom, de az a oldal nem lehet 0.");
			} else if (coldal == 0) {
				System.out.println("Sajnálom, de a c oldal nem lehet 0.");	
			} else {
				System.out.printf("Terület: %f", terulet);
			}
		}
	}
}

