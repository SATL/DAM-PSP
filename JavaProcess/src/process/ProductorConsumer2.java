package process;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class ProductorConsumer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File psFile = new File("./ps.txt");
		ProcessBuilder pb1 = new ProcessBuilder(new String[] { "ps", "aux"});
		ProcessBuilder pb2 = new ProcessBuilder(new String[] { "grep", "^root" });
		
		pb1.redirectOutput(psFile);
		pb2.redirectInput(psFile);
		pb2.redirectOutput(Redirect.INHERIT);

		try {
			Process p1 = pb1.start();
			p1.waitFor();
			Process p2 = pb2.start();
			p2.waitFor();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
