# Assignment-1-CS-2336
How to execute the program:
1. Go to Online GDB
2. Click on Upload file
3. Then select the java file
4. After that run the program by clicking on Run which is at the top next to the upload file.
5. After running the program, you are given a menu of options to choose from.
6. After inputting a number from one of the options, it tells you to input a number for conversion.
7. Based on the number you inputted, it should execute one of the functions and convert the number for conversion to something.
8. After that the menu displays again and prompting you again to input a number from the menu.
9. If you input 7 the program ends. 

Test Cases:
Test case 1
Input:
choice = 1;
num_to_convert = -8
Output:
new_num = -22.22
Test case 2:
choice = 2;
num_to_convert = 46
Output:
new_num = 174.34

PsuedoCode:
Output Menu;
Output 1. Convert Fahrenheit to Celsius;
Output 2. Convert Gallons to Liter;
Output 3. Convert Pounds to Kilograms;
Output 4. Convert Miles to Kilometers;
Output 5. Convert Inch to Centimeters;
Output 6. Convert Yards to Meter;
Output 7. Exit the program.;
Ask the user to input a number from the menu;
While(choice does not equal 7)
{
  Ask the user to input a number to convert in double;
  switch(choice)
  {
    case 1: If user chooses option 1 this case is executed and the number will be converted from Fahrenheit to Celsius;
        break to exit out of switch statement;
    case 2: If user chooses option 2 this case is executed and the number will be converted from Gallons to Liter;
        break to exit out of switch statement;
    case 3: If user chooses option 3 this case is executed and the number will be converted from Pounds to Kilograms;
        break to exit out of switch statement;
    case 4: If user chooses option 4 this case is executed and the number will be converted from Miles to Kilometers;
        break to exit out of switch statement;
    case 5: If user chooses option 5 this case is executed and the number will be converted from Inches to Centimeters;
        break to exit out of switch statement;
    case 6: If user chooses option 6 this case is executed and the number will be converted from Yards to Meters;
        break to exit out of switch statement;
    default: If user enters invalid option output Invalid Option!;
  }
  Then Output Menu again;
  Then ask the user again to input a number from the menu;
}
