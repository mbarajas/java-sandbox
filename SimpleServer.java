import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Date;

public class SimpleServer {

    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(8080);

        System.out.println("Listening for connection on port 8080.....");

        while (true) {
            try (Socket client = server.accept()) {
                InputStreamReader inputReader = new InputStreamReader(client.getInputStream());
                BufferedReader reader = new BufferedReader(inputReader);
                String line = reader.readLine();
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;

                while (!line.isBlank()) {
                    System.out.println(line);
                    line = reader.readLine();
                }

                client.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}
