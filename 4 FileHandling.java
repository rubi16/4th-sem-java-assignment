import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File country = new File("Country.txt");
        File capital = new File("Capital.txt");
        File countryCapital = new File("countryCapital.txt");

        FileWriter fwCountryCapital = new FileWriter("countryCapital.txt");

        Scanner sc1 = new Scanner(country);
        Scanner sc2 = new Scanner(capital);

        while(sc1.hasNextLine() && sc2.hasNextLine()){
            String countryText = sc1.nextLine();
            String capitalText = sc2.nextLine();

            fwCountryCapital.write("The Capital of "+countryText+" is "+capitalText+"\n");
        }

        System.out.println("Data Entered to CountryCapital.txt");
        
        sc1.close();
        sc2.close();
        fwCountryCapital.close();
    }
}