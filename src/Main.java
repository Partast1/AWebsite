import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException  {


        URLFactory path = new URLFactory();
        HTTPConnector http = new HTTPConnector();
        HTTPReader read = new HTTPReader();
        FileReader fileRead = new FileReader();
        WriterConsole conWrite = new WriterConsole();

        URL url = path.Create("Https://www.google.dk");
        HttpURLConnection con = http.Connect(url);
        String httpcontent = read.Read(con);
        String filecontent = fileRead.Read();
//        getPath

        conWrite.Write(filecontent);






    }

}
