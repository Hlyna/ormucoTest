import java.util.Scanner;

public class questionA {

    public static final String line1 = "Enter the first line in the format (x1,x2)";
    public static final String line2 = "Enter the second line in the format (x3,x4)";
    public static final String overlap = "The numbers overlap";
    public static final String nOverlap= "The numbers don't overlap";
    public static final String errLine ="The line you entered doesn't follow the directives.";


    /*
    Function that returns the two numbers in each line, depending on the choice.
     */
    public static int numbers(String line, int choice) {
        int coma = 0;
        for(int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ',') {coma = i;}
        }
        //Checking if the line entered follows the directions.
        if( line.charAt(0) != '('  || coma == 0  || line.charAt(line.length()-1) != ')'  ){
            System.out.println(errLine);
            System.exit(-1);
        }
            int x1 = Integer.parseInt(line.substring(1, coma));
            int x2 = Integer.parseInt(line.substring(coma + 1, line.length() - 1));
        if(choice == 1){return x1;}
        return x2;
    }

    /*
    Function that returns True if the numbers overlap.
     */
    public static boolean overlap(int x1,int x2, int x3, int x4){

        boolean A = (x1 < x3) && (x1 < x4);
        boolean B = (x2 < x3) && (x2 < x4);
        boolean C = (x1 > x3) && (x1 > x4);
        boolean D = (x2 > x3) && (x2 > x4);

        return !((A && B) || (C && D));
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(line1);
        String line1 = myObj.nextLine();
        int x1=0, x2=0, x3=0, x4=0;
        try {
        x1 = numbers(line1,1);
        x2 = numbers(line1,2);

        System.out.println(line2);
        String line2 = myObj.nextLine();
        x3 = numbers(line2,1);
        x4 = numbers(line2,2);
        }catch (NumberFormatException e) {
            System.out.println(errLine);
            System.exit(-1);
        }
        if( overlap(x1,x2,x3,x4)) {System.out.println(overlap);}
        else {System.out.println(nOverlap);}
    }

}
