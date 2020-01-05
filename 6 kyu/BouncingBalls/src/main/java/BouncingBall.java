public class BouncingBall {
	
	public static int bouncingBall(double h, double bounce, double window) {
		double num = h;
		int res = 0;
	    while(num>window){
	    	num*=bounce;
	    		res+=2;
	    }
      return res+1;
	}
}