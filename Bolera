package Proyecto1;

import javax.swing.JOptionPane;

public class Bolera {

	static String[] intArr0 = { "  -", "-", "-", "-", "-", "-", "-", "-" };
	static String[] intArr1 = { "  - ", "|", "|", "|", "|", "|", " -" };
	static String[] intArr2 = { "  - ", " ", "|", "|", "|", " ", " -" };
	static String[] intArr3 = { "  - ", " ", " ", "|", " ", " ", " -" };
	static String[] intArr4 = { "  -", "-", "-", "-", "-", "-", "-", "-" };

	static int contador;
	static int PntTotal;
	static int NTiradas = 0;
	static int InputInt;
	static int TiradasPermitidas = 4;
	static int NBolos = 9;
	
	
	public static void main(String[] args) {	

		System.out.println("     BOLERA!!\n");

		Bolera.PrintMap();

		TiradasPermitidas++;

		for (; contador != NBolos; NTiradas++) {

			if (NTiradas == TiradasPermitidas && contador != NBolos) {
				System.out.println("Se te han acabado los \ntiros, vuelve a intentarlo \n     más tarde.");
				break;
			}

			Bolera.InputUser();

			for (int i = 0; i < intArr3.length; i++) {
				double randomN = Math.round(Math.random() * 10);
				if (randomN < 8 & intArr3[i] == "|") {
					intArr3[i] = "*";
					for (int n = 0; n < intArr2.length; n++) {
						double randomN2 = Math.round(Math.random() * 10);
						if (intArr2[n] == intArr2[2] & intArr2[2] == "|" & randomN2 < 1.5) {
							intArr2[2] = "*";
						}
						if (intArr2[n] == intArr2[3] & intArr2[3] == "|" & randomN2 < 1.5) {
							intArr2[3] = "*";
						}
						if (intArr2[n] == intArr2[4] & intArr2[4] == "|" & randomN2 < 1.5) {
							intArr2[4] = "*";
						}
					}
				}
			}
			// Iniciador del segundo bolo de la columna (intArr2[3]).
			for (int i = 0; i < intArr2.length; i++) {
				double randomN = Math.round(Math.random() * 10);
				if (intArr2[i] == intArr2[3] & intArr2[3] == "|") {
					if (intArr3[3] == "*" & randomN < 6) {
						intArr2[3] = "*";
						for (int n = 0; n < intArr1.length; n++) {
							double randomN2 = Math.round(Math.random() * 10);
							if (intArr1[n] == intArr1[2] & intArr1[2] == "|" & randomN2 < 1.5) {
								intArr1[2] = "*";
							}
							if (intArr1[n] == intArr1[3] & intArr1[3] == "|" & randomN2 < 1.5) {
								intArr1[3] = "*";
							}
							if (intArr1[n] == intArr1[4] & intArr1[4] == "|" & randomN2 < 1.5) {
								intArr1[4] = "*";
							}
						}
					}
				}
			}
			// Iniciador del tercer bolo de la columna (intArr3[3]).
			for (int i = 0; i < intArr1.length; i++) {
				double randomN = Math.round(Math.random() * 10);
				if (intArr1[i] == intArr1[3] & intArr1[3] == "|") {
					if (intArr2[3] == "*" & randomN < 5) {
						intArr1[3] = "*";
					}
				}
			}
			// Iniciador de los bolos de la segunda fila (intArr2[2] // intArr2[4]).
			for (int i = 0; i < intArr2.length; i++) {
				double randomN = Math.round(Math.random() * 10);
				if (intArr2[i] == intArr2[2] & intArr2[2] == "|") {
					if (intArr2[3] == "*" & randomN < 5) {
						intArr2[2] = "*";
						for (int n = 0; n < intArr2.length; n++) {
							double randomN2 = Math.round(Math.random()* 10);
							if (intArr3[n] == intArr3[1] & intArr3[1] == "|" & randomN2 < 1.5) {
								intArr3[1] = "*";
							}
							if (intArr3[n] == intArr3[2] & intArr3[2] == "|" & randomN2 < 1.5) {
								intArr3[2] = "*";
							}
						}
					}
				}
				if (intArr2[i] == intArr2[4] & intArr2[4] == "|") {
					if (intArr2[3] == "*" & randomN < 5) {
						intArr2[4] = "*";
						for (int n = 0; n < intArr3.length; n++) {
							double randomN2 = Math.round(Math.random()* 10);
							if (intArr3[n] == intArr3[4] & intArr3[4] == "|" & randomN2 < 1.5) {
								intArr3[4] = "*";
							}
							if (intArr3[n] == intArr3[5] & intArr3[5] == "|" & randomN2 < 1.5) {
								intArr3[5] = "*";
							}
						}
					}
				}
			}

			// Iniciador del bolo izquierdo (intArr1[2]), se inicia por orden.
			for (int i = 0; i < intArr1.length; i++) {
				double randomN = Math.round(Math.random() * 10);
				if (intArr1[i] == intArr1[2] & intArr1[2] == "|") {
					if (intArr1[3] == "*" & intArr2[2] == "*" & randomN < 3.5) {
						intArr1[2] = "*";
					}
				}
			}
			// Iniciador de los bolos de la tercera fila (intArr1[1] // intArr1[4] //
			// intArr1[5]).
			for (int i = 0; i < intArr1.length; i++) {
				double randomN = Math.round(Math.random() * 10);
				if (intArr1[i] == intArr1[1] & intArr1[1] == "|") {
					if (intArr1[2] == "*" & intArr2[2] == "*" & randomN < 3.5) {
						intArr1[1] = "*";
					}
				}
				if (intArr1[i] == intArr1[4] & intArr1[4] == "|") {
					if (intArr1[3] == "*" & intArr2[4] == "*" & randomN < 3.5) {
						intArr1[4] = "*";
					}
				}
				if (intArr1[i] == intArr1[5] & intArr1[5] == "|") {
					if (intArr1[4] == "*" & intArr2[4] == "*" & randomN < 3.5) {
						intArr1[5] = "*";
					}
				}
			}

			if (InputInt == 1) {
				System.out.println("\n");
				Bolera.PrintMap();
				Bolera.Contador();
				System.out.println("\n      Ronda " + NTiradas + "\n\n");
			} else {
				break;
			}
		}
		if (InputInt == 1 && NTiradas <= TiradasPermitidas && contador == NBolos) {
			Bolera.Pnt();
			System.out.println(
					"\n    Felicidades!!" + "\nHas conseguido " + PntTotal + " puntos!!" + "\n     ~YOU WIN!!~");
		} else {
			System.out.println("    ~YOU LOSE~");
		}
	}

