package Application.Establishment.LoginSecurity.testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

import net.bytebuddy.jar.asm.ClassReader;

public class CsvReader {

	public List<String[]> LoginFile() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login.csv"));
		List<String[]> loginData = new ArrayList<String[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			loginData.add(nextLine);
		}
		reader.close();
		return loginData;
	}
	/////////////////////////////////////////////	CreateBasicInformationAlphabet
	public List<String[]> CreateBasicInformationAlphabet_year() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/yearValueBasicInformationAlphabet.csv"),',','\'',1);
		List<String[]> basicInformationData = reader.readAll();
		reader.close();
		return basicInformationData;
	}
	
	public List<String[]> CreateBasicInformationAlphabet_month() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/monthValueBasicInformationAlphabet.csv"),',','\'',1);
		List<String[]> basicInformationData = reader.readAll();
		reader.close();
		return basicInformationData;
	}
	public List<String[]> CreateBasicInformationAlphabet_day() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/dayValueBasicInformationAlphabet.csv"),',','\'',1);
		List<String[]> basicInformationData = reader.readAll();
		reader.close();
		return basicInformationData;
	}
/////////////////////////////////////////////////	CreateBasicInformationValues
	public List<String[]> CreateBasicInformationValues() throws IOException {
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/valueBasicInformationValues.csv"),',','\'',1);
		List<String[]> basicInformationData = reader.readAll();
		
		reader.close();
		return basicInformationData;
	}
	
//	public List<String[]> CreateBasicInformationValues() throws IOException {
//		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/valueBasicInformationValues.csv"),',','\'',1);
//		List<String[]> basicInformationData = reader.readAll();
//		String[] nextLine;
//		while ((nextLine = reader.readNext()) != null) {
//			basicInformationData.add(nextLine);
//		}
//		reader.close();
//		return basicInformationData;
//	}
}
