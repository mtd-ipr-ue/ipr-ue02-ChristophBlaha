import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.print("Jahr ");
        int year = In.readInt();
        Out.print("Monat: ");
        int month = In.readInt();

        int amountDays = 0;

        if (year < 0) {
            Out.println("Fehler: Bitte ein gültiges Jahr eingeben");
            return;
        }

        if (month < 1 || month > 12) {
            Out.println("Fehler: Bitte ein gültiges Monat eingeben");
            return;
        }

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                amountDays = 31;
                break;
            case 4, 6, 9, 11:
                amountDays = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    // Schaltjahr
                    amountDays = 29;
                } else {
                    amountDays = 28;
                }
        }

        Out.print("Dieser Monat hat " + amountDays + " Tage");
    }
}