	public static void PrintMap() {

		for (int i = 0; i < intArr0.length; i++) {
			System.out.print(intArr0[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < intArr1.length; i++) {
			System.out.print(intArr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < intArr2.length; i++) {
			System.out.print(intArr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < intArr3.length; i++) {
			System.out.print(intArr3[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < intArr4.length; i++) {
			System.out.print(intArr4[i] + " ");
		}
	}

	public static int Contador() {

		contador = 0;

		for (int i = 0; i < intArr1.length; i++) {
			if (intArr1[i] == "*") {
				contador++;
			}
		}
		for (int i = 0; i < intArr2.length; i++) {
			if (intArr2[i] == "*") {
				contador++;
			}
		}
		for (int i = 0; i < intArr3.length; i++) {
			if (intArr3[i] == "*") {
				contador++;
			}
		}
		return contador;
	}

	public static int Pnt() {

		NTiradas--;

		switch (NTiradas) {
		case 1:
			PntTotal = 100;
			break;
		case 2:
			PntTotal = 75;
			break;
		case 3:
			PntTotal = 50;
			break;
		case 4:
			PntTotal = 25;
			break;
		default:
			if (NTiradas <= 10) {
				PntTotal = 15;
				if (NTiradas <= 6) {
					PntTotal = 20;
				}
			} else {
				PntTotal = 10;
			}

		}
		return PntTotal;
	}

	public static void InputUser() {

		if (NTiradas >= 1) {
			do {

				InputInt = Integer
						.parseInt(JOptionPane.showInputDialog("¿Quieres volver a tirar?" + " [1 -> Si // 0 -> No]: "));

				if (InputInt != 1 & InputInt != 0) {
					System.out.println("No te entiendo, te volvere a preguntar.");
				}
				if (InputInt == 1) {
					if (((TiradasPermitidas - 1) - NTiradas) > 0) {
						
						for (int i = 0; i <= 15; i++) {
							System.out.println("\n");
						}
						System.out.println(
								"    JUGUEMOS!!" + "\nTe quedan " + ((TiradasPermitidas) - NTiradas) + " tiradas.");
						break;
					} else {
						for (int i = 0; i <= 15; i++) {
							System.out.println("\n");
						}
						System.out.println("    JUGUEMOS!!" + "\nEsta será tu última ronda\n     SUERTE!!");
						break;
					}
				}
				if (InputInt == 0) {
					System.out.println("   Como quieras.");
					break;
				}
			} while (InputInt != 1);
		}

		if (NTiradas == 0) {
			do {

				NTiradas++;

				InputInt = Integer.parseInt(
						JOptionPane.showInputDialog("¿Quieres comenzar tu primera ronda? " + "[1 -> Si // 0 -> No]: "));

				if (InputInt != 1 & InputInt != 0) {
					System.out.println("\nNo te entiendo, te volvere a preguntar.");
				}
				if (InputInt == 1) {
					
					for (int i = 0; i <= 15; i++) {
						System.out.println("\n");
					}
					
					System.out.println("\n\n" + "    A JUGAR!!" + "\nComo máximo tendras " + (TiradasPermitidas - 1)
							+ "\nrondas para intentarlo.");
					break;
				}
				if (InputInt == 0) {
					System.out.println("\n\n   Como quieras.");
					break;
				}
			} while (InputInt != 1);
		}
	}
}
