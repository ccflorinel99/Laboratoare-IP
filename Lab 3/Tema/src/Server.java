import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String args[]) {
        int port = 8080;

        try {
            ServerSocket server = new ServerSocket(port);
            Socket client = server.accept();
            PrintWriter out =
                    new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            BufferedReader stdIn = new BufferedReader(
                    new InputStreamReader(System.in));
            out.println("Server: Conexiune realizata");

            String inputLine,outputLine;
            while ((inputLine = in.readLine()) != null) {
                outputLine = stdIn.readLine();
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
