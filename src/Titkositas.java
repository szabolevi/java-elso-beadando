import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Titkositas {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("in.txt");
		try {
			 in = new FileInputStream(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("Nem adott meg argumentumot, a program a default file-t haszn�lja");
		}
		catch(FileNotFoundException e) {
			  System.out.println("Az argumentumk�nt megadott file nem tal�lhat�, a program a default file-t haszn�lja");
		}
		catch(Exception e) {
			  System.out.println(e.toString());
		}
        OutputStream out = new FileOutputStream("out.txt");
        int b;
        while ((b = in.read()) != -1) {
        	if (64 < b && b < 91 || 96 < b && b < 123) { // ASCII a-z �s A-Z
        		if (b == 90) { 
            		out.write(65); // Z-t cser�lj�k A-ra
            	}
        		else if (b == 122) {
            		out.write(97); // z-t cser�lj�k a-ra
            	}
        		else {
            		out.write(b + 1);
            	}
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
