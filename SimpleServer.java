import java.io.*;
import java.net.*;

public class SimpleServer {

    public static void main(String[] args) {

    try (ServerSocket serverSocket = new ServerSocket(0)) {
        System.out.println("Server listening on port " + serverSocket.getLocalPort());

            while (true) {
                // Wait for a new client connection
                Socket client = serverSocket.accept();
                
                PrintWriter write = 
					new PrintWriter(client.getOutputStream(), true);
                    
                    write.println("Hello, " + client.getInetAddress().getHostName());
                    write.println("Your IP address is " + client.getInetAddress().getHostAddress());

                // Close the client socket 
                client.close();
            }
            //Error handling
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

