public class Main {
    public static void main(String[] args) {
        // Task 1
        TaskOne person = new TaskOne("Mik", "Pla", "GDN");

        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Address: " + person.getAddress());

        // Task 2
        TaskTwo merol = new TaskTwo(2000, "Mercedes", "CLS");
        TaskTwo paserati = new TaskTwo(1500, "Volkswagen", "Passat");
        TaskTwo japoniec = new TaskTwo(1800, "Toyota", "Corolla");

        merol.print();
        paserati.print();
        japoniec.print();

        // Task 3
        TaskThree.createCarFromUserInput();
    }
}
