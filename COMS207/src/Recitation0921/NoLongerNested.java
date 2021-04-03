package Recitation0921;
// don't forget to import
import java.util.Scanner;

public class NoLongerNested {
    public static void main(String[] args) {

        // make new scanner
        Scanner stdin = new Scanner(System.in);

        // user prompt
        System.out.print("Please choose from the following exercises options: \n");
        System.out.println("1, We will have String samba");
        System.out.println("2, We will have precedence ping pong");
        System.out.println("3, We will have modulo madness");

        int userChoice = stdin.nextInt();

        // How awkward is the control flow with nested if blocks! It took me 10 minutes to read it!
        // I wonder if there is a way to use "else-if" to refactor it to a more natural control flow?
        // Indentation shortcut. Windows: control+shift+F. Mac: command+shift+F
        if (userChoice == 1) {
        	// ********** STRING SAMBA ************
            System.out.println("Welcome to the String samba!");
            String statement = "System.out.println(\"\\\"Quotes\\\"\");";
            System.out.println("I have a java statement of length "+statement.length());
            System.out.println("What does it do: \n"+statement);
            System.out.println("Type \"samba\" to see the answer");
            // note that I did not initialize the scanner again. I reused it.
            String userInputString = stdin.next();
            if (userInputString.equals("samba")){
                System.out.print("It is: ");
                System.out.println("\"Quotes\"");
            }else{
                System.out.println("Well, if you already know the answer to String samba.");
            }
            // ******** STRING SAMBA ENDS *********
        
        }else if (userChoice == 2) {
        	 // ********** Precedence ping pong ************
            System.out.println("Welcome to the precedence ping pong!");
            System.out.println("What does this expression evaluate to: ");
            System.out.println(" 89 % 10/4 * 2.0/5 + (1.5 + 1.0/2) * 2");
            // Assigning to double to int incurs warning,
            // because Eclipse knows that the right hand side of the equation is double
            // int number =  89 % 10/4 * 2.0/5 + (1.5 + 1.0/2) * 2;
            double number =  89 % 10/4 * 2.0/5 + (1.5 + 1.0/2) * 2;
            System.out.println("Type \"pong\" to see the answer");
            String userInputString = stdin.next();
            if (userInputString.equals("pong")){
                System.out.println("The answer is: "+number);
            }else{
                System.out.println("Well, if you already know the answer to precedence ping pong.");
            }
            // ******** Precedence ping pong Ends **********
        	
        }else if (userChoice == 3) {
        	// ********** modulo madness ************
            System.out.println("Welcome to the modulo madness!");
            System.out.println("Man, what even is the value of i, j, k after all of this?");
            System.out.println(""+
                    "                    int a=5;\n" +
                    "                    int b=6;\n" +
                    "                    int c=4;\n" +
                    "                    b=a;\n" +
                    "                    a=b%c;\n" +
                    "                    c=c-a%b;\n" +
                    "                    System.out.println(\"a: \"+a);\n" +
                    "                    System.out.println(\"b: \"+b);\n" +
                    "                    System.out.println(\"c: \"+c);\n");


            int a=5;
            int b=6;
            int c=4;
            b=a;
            // 5, 5, 4
            a=b%c;
            // 1, 5, 4
            c=c-a%b;
            // 1, 5, 3

            System.out.println("Type \"madness\" to see the answer");
            String userInputString = stdin.next();
            if (userInputString.equals("madness")) {
                System.out.println("a: "+a);
                System.out.println("b: "+b);
                System.out.println("c: "+c);
            }else{
                System.out.println("Well, if you already know the answer to modulo madness.");
            }
            // ******** modulo madness Ends **********
        }else {
        	 System.out.println("You don't want to do exercises with me. :(");
        }
        // if user did not enter 1
        if (userChoice!=1){
            // if user did not enter 2
            if (userChoice != 2) {
                // if user did not enter 3
                if (userChoice!=3){
                    System.out.println("You don't want to do exercises with me. :(");
                }else{
                    // ********** modulo madness ************
                    System.out.println("Welcome to the modulo madness!");
                    System.out.println("Man, what even is the value of i, j, k after all of this?");
                    System.out.println(""+
                            "                    int a=5;\n" +
                            "                    int b=6;\n" +
                            "                    int c=4;\n" +
                            "                    b=a;\n" +
                            "                    a=b%c;\n" +
                            "                    c=c-a%b;\n" +
                            "                    System.out.println(\"a: \"+a);\n" +
                            "                    System.out.println(\"b: \"+b);\n" +
                            "                    System.out.println(\"c: \"+c);\n");


                    int a=5;
                    int b=6;
                    int c=4;
                    b=a;
                    // 5, 5, 4
                    a=b%c;
                    // 1, 5, 4
                    c=c-a%b;
                    // 1, 5, 3

                    System.out.println("Type \"madness\" to see the answer");
                    String userInputString = stdin.next();
                    if (userInputString.equals("madness")) {
                        System.out.println("a: "+a);
                        System.out.println("b: "+b);
                        System.out.println("c: "+c);
                    }else{
                        System.out.println("Well, if you already know the answer to modulo madness.");
                    }
                    // ******** modulo madness Ends **********
                }
            }else{
                // ********** Precedence ping pong ************
                System.out.println("Welcome to the precedence ping pong!");
                System.out.println("What does this expression evaluate to: ");
                System.out.println(" 89 % 10/4 * 2.0/5 + (1.5 + 1.0/2) * 2");
                // Assigning to double to int incurs warning,
                // because Eclipse knows that the right hand side of the equation is double
                // int number =  89 % 10/4 * 2.0/5 + (1.5 + 1.0/2) * 2;
                double number =  89 % 10/4 * 2.0/5 + (1.5 + 1.0/2) * 2;
                System.out.println("Type \"pong\" to see the answer");
                String userInputString = stdin.next();
                if (userInputString.equals("pong")){
                    System.out.println("The answer is: "+number);
                }else{
                    System.out.println("Well, if you already know the answer to precedence ping pong.");
                }
                // ******** Precedence ping pong Ends **********
            }
        }else{
            // ********** STRING SAMBA ************
            System.out.println("Welcome to the String samba!");
            String statement = "System.out.println(\"\\\"Quotes\\\"\");";
            System.out.println("I have a java statement of length "+statement.length());
            System.out.println("What does it do: \n"+statement);
            System.out.println("Type \"samba\" to see the answer");
            // note that I did not initialize the scanner again. I reused it.
            String userInputString = stdin.next();
            if (userInputString.equals("samba")){
                System.out.print("It is: ");
                System.out.println("\"Quotes\"");
            }else{
                System.out.println("Well, if you already know the answer to String samba.");
            }
            // ******** STRING SAMBA ENDS *********
        }
        System.out.println("Bye bye everyone");
    }
}
