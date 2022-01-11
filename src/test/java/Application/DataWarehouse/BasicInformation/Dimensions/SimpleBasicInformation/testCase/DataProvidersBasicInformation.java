package Application.DataWarehouse.BasicInformation.Dimensions.SimpleBasicInformation.testCase;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.opencsv.CSVReader;

public class DataProvidersBasicInformation {
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
		
		//Title Basic Information
		@DataProvider(name = "TitleBasicInformation")
		public Iterator<Object[]> titleBasicInformationProvider() throws IOException{
			CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/titleBasicInformation.csv"),',','\'',1);
			List<Object[]> entriesBasicInformation = new ArrayList<Object[]>();
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				entriesBasicInformation.add(nextLine);
			}
			reader.close();
			return entriesBasicInformation.iterator();
		}
		
		//Value Basic Information
				@DataProvider(name = "ValueBasicInformation")
				public Iterator<Object[]> valueBasicInformationProvider() throws IOException{
					CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Data/valueBasicInformation.csv"),',','\'',1);
					List<Object[]> entriesBasicInformation2 = new ArrayList<Object[]>();
					String[] nextLine2;
					while ((nextLine2 = reader.readNext()) != null) {
						entriesBasicInformation2.add(nextLine2);
					}
					reader.close();
					return entriesBasicInformation2.iterator();
				}
				//////////////////////////////////////////////////////
				
				
}
