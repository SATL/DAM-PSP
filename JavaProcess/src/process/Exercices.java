package process;
import java.io.IOException;

public class Exercices {

	public static void cores() {
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println(cores);
	}

	public static void execRun(){
			Runtime runtime = Runtime.getRuntime();
		Process process;
		try {
			process = runtime.exec("dir");
			process.destroy();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Excepci�n de E/S!!");
			System.out.println(e.toString());
			System.exit(-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		execRun();
	}

}
