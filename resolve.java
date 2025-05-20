import java.net.*;

public class resolve {

    public static void main(String[] args) {
        //See if arguments are provided
        if (args.length == 0) {
            System.out.println("Usage: resolve <name1> <name2> ... <nameN>");
            return;
        }
        //For loop to go through args and put them in variables
        for (int i = 0; i < args.length; i++) {
            InetAddress ia;
            String ip;
            //Put args into variables
            try {
                ia = InetAddress.getByName(args[i]);
                ip = ia.getHostAddress();
            } catch (UnknownHostException e) {
                ip = "unknown host";
            }
            //Print data to console
            System.out.println(args[i] + " : " + ip);
        }
    }
}