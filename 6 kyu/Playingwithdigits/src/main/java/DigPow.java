public class DigPow {
	
	public static long digPow(int n, int p) {
		String strNum = n+"";
		int sum = 0, temp = 0;

		for(int i = 0; i<strNum.length(); i++,p++){
			sum += Math.pow(Integer.parseInt(strNum.substring(i, i+1)), p);
		}
    	if(sum%n==0){
		    return sum/n;
		}
    return -1;
	}
	
}
