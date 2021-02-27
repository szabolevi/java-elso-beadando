import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Titkositas {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		 InputStream in = new FileInputStream("in.txt");
	        OutputStream out = new FileOutputStream("out.txt");
	        int b;
	        while ((b = in.read()) != -1) {
	        	if (64 < b && b < 91 || 96 < b && b < 123) {
	        		out.write(b + 1);
	        	}
	        	else {
	        		out.write(b);;
	        	}
	        }
	        out.flush();
	        in.close();
	        out.close();

	}

}
