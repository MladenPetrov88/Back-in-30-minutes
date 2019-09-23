import java.util.Scanner;

public class BackInThirtyMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int lateMinutes = minutes + 30;
        if (lateMinutes >= 60) {
            hours += 1;
            lateMinutes -= 60;
        }

        if (hours >= 24) {
            hours -= 24;
        }

        System.out.printf("%d:%02d", hours, lateMinutes);
    }
}
