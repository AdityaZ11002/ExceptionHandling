package TryWithResourses;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {
	public static void main(String[] args) {

		System.out.println("Drier main");

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\adity\\eclipse-workspace\\ExceptionHandling\\Day_5\\TryWithResourses\\Test.txt"));) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
