import java.util.*;
import java.util.Scanner;

//Author: Hamza Busuri
public class BuildTreatWell
{


    public static void main(String[] args) {
        int height = 0;
        int width = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter height: ");
        height = scanner.nextInt();
        System.out.println("Enter width: ");
        width= scanner.nextInt();
        
        //Conditions to validate integer value
        if(height < 0){
            System.out.println("You have entered a negative number.");
        }
    
        else if(width < 0)
        {
            System.out.println("You have entered a negative number.");
        }

        else if(height == 0 || width ==0)
        {
            System.out.println("Please enter an integer greater than 0.");
        }
        else{
            createBox(height, width);
        }
        System.out.println("Press 0 to exit");
        int close = scanner.nextInt();
        if(close == 0){
            System.exit(0);
        }

    }

    public static void createBox(int h, int w){

        //This section of code creates the top section of the box

        //Create a new char array whereby the length is the width inputted
        char[] box = new char[w];

        //This will initialise the first element of the box with the given symbol.
        box[0] = '┌';

        //In the last position of the array, allocate it the given symbol.
        box[box.length-1] = '┐';

        //Loop through the length of the char array and print the symbol between the top right and top left elements.
        for(int i = 1; i<box.length -1; i++){
            box[i] = '─';
        }

        //Convert the char array into a String and print this
        System.out.println(new String(box));



        //This section of code creates the middle section of the box
        
        //Rebuild the initial char array whereby the length is the width inputted
        box = new char[w];

        //The reason why the height is decreased by 2 is because we only want to loop through the middle of the box and not the top and bottom
        for(int i = 0; i< h-2; i++){
            
            //This will initialise the left vertical elements of the box with the given symbol.
            box[0] = '│';

            //For the rest of the middle section, we want to keep it empty Similar to what we did with the '-' symbol for top/bottom section.
            for(int j = 1; j<box.length -1; j++){
                box[j] = ' ';
            }

            //This will initialise the right vertical elements of the box with the given symbol.
            box[box.length-1] ='│';

            //Convert the char array into a String and print this
            System.out.println(new String(box));
        }


        //This section of code creates the bottom section of the box which is very similar to the first section of code

        //Rebuild the initial char array whereby the length is the width inputted
        box = new char[w];

        //This will initialise the first element of the box with the given symbol.
        box[0] = '└';

        //In the last position of the array, allocate it the given symbol.
        box[box.length-1] = '┘';

        //Loop through the length of the char array and print the symbol between the bottom right and bottom left elements.
        for(int i = 1; i<box.length -1; i++){
            box[i] = '─';
        }

        //Convert the char array into a String and print this
        System.out.println(new String(box));


    }
}
