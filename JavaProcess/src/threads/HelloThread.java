package threads;

public class HelloThread implements Runnable {

	Thread t;

	public HelloThread() {
		// TODO Auto-generated method stub
		t = new Thread(this, "Nuevo Thread");
		System.out.println("Creando hilo:" + t);
		t.start();
	}

	public void run() {
		System.out.println("Hola desde el hilo creado!");
		System.out.println("Hilo finalizado");
	}

}
