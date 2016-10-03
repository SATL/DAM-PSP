package threads;

public class RunThread {
	public static void main(String args[]) {
		// new HelloThread(); // Crea un nuevo hilo de ejecución

		new HelloThreadExtThread().start();
		System.out.println("Hola desde el hilo principal!");
		System.out.println("Proceso acabando.");
	}
}
