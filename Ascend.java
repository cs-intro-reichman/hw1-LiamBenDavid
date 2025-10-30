// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int minimumNum = 1;
        int limit = Integer.parseInt(args[0]);

        int a = (int)(Math.random()* limit) + minimumNum;
        int b = (int)(Math.random()* limit) + minimumNum;
        int c = (int)(Math.random()* limit) + minimumNum;


        System.out.println (a + " " + b + " " + c);

        int minNumber = Math.min(Math.min(a,b), c);
        int maxNumber = Math.max(Math.max(a,b), c);
        int midNumber = a + b + c - minNumber - maxNumber;

        System.out.println (minNumber + " " + midNumber + " " + maxNumber);



        







	}
}
