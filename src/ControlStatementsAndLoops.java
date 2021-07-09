import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
////  string comparison:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//// Don't do this!
//        boolean confirmation = userInput == "y";
//        System.out.println(confirmation);
//
////  Do this instead:
//        boolean rightConfirmation = userInput.equals("y");
//        System.out.println(rightConfirmation);

////  If and if/else/if Statement syntax
////        if (/* condition */) {
////            // conditional code that will only execute if the condition
////            // is met to be true
////        }
//
//        boolean someCondition = false;
//
//        boolean someOtherCondition = true;
//
//        if (someCondition) {
//            // executes if someCondition is true
//        } else if (someOtherCondition) {
//            // executes if someOtherCondition is true *and* all of the previous ifs in
//            // this block were false
//        } else {
//            // executes if none of the conditions checked in this block were true
//        }
//
////        use Integer to save a number variable
//        Integer eight = 8;
//        Integer ten = 10;
//        if(eight < ten){
//            System.out.println("eight is less than ten");
//        }

////  Switch Statement Syntax
//        int caseSwitch = 1;
////    comparing the caseSwitch to all the different cases (1, 2, etc.)
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }

////    While Loops
//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

////      Do While Loop
//        do {
//            System.out.println("You will see this despite the condition!");
//        } while (false);

////      For Loop
////        for(initializing point; condition; iteration/update)
//        for(int i = 0; i < 10; i += 1) {
////            execute code at each iteration
//            System.out.println("i is " + i);
//        }

//     EXERCISES
//        1. Loop Basics
//            a.WHILE
//        // create an integer variable i with a value of 5
//        int i = 5;
//        // create a while loop that runs so long as i is less than or
//        // equal to 15
//        while(i <= 15){
//            System.out.println(i + " ");
//            i += 1;
////            i++;
//        }

////            b. DO WHILE
//        int y = 0;
//        do {
//            System.out.println(y += 2);
//        } while (y < 100);

//        int y = 100;
//        do {
//            System.out.println(y -= 5);
//        } while (y > -10);

//        int y = 2;
//        do {
//            System.out.println(y);
//            y *= y;
//        } while (y < 1000); // how do I do this with 1000000
//
////

////     c. FOR LOOP
//        int i = 5;
//        for(i = 0; i <= 15; i++){
//            System.out.println(i+=1);
//        }

//        FIZZBUZZ
//        give i a starting point, set it to an int variable
//        int i = 0;
//        write a for loop that loops through 0 - 100 increment by 1;
//        for(i =0; i<=100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("fizzbuzz");
//            } else if (i % 5 == 0){
//                System.out.println("buzz");
//            } else if(i % 3 == 0){
//                System.out.println("fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//
    
    
    }
    
}
