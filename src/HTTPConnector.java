import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPConnector implements Connect {

   public HttpURLConnection Connect(URL url) throws IOException {

       HttpURLConnection con = (HttpURLConnection) url.openConnection();
       con.setRequestMethod("GET");
       return con;
   }
}
