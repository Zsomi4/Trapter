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
		}
	}
}

