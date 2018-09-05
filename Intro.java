import java.util.ArrayList;


public class Intro {
    public static void main(String[] args) {
        printOne();
        drawHorizontal(8);
        drawVertical(3);
        drawRightTriangle(3);
        drawIsoscelesTriangle(3);
        drawDiamond(3);
        drawDiamondWithName(3, "Michelle");
        fizzBuzz(15);
        generate(1);
        generate(30);

    }

       // Print one asterisk to the console.

    public static void printOne() {
        System.out.println("*");
    }

       // Draw a horizontal line

    public static void drawHorizontal(int n) {
        String output = "";
        for(int i = 0; i < n; i++) {
            output += "*";
        }
        System.out.print(output);
        System.out.println();
    }

        //Draw a vertical line

    public static void drawVertical(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

        System.out.println();
    }

        // Draw a right triangle

    public static void drawRightTriangle(int n) {
        String rightTriangleOutput = "";
        for (int i = 0; i < n; i++){
            rightTriangleOutput += "*";
            System.out.print(rightTriangleOutput);
            System.out.println();
        }
    }

//        Diamond Exercises
//        Isosceles Triangle
//        Given a number n, print a centered triangle. Example for n=3:

    public static void drawIsoscelesTriangle(int n){
        // lines to be repeated n number of times
        for (int i = 0; i<n; i++){
            //print out spaces
            for (int j=(n-2); j>=i; j--){
                System.out.print(" ");
            }
            //print out asterix
            for (int k=0; k<=(i*2); k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }


//        Diamond
//        Given a number n, print a centered diamond. Example for n=3:

    public static void drawDiamond(int n){
        // top half of diamond
        for (int i = 0; i<n; i++){
            //print out spaces
            for (int j=(n-2); j>=i; j--){
                System.out.print(" ");
            }
            //print out asterix
            for (int k = 0; k <= (i*2); k++){
                System.out.print("*");
            }

            System.out.println();
        }

        // bottom half of diamond
            // -2 to avoid middle line duplication(i.e. the n-th line)
        for (int i = (n-2); i >= 0; i--){
            //print out spaces
            for (int j = (n-2); j >= i; j--){
                System.out.print(" ");
            }
            //print out asterix
            for (int k = 0; k <= (i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//        Diamond with Name
//        Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:

    public static void drawDiamondWithName(int n, String name){
        // top half of diamond

        for (int i = 0; i<(n-1); i++){
            //print out spaces
            for (int j = (n-2); j >= i; j--){
                System.out.print(" ");
            }
            //print out asterix
            for (int k = 0; k <= (i*2); k++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println(name);


        // bottom half of diamond
        // -2 to avoid double up of middle line (i.e. the n-th line)
        for (int i = (n-2); i >= 0; i--){
            //print out spaces
            for (int j = (n-2); j >= i; j--){
                System.out.print(" ");
            }
            //print out asterix
            for (int k = 0; k <= (i*2); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //fizzBuzz
    public static void fizzBuzz(int n) {
        for(int i = 1; i <= n; i++) {
            String text = "";
            Boolean found = false;

            if (i % 3 == 0) {
                text += "Fizz";
                found = true;
            }

            if (i % 5 == 0) {
                text += "Buzz";
                found = true;
            }

            if (!found) {
                text = Integer.toString(i);
            }

            System.out.println(text);

        }
    }

    //Prime Factors
    //    Write a method generate(int n) that given an integer N will return a list of integers such
    // that the numbers are the factors of N and are arranged in increasing numerical order.

    public static void generate(int n){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();


        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n = n / i;
            }
        }
        System.out.println(primeFactors);
    }

    // NOTE: There are duplicates in the array



}

