import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpExample {
    public static void main(String args[]) throws IOException {
        download();
        makeRequest();
    }
    public static void download() {
        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;
        try {
            url = new URL("http://stackoverflow.com/");
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));


            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        System.out.println("Page downloaded.");
    }
    public static void makeRequest() {
        try {
            URL url = new URL("https://dog.ceo/api/breeds/image/random");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}