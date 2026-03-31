// SEARCH FOR THE STRING FORMATING IN JAVA ON GOOGLE AND LEARN IT .
// this is the linl --> https://stackabuse.com/how-to-format-a-string-in-java-with-examples/

public class PreetyPrintig {
    public static void main(String[] args) {
        float a = 453.12345f;
        System.out.printf("Formatted number is %.2f", a); /*here printf print the statement in formatted manner and the
        "%" is the place holder and ".2" is for print 2 digit after decimal.
        But if the value close to the rounding off then it will print the rounded off value */
        System.out.println(" "); // it is for next line .
        // Here is the Example .

        float b = 453.1274f;
        System.out.printf("Formatted number is %.2f", b);
        System.out.println(" "); // it is for next line .

        System.out.println(Math.PI); // it will print all the value of PI .
        System.out.printf("Pie: %.3f", Math.PI); // it will print the standard value of PI which is 3.142 .

        System.out.println(" "); // it is for next line .

        System.out.printf("Hello My name is %s and I am %s", "Sarvesh" , "Developer"); // So basically here %s is a variable and "Sarvesh" , "Developer" are the value or argument.

    }
}