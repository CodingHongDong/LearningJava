import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	// class : system, Math, FileWriter
	// instance : f1, f2
	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI); //3.14~~~
		System.out.println(Math.floor(1.8)); //1.0
		System.out.println(Math.ceil(1.8)); //2.0
		
		FileWriter f1 = new FileWriter("date.txt");
		f1.write("Hello");
		f1.write("Java");
		
		
		FileWriter f2 = new FileWriter("date2.txt");
		f2.write("Hello");
		f2.write("Java2");
		f2.close();
		
		f1.write("!!!");
		f1.close();
	}

}
