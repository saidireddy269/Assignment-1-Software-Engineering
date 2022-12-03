package softwere;
import java.util.Scanner;
import java.lang.Math;

public class assignment {

				public static void main(String[] args) {
				System.out.println("Hello World");
				    int n = 0, k = 0;
				    Scanner input = new Scanner(System.in);
				    while ((n <= 2) || (n >= 12)) {
				        System.out.println ("Enter integer n such that 2 < n < 12: ");
				        n = Integer.parseInt(input.nextLine());
				    }
				    while (k <= 10) {
				        System.out.println("Enter upper limit k for x and y (k > 10): ");
				        k = Integer.parseInt(input.nextLine());
				    }
				   
				    int miss = Integer.MAX_VALUE;
				    double relativMiss = Integer.MAX_VALUE;
				   
				    for (int x = 10; x <= k; x++)
				        for (int y = 10; y <= k; y++) {
				            long lhs = (int) (Math.pow (x, n) + Math.pow (y, n));
				            if (lhs < 0) {
				                System.out.println("OVERFLOW ERROR!! Choose lower values of n and k");
				            }
				            int z = (int) Math.pow (lhs, 1.0/n);
				            int diff = (int)(lhs) - (int)(Math.pow (z, n));
				            if ((Math.pow (z + 1, n) - lhs) < diff) {
				                diff = (int)(Math.pow (z + 1, n)) - (int)(lhs);
				                z++;
				            }
				            double relDiff = 100. * diff / lhs;
				            if (relDiff < relativMiss) {
				                miss = diff;
				                relativMiss = relDiff;
				                System.out.println ("x value is "+x);
				                System.out.println ("y value is "+y);
				                System.out.println ("z value is "+z);
				                System.out.println ("diff is "+diff);
				                System.out.println ("relative miss is "+relDiff);
				            }
				        }

				}
				
				// TODO Auto-generated method stub

			
		// TODO Auto-generated method stub

	}


