package Java.Capitulo2;

public class Semaforo {
	public static void main(String[] args) {
		
		String luzVerde = "color verde";
		String luzAmbar = "color ambar";
		String luzRoja = "color rojo";	
		String semaforo = luzVerde;
		
		int nCambios = 0;
		int nCambiosMax = 10;
		
		while (nCambios <= nCambiosMax) {
			if (semaforo == luzVerde & nCambios <= nCambiosMax) {
				System.out.println("El semaforo se encuentra en " + semaforo.toUpperCase()
						+ "\nEl nº de cambios es : " + nCambios);
				semaforo = luzAmbar;
				nCambios = nCambios + 1;	
			}
			if (semaforo == luzAmbar & nCambios <= nCambiosMax) {
				System.out.println("\nEl semaforo se encuentra en " + semaforo.toUpperCase()
						+ "\nEl nº de cambios es : " + nCambios);
				semaforo = luzRoja;
				nCambios = nCambios + 1;
			}
			if (semaforo == luzRoja & nCambios <= nCambiosMax) {
				System.out.println("\nEl semaforo se encuentra en " + semaforo.toUpperCase()
						+ "\nEl nº de cambios es : " + nCambios + "\n");
				semaforo = luzVerde;
				nCambios = nCambios + 1;
			}
		}
	}
}
