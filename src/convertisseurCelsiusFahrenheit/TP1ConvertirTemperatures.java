package convertisseurCelsiusFahrenheit;

import java.util.Scanner;

public class TP1ConvertirTemperatures {

	// https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20903-tp-convertissez-des-celsius-en-fahrenheit
	
		public static void main(String[] args) {
			System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
			char reponse = 'O';
			int reponseTypeConvertion = 0;
			double reponseNombreAConvertir = 0;
			double reponseConvertie = 0;
			Scanner scanner = new Scanner(System.in);
			while (reponse == 'O') {
				System.out.println("Choisissez le mode de conversion :");
				System.out.println("1 - Convertisseur Celsius - Fahrenheit");
				System.out.println("2 - Convertisseur Fahrenheit - Celsius");
				reponseTypeConvertion = scanner.nextInt();
				System.out.println("Température à convertir :");
				reponseNombreAConvertir = scanner.nextInt();
				switch (reponseTypeConvertion) {
					case(1):
						reponseConvertie = (((9*reponseNombreAConvertir)/5)+32);
						System.out.println(reponseNombreAConvertir + "°C correspond à " + reponseConvertie + " °F.");
						break;
					case(2):
						reponseConvertie = (((reponseNombreAConvertir - 32)*5)/9);
						System.out.println(reponseNombreAConvertir + "°F correspond à " + reponseConvertie + " °C.");
						break;
					default:
				}
				reponse = ' ';
				while (reponse != 'O' && reponse != 'N') {
					System.out.print("Souhaitez-vous convertir une autre température ? (O/N)");
					scanner.nextLine();
					reponse = scanner.nextLine().charAt(0);
				}
			}
			scanner.close();
			System.out.println("Au revoir !");
		}

		public static double arrondi(double A, int B) {
			  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}

}
