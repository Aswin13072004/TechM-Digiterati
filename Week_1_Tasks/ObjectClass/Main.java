package Week_1_Tasks.ObjectClass;

public class Main {
    public static void main(String[] args) {
        // Creating objects of User (with overridden methods)
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);

        // Creating objects of SecondUser (without overridden methods)
        SecondUser secondUser1 = new SecondUser("Alice", 25);
        SecondUser secondUser2 = new SecondUser("Alice", 25);

        // Printing objects using toString()
        System.out.println("User Object with toString(): " + user1);
        System.out.println("SecondUser Object without toString(): " + secondUser1);

        // Comparing objects using equals()
        System.out.println("Comparing User objects with equals(): " + user1.equals(user2));
        System.out.println("Comparing SecondUser objects without equals(): " + (secondUser1 == secondUser2));

        // Printing hashcodes
        System.out.println("User1 HashCode: " + user1.hashCode());
        System.out.println("User2 HashCode: " + user2.hashCode());
        System.out.println("SecondUser1 HashCode: " + secondUser1.hashCode());
        System.out.println("SecondUser2 HashCode: " + secondUser2.hashCode());
    }
}
