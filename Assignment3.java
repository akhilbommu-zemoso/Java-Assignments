// Write a java function that will ping any host ( given as input ) and computes the median of
// the time taken to ping. Use the system ping utility, do not use any deprecated methods.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Assignment3 {
    public void runSystemCommand(String command) {
        int count = 0, i = 0;
        double[] timesArray = new double[10];
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = "";
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
                int index1 = s.lastIndexOf("=");
                int index2 = s.lastIndexOf("ms");
                if(index1 != -1 && index2 != -1 && count < 10){
                    count++;
                    double time = Double.parseDouble(s.substring(index1+1,index2-1));
                    timesArray[i++] = time;
                }
            }
            Arrays.sort(timesArray);
            System.out.println("Median Time to ping : "+(timesArray[4] + timesArray[5])/2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
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
     */

    public static void main(String[] args) throws IOException{
        String hostAddress = "google.com";
        Assignment3 obj = new Assignment3();
        // obj.sendPingRequest(hostAddress);
        obj.runSystemCommand("ping " + hostAddress);
    }
}
