package process;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class StreamFatherSon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ProcessBuilder pb1;
			// pb1 = new ProcessBuilder(new String[] { "ls", "-l" });
			pb1 = new ProcessBuilder(new String[] { "CMD", "/C", "dir" });
			pb1.redirectOutput(Redirect.INHERIT);

			Process p1 = pb1.start();
			p1.waitFor();

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
