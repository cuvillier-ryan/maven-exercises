import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;

        System.out.println(num);

        System.out.println(DoubleMath.isMathematicalInteger(num));

        int largeNum = Integer.MAX_VALUE;
        System.out.println(largeNum + 1);
        try {
            System.out.println(IntMath.checkedAdd(largeNum, 1));
        } catch (ArithmeticException e) {
            System.out.println("That number is too big, genius.");
            String nameTag = "Hell, My Name is Joe!";
            String[] cutupTag = nameTag.split(",");
            System.out.println(cutupTag.length);
        }
    }
}


