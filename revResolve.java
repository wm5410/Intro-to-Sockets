import java.net.*;

public class revResolve {

    public static void main(String[] args) {
        //See if args are provided
        if (args.length == 0) {
            System.out.println("Usage: revResolve <name1> <name2> ... <nameN>");
            return;
        }
        //For loop to go through arguments provided 
        for (int i = 0; i < args.length; i++) {
            InetAddress ia;
            String ip;

            try {
                //Get variables from args
                ia = InetAddress.getByName(args[i]);
                ip = ia.getHostName();
                if (args[i].compareTo(ip) == 0) {
                    ip = "no name";
                }
            } catch (UnknownHostException e) {
                ip = "unknown host";
            }
            //Print message to console
            System.out.println(args[i] + " : " + ip);
        }
    }
}