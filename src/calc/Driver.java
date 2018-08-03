package calc;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	
		String firstNum;
		String secondNum;
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Enter B for byte");
		System.out.println("Enter S for short");
		System.out.println("Enter I for int");
		System.out.println("Enter L for long");
		System.out.println("Enter F for float");
		System.out.println("Enter D for double");
		String typeOption = scanner.next().toUpperCase();

		System.out.println("Enter first Number");
		firstNum = scanner.next();
		System.out.println("Enter second number");
		secondNum = scanner.next();
		
		System.out.println("Enter A to add");
		System.out.println("Enter S to subtract");
		System.out.println("Enter M to multiply");
		System.out.println("Enter D to divide");
		
		String option = scanner.next().toUpperCase();
				
		
		switch(typeOption) {
		case "B":
			byte b1 = Byte.parseByte(firstNum);
			byte b2 = Byte.parseByte(secondNum);

			if(option.equals("A")) {
				 Calculator.add(b1, b2);
			} else if(option.equals("S")) {
				Calculator.subtract(b1, b2);
			} else if(option.equals("M")) {
				Calculator.multiply(b1, b2);
			} else if(option.equals("D")) {
				Calculator.divide(b1, b2);
			}
			break;
			
		case "S":
			short s1 = Short.parseShort(firstNum);
			short s2 = Short.parseShort(secondNum);
			if(option.equals("A")) {
				Calculator.add(s1, s2);
			} else if(option.equals("S")) {
				Calculator.subtract(s1, s2);
			} else if(option.equals("M")) {
				Calculator.multiply(s1, s2);
			} else if(option.equals("D")) {
				Calculator.divide(s1, s2);
			}
			break;
		case "I":
			int i1 = Integer.parseInt(firstNum);
			int i2 = Integer.parseInt(secondNum);
			if(option.equals("A")) {
				Calculator.add(i1, i2);
			} else if(option.equals("S")) {
				Calculator.subtract(i1, i2);
			} else if(option.equals("M")) {
				Calculator.multiply(i1, i2);
			} else if(option.equals("D")) {
				Calculator.divide(i1, i2);
			}
			break;
			
		case "L":
			long l1 = Long.parseLong(firstNum);
			long l2 = Long.parseLong(secondNum);
			
			if(option.equals("A")) {
				Calculator.add(l1, l2);
			} else if(option.equals("S")) {
				Calculator.subtract(l1, l2);
			} else if(option.equals("M")) {
				Calculator.multiply(l1, l2);
			} else if(option.equals("D")) {
				Calculator.divide(l1, l2);
			}
			
			break;
		
		case "F":
			float f1 = Float.parseFloat(firstNum);
			float f2 = Float.parseFloat(secondNum);	
			
			if(option.equals("A")) {
				Calculator.add(f1, f2);
			} else if(option.equals("S")) {
				Calculator.subtract(f1, f2);
			} else if(option.equals("M")) {
				Calculator.multiply(f1, f2);
			} else if(option.equals("D")) {
				Calculator.divide(f1, f2);
			}
			
		case "D":
			double d1 = Double.parseDouble(firstNum);
			double d2 = Double.parseDouble(secondNum);
			
			if(option.equals("A")) {
				Calculator.add(d1, d2);
			} else if(option.equals("S")) {
				Calculator.subtract(d1, d2);
			} else if(option.equals("M")) {
				Calculator.multiply(d1, d2);
			} else if(option.equals("D")) {
				Calculator.divide(d1, d2);
			}
			
			scanner.close();

		}
		
	}
	
	

}
