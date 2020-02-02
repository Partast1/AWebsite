import java.net.MalformedURLException;
import java.net.URL;

public class URLFactory {

    public URL Create(String path) throws MalformedURLException {
        URL url = new URL(path);
        return url;
    }
}
