import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyThread implements Runnable{
    protected Human h;

    MyThread(Human _h)
    {
        this.h = _h;
    }

    public void run() {
        String hostName = "localhost";
        int portNumber = 8080;
        try {
            Socket me = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(me.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(me.getInputStream()));
            BufferedReader stdIn = new BufferedReader(
                    new InputStreamReader(System.in));
            String fromServer, fromUser;
            while ((fromServer = in.readLine()) != null) {
                System.out.println("Server: " + fromServer);
                if (fromServer.equals("Bye."))
                    break;

                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client: " + fromUser);
                    out.println(fromUser);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
