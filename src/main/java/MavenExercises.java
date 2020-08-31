import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercises {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String userInput = input.nextLine();
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is a number");
        } else {
            System.out.println("\"" + userInput + "\" is not a number");
        }
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
