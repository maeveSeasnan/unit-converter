/**
 * 
 */
package unitconverter;
import java.util.Scanner;
/**
 * 
 */
public class UnitConverter 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
				int choice;
				
				do
				{
					System.out.println("\n--- Unit Converter ---");
					System.out.println("1. Inches to Centimeters");
		            System.out.println("2. Centimeters to Inches");
		            System.out.println("3. Fahrenheit to Celsius");
		            System.out.println("4. Celsius to Fahrenheit");
		            System.out.println("5. Pounds to Kilograms");
		            System.out.println("6. Kilograms to Pounds");
		            System.out.println("0. Exit");
		            System.out.print("Choose a conversion: ");
		            choice = scanner.nextInt();
		            
		            switch (choice)
		            {
		            case 1:
		            	System.out.print("Enter inches: ");
		            	double inches = scanner.nextDouble();
		            	System.out.println("Centimeters: " + (inches * 2.54));
		            	break;
		            case 2:
		            	System.out.print("Enter centimeters: ");
	                    double centimeters = scanner.nextDouble();
	                    System.out.println("Inches: " + (centimeters / 2.54));
	                    break;
	                case 3:
	                    System.out.print("Enter Fahrenheit: ");
	                    double fahrenheit = scanner.nextDouble();
	                    System.out.println("Celsius: " + ((fahrenheit - 32) * 5 / 9));
	                    break;
	                case 4:
	                    System.out.print("Enter Celsius: ");
	                    double celsius = scanner.nextDouble();
	                    System.out.println("Fahrenheit: " + ((celsius * 9 / 5) + 32));
	                    break;
	                case 5:
	                    System.out.print("Enter pounds: ");
	                    double pounds = scanner.nextDouble();
	                    System.out.println("Kilograms: " + (pounds * 0.453592));
	                    break;
	                case 6:
	                    System.out.print("Enter kilograms: ");
	                    double kilograms = scanner.nextDouble();
	                    System.out.println("Pounds: " + (kilograms / 0.453592));
	                    break;
	                case 0:
	                    System.out.println("Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
		            }
				}
				while (choice != 0);
				
				scanner.close();
	}

}
