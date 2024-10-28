import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.print("Zahl 1: ");
        int num1 = In.readInt();
        Out.print("Zahl 2: ");
        int num2 = In.readInt();
        Out.print("Zahl 3: ");
        int num3 = In.readInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        Out.print("Die höchste Zahl ist " + max);
    }
}
