// Write a java function that will ping any host ( given as input ) and computes the median of
// the time taken to ping. Use the system ping utility, do not use any deprecated methods.

import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Assignment3 {
    public void sendPingRequest(String host) throws IOException {
        long currentTime = System.currentTimeMillis();
        Inet4Address inetAddress = (Inet4Address) Inet4Address.getByName(host);
        if(inetAddress.isReachable(5000)) {
            System.out.println("Pinging to.. " + host);
            long timeTaken = System.currentTimeMillis() - currentTime;
            System.out.println("Time taken: " + timeTaken + "ms");
        }else{
            System.out.println("Host is not reachable");
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the host address to ping : ");
        String hostAddress = sc.nextLine();
        Assignment3 obj = new Assignment3();
        obj.sendPingRequest(hostAddress);
    }
}
