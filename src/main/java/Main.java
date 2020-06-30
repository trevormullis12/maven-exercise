import org.apache.commons.lang3.StringUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = sc.nextLine();
        System.out.print("You Entered: \"" + input + "\"");
        System.out.print("\n\"" + input + "\" is ");
        if (!StringUtils.isNumeric(input)) {
            System.out.print("not a number.");
        } else {
            System.out.print("a number.");
        }
        System.out.print("\nFlipped Case: " + StringUtils.swapCase(input));
        System.out.print("\nReversed: " + StringUtils.reverse(input));
    }
}
