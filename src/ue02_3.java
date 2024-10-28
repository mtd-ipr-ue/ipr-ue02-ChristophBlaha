import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.print("x-Koordinate: ");
        double x = In.readDouble();
        Out.print("y-Koordinate: ");
        double y = In.readDouble();
        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (x > 0 && y > 0 && z > 4) {
            Out.println("Der Punkt liegt außerhalb des Kreises");
        } else {
            Out.println("Der Punkt liegt innerhalb des Kreises");
        }
    }
}
