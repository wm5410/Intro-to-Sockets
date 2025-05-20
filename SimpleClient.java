import java.io.*;
import java.net.*;

public class SimpleClient {

    public static void main(String[] args) {
        try{
            //Define variables
            String ia = args[0];
            InetAddress address = InetAddress.getByName(ia);
            //String hostName = address.getHostAddress();
            int port = Integer.parseInt(args[1]);
            Socket server = new Socket(address, port);

            //Print data to be read by the server
            BufferedReader read = 
					new BufferedReader(new InputStreamReader(server.getInputStream()));
   
            System.out.println(read.readLine());
            System.out.println(read.readLine());
            server.close();
        }
        //Error Handling
        catch (IOException e) {
            System.err.println("Error connecting to the server");
            e.printStackTrace();
        }

    }

}
