/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
    //This is a void function which shows the menu to the user 
    public static void showMenu()
    {
        System.out.println("1. Convert Fahrenheit to Celsius");
		System.out.println("2. Convert Gallons to Liter");
		System.out.println("3. Convert Pounds to Kilograms");
		System.out.println("4. Convert Miles to Kilometers");
		System.out.println("5. Convert Inch to Centimeters");
		System.out.println("6. Convert Yards to Meter");
		System.out.println("7. Exit the program.");
    }
    //This function converts the number in Fahrenheit to Celsius if the user chooses option 1 this function executes
    public static double convertF_to_C(double num)
    {
        System.out.println("Temperature in F: " + String.format("%.2f", num));
        double celsius = (num - 32) * (5.0/9);
        System.out.println("Temperature in C: " + String.format("%.2f", celsius));
        return celsius;
    }
    //This function converts the number in Gallons to Liters if the user chooses option 2 this function executes
    public static double convertG_to_L(double num)
    {
        System.out.println("Number in Gallons: " + String.format("%.2f", num));
        double liters = num * 3.79;
        System.out.println("Number in Liters: " + String.format("%.2f", liters));
        return liters;
    }
    
    //This function converts the number in Pounds to Kilograms if the user chooses option 3 this function executes
    public static double convertP_to_KG(double num)
    {
        System.out.println("Number in Pounds: " + String.format("%.2f", num));
        double kilograms = num * 0.45;
        System.out.println("Number in Kilograms: " + String.format("%.2f", kilograms));
        return kilograms;
    }
    
    //This function converts the number in Miles to Kilometers if the user chooses option 4 this function executes
    public static double convertM_to_KM(double num)
    {
        System.out.println("Number in Miles: " + String.format("%.2f", num));
        double kilometers = num * 1.6;
        System.out.println("Number in Liters: " + String.format("%.2f", kilometers));
        return kilometers;
    }
    
    //This function converts the number in Inches to Centimeters if the user chooses option 5 this function executes
    public static double convertI_to_CM(double num)
    {
        System.out.println("Number in Inches: " + String.format("%.2f", num));
        double centimeters = num * 2.54;
        System.out.println("Number in Centimeters: " + String.format("%.2f", centimeters));
        return centimeters;
    }
    
    //This function converts the number in Yards to Meters if the user chooses option 6 this function executes
    public static double convertY_to_M(double num)
    {
        System.out.println("Number in Yards: " + String.format("%.2f", num));
        double meters = num * 0.91;
        System.out.println("Number in Meters: " + String.format("%.2f", meters));
        return meters;
    }
    
    
	public static void main(String[] args) {
	    //Scanner object for input
		Scanner input = new Scanner(System.in);
		showMenu(); //Function call for showMenu
		System.out.print("Enter choice: ");
		int choice = input.nextInt();
		//If the user enters the choice other than 7 this while loop will execute.
		while (choice != 7)
		{
		    System.out.print("Enter a number to convert: ");
		    double num_to_convert = input.nextDouble();
		    //After the user enters a value, the program checks if the choice user entered matches one of the cases, if not the defualt case is returned
		    double new_num;
		    switch(choice)
		    {
		        case 1: new_num = convertF_to_C(num_to_convert);
		            break;
		        case 2: if (num_to_convert > 0) { new_num = convertG_to_L(num_to_convert);}
		            break;
		        case 3: if (num_to_convert > 0) { new_num = convertP_to_KG(num_to_convert);}
		            break;
		        case 4: if (num_to_convert > 0) { new_num = convertM_to_KM(num_to_convert);}
		            break;
		        case 5: if (num_to_convert > 0) { new_num = convertI_to_CM(num_to_convert);}
		            break;
		        case 6: if (num_to_convert > 0) { new_num = convertY_to_M(num_to_convert);}
		            break;    
		        default: System.out.println("Invalid option!");
		            
		    }
		    showMenu(); //Function call for showMenu
		    System.out.print("Enter choice: ");
		    choice = input.nextInt();
		}
	}
}
