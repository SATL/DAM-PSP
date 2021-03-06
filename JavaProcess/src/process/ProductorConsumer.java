package process;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ProductorConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder pb1 = new ProcessBuilder(new String[] { "ps", "aux"});
		ProcessBuilder pb2 = new ProcessBuilder(new String[] { "grep", "^root" });


		try {
			Process p1 = pb1.start();
			InputStream is1 = p1.getInputStream();
			BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));

			Process p2 = pb2.start();
			OutputStream os2 = p2.getOutputStream();
			BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(os2));
			InputStream is2 = p2.getInputStream();
			BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
			
			
			//ps1 Output
			String p1Output = null;
			while((p1Output = br1.readLine()) !=null)
				bw2.write(p1Output + "\n");
			bw2.close();

			String p2Output = null;
			while ((p2Output = br2.readLine()) != null)
				System.out.println(p2Output);

			p2.waitFor();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
