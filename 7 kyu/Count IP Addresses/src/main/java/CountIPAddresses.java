//Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).
//
//All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.
//
//Examples
//ips_between("10.0.0.0", "10.0.0.50")  ==   50
//ips_between("10.0.0.0", "10.0.1.0")   ==  256
//ips_between("20.0.0.10", "20.0.1.0")  ==  246

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) throws UnknownHostException {

        InetAddress ipStart = InetAddress.getByName(start);
        InetAddress ipEnd = InetAddress.getByName(end);

        byte ipTS = 0;
        byte ipTE = 0;

        byte[] bytesS = ipStart.getAddress();
        byte[] bytesE = ipEnd.getAddress();

        for (byte b : bytesS) {
            ipTS += (b & 0xFF);
        }
        for (byte b : bytesE) {
            ipTE += (b & 0xFF);
        }

        return ipTE>ipTS? ipTE-ipTS:ipTS-ipTE;

//		System.out.println(start);
//		System.out.println(end);
//		String[] startS = start.split("\\.");
//		String[] endE = end.split("\\.");
//
//		long startSum= (Integer.parseInt(startS[0])*(256L)^3)+(Integer.parseInt(startS[1])*(256L)^2)+(Integer.parseInt(startS[2])*(256L)^1)+Integer.parseInt(startS[3]);
//		long endSum = (Integer.parseInt(endE[0])*(256L)^3)+(Integer.parseInt(endE[1])*(256L)^2)+(Integer.parseInt(endE[2])*(256L)^1)+Integer.parseInt(endE[3]);
//
//		for (int i = 0; i < startS.length; i++) {
//			System.out.println(Integer.parseInt(startS[i])*(256L)^3);
//		}
//		System.out.println("startSum: " +startSum);
//		System.out.println("endSum: "+endSum);
//		System.out.println(endSum>startSum? endSum-startSum: startSum-endSum);
//		System.out.println("_____________________________________");
//
//		return endSum>startSum? endSum-startSum: startSum-endSum;
    }
}
