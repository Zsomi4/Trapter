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

import com.oracle.webservices.internal.api.EnvelopeStyle.Style;

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
			double terulet = teruletegyikresze + teruletmasikresze;

			if (aoldal < 10) {
				System.out.println("Sajnálom, de az a oldal nem lehet kisebb 10-nél.");
			} else if (coldal < 10) {
				System.out.println("Sajnálom, de a c oldal nem lehet kisebb 10-nél.");	
			} else {
				System.out.printf("Terület: %f", terulet);
			}
		}
	}
}

