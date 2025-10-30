// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
        String currentValue = args[0];
        int numericValue = Integer.parseInt(currentValue);
        String interestRate = args[1];
        double numericInterestRate = Double.parseDouble(interestRate);
        String years = args[2];
        int numericYears = Integer.parseInt(years);
        double futureValue = numericValue * Math.pow((1+numericInterestRate), numericYears);

        System.out.println ("After " + numericYears + " years, $" + numericValue + " saved at "
                            + numericInterestRate + "% will yield $" + (int)(futureValue));

        

	}
}