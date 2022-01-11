package Application.Establishment.LoginSecurity.testCase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class DataProviders {
	//Login
	@DataProvider(name = "Login")
	public Iterator<Object[]> loginProvider() throws IOException{
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/Login.csv"),',','\'',1);
		List<Object[]> entriesLogin = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			entriesLogin.add(nextLine);
		}
		reader.close();
		return entriesLogin.iterator();
	}

}
