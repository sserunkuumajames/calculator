
package calculator;


	import java.util.Scanner;
	//import Calculator;

	public class Calculate {
		public static void main(String [] args)
		{
			Scanner paul = new Scanner(System.in);
			double a = 0;
			double b = 0;
			double addition;
			double subtraction;
			double multiplication;
			double division = 0;
			int counter;
			 //exit();
			try{
				for(counter =0;counter < 3;counter ++){
		System.out.println("Instantiating a Calculator...");
		//out put
		System.out.println("\t\tInitializing some variables...");
		System.out.println("::::::::SELECT FROM  THE MENU::::::");
		System.out.println("\tFOR ADDITION PRESS ..1");
		System.out.println("\tFOR SUBTRACT PRESS ..2");
		System.out.println("\tFOR MULTIPLY PRESS ..3");
		System.out.println("\tFOR DIVISION PRESS ..4");
		System.out.println("\tFOR   EXIT   PRESS ..5");
		System.out.println("::::::::::::::::::::::::::::::::::");
		System.out.println("\t");
		counter =paul.nextInt();
		switch(counter)
		{
		case 1:
		{
			System.out.println("Enter the first value");
			a = paul.nextDouble();
			System.out.println("Enter the next value");
			b = paul.nextDouble();
			addition = a + b;
			System.out.println( a + "+" + b +   "\t=\t" + addition);
			System.out.println("..................................");
			break;
		}
		case 2:
		{
			System.out.println("Enter the initial value\t");
			a = paul.nextDouble();
			System.out.println("Enter the next value");
			b = paul.nextDouble();
			subtraction = a - b;
			System.out.println( a + "-" + b + "\t=\t" + subtraction);
			System.out.println("___________________________________");
			break;
		}
		case 3:
		{
			System.out.println("Enter the first value");
			a = paul.nextDouble();
			System.out.println("Enter the next value");
			b = paul.nextDouble();
			multiplication = a * b;
			System.out.println( a + "*" + b + "\t=\t" + multiplication);
			System.out.println("::::::::::::::::::::::::::::::::::::");
			break;
		}
		
		case 4:
		{
			System.out.println("Enter the initial value");
			a = paul.nextDouble();
			System.out.println("Enter the next value ");
			b = paul.nextDouble();
			division = a / b;
			System.out.println( a + "/" + b + "\t=\t" + division);
			
			System.out.println("***********************************");
			break;
		}
		case 5:
		{
			System.out.println("exit");
			System.out.println("Thank for using paul's Calculator ...");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			break;
		}
		default:
		{
			System.out.println("Invalid Input \n \t...Please Select Again.......");
			break;
		}
			
		}
				}
			
			}catch(Exception e){
				System.out.println(e);
				System.out.println("Invalid entry");
				System.out.println("Please Enter only numbers for the calculator");
				System.out.println(":::::::::::::::::::::::::::::::::");
			}
			}
		
	}

	
	
}
