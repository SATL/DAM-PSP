package process;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamFatherSon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process process;
		try {
			process = new ProcessBuilder(new String[] { "ls", "-l" }).start();

			// For windows
			// process = new ProcessBuilder(new String[] { "CMD", "/C", "dir"
			// }).start();

			InputStream is = process.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);

			BufferedReader br = new BufferedReader(isr);
			String line;
			System.out.println("Showing output dir");
			while ((line = br.readLine()) != null)
				System.out.println(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
