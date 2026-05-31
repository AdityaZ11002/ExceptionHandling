package Checked_Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

// Example of Checked Exception

public class FileReader {

	public static void main(String[] args) {

		FileReader fileReader = new FileReader();
		fileReader.readFile();

	}

	public void readFile() {

		String fileName = "C:\\Users\\adity\\Java-Backend\\ExceptionHandling\\Day_3\\ExceptionHandling2\\sale.txt";
		try {
			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName)); // FileNotFoundException

			String line;
			while ((line = br.readLine()) != null) {

				String lineArr[] = line.split(",");
				String city = lineArr[3];
				if (city.equals("Bengalore")) {
					System.out.println(line);
				}

				System.out.println(line);
			}
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
