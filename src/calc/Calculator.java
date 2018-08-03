package calc;

public class Calculator {
	
	
	
	public static <T extends Number> void add(T num1, T num2){
	    double sum = 0;
	    sum = num1.doubleValue() + num2.doubleValue();
	    System.out.println("Sum = " + sum);
	} 
	
	public static <T extends Number> void subtract(T num1, T num2){
        double difference = 0;
        difference = num1.doubleValue() - num2.doubleValue();
	    System.out.println("Difference = " + difference);
	} 
	
	
	public static <T extends Number> void multiply(T num1, T num2){
        double product = 0;
        product = num1.doubleValue() * num2.doubleValue();
	    System.out.println("Product  = " + product);
	} 
	
	public static <T extends Number> void divide(T num1, T num2){
        double quotient = 0;
        quotient = num1.doubleValue() / num2.doubleValue();
	    System.out.println("Quotient = " + quotient);
	}	 
	

}
