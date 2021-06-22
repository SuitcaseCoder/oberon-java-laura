import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
//        install Scanner into this main method so we can use the
//        scanner object
        Scanner sc = new Scanner(System.in);
        
//        print out the line to the system that I provide
//        println - print new line
//        print - doesn't create a new line
//        /n also prints out new line
//        printf - prints out a formatted string
//        System.out.println("My name is Laura");
//        System.out.println("hey look! New Line!");
////        souf --> shortcut for System.out.printf()
//        System.out.printf("oh hey, sup? ");
////        print the formatted string:
//        String name = "Laura";
////        %s is a placeholder for a string, %S will uppercase the string
////        being passed in.
//        System.out.printf("My name is %s ", name);
//        System.out.printf("%n if you need me yell: %S ", name);
        
        
//        float currencyInPennies = 1000.12345f;
//
////        float is good for up to 8 decimal values
////        $%.4f --> rounds the last digit of the float up to the
////        decimal you said (1000.12345 will round at the 4th number up)
////        %f --> rounds the float
////        what does the f do at the end of the number -- you're saying
////        it's going to be a floating point number without the f it's
////        going to think it's a double
//        System.out.printf("I'll sell you swamp land for $%.4f per acre",
//                currencyInPennies);

//        SCANNER
//
//        System.out.println("what's your first name");
//        scanner's going to wait for the next something (enter key hit)
//        and then give
//        us a string from what's inputted
//        using the next() method doesn't record anything after the
//        first whitespace character
//        String firstName = sc.next();
////        this will print out the first full word that gets passed in
//        System.out.printf("You entered: %s\n", firstName);
//
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Your first name is: %s\n", firstName);
//        System.out.printf("Your last name is: %s\n", lastName);
    
////        nextInt() --  only listens for uninteruptted integers
//        System.out.print("enter a number: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);

//        nextLine() - accepts entire thing until new line is hit
//        System.out.println("tell me a secret: ");
//        String myString = sc.nextLine(); // doesn't need to prompt user
//        // for question, you can just start typing int he console
//        System.out.println(myString);
    
//        System.out.println("tell me something else:");
//        as long as there are words to pull from next then it will
//        continue to print out --> if I type out "hey girl hey" then it
//        will type out "hey" , "girl", "hey" each in a a new line
//        while(sc.hasNext()){
//            String word = sc.next();
//            System.out.println(word);
//        }


////        SCANNER QUIRKS
//        System.out.println("Please enter a number: "); //prompt for input
//
//        int num = sc.nextInt(); // to get the next integer
//
//        System.out.printf("%n Your number was: %d\n", num); // use
//        // printf to
//        // replace %d with the number
//
//        System.out.println("Please type a sentence");
//
//        String sentence = sc.nextLine();
//
//        System.out.println(sentence);
        
        sc.useDelimiter("\n"); // Java Scanner class method which is used to set the delimiting pattern of the Scanner which is in using
        System.out.println("please enter a number and a word: ");
        int num = sc.nextInt();
        String sentence = sc.next(); // forces to look for a new line
        // character // will read everything from where the last scanner
        // item stopped to the next enter
    
        System.out.println(num);
        System.out.println(sentence);
        
    }
}
