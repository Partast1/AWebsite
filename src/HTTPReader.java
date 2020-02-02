import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class HTTPReader implements Readable{

    private List<String> content = new ArrayList<>();
    public String Read(HttpURLConnection con) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(
                con.getInputStream()));
        String inputLine ;
        while ((inputLine = in.readLine()) != null) {
            content.add(inputLine);
        }
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < content.size() - 1) {
            sb.append(content.get(i));
            i++;
        }
        sb.append(content.get(i));

        String res = sb.toString();

        in.close();
        return res;
    }
}
