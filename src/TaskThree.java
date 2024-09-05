import java.util.Scanner;

public class TaskThree {
    public static void createCarFromUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj producenta:");
        String manufacturer = sc.nextLine();

        System.out.println("Podaj model:");
        String model = sc.nextLine();

        System.out.println("Podaj mase:");
        int weight = sc.nextInt();

        TaskTwo auto = new TaskTwo(weight, manufacturer, model);

        System.out.println(manufacturer + " " + model + " " + weight);
    }
}