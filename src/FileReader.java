import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Readable{
    public String Read(){
        try {

            File myObj = new File("C:/Users/asdf/Desktop/testen.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
        return null;
    }
}
