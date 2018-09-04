public class Intro {
    public static void main(String[] args) {

        // Print one asterisk to the console.
        System.out.print("*");
        System.out.println();

        // Draw a horizontal line

        String output = "";
        for(int i=0; i<3; i++) {
            output += "*";
        }
        System.out.print(output);

        System.out.println();


        //Draw a vertical line

        for (int i=0; i<8; i++) {
            System.out.println("*");
        }

        System.out.println();


        // Draw a right triangle

        String rightTriangleOutput = "";
        for (int i=0; i<3; i++){
            rightTriangleOutput += "*";
            System.out.print(rightTriangleOutput);
            System.out.println();

        }

    }
}

