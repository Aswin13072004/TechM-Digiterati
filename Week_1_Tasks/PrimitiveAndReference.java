package Week_1_Tasks;

public class PrimitiveAndReference {

    // Method that attempts to modify a primitive variable
    public static void modifyPrimitive(int num) {
        num = 50; // Changing the value inside the method
        System.out.println("Inside modifyPrimitive method: num = " + num);
    }

    // Method that modifies an array (which is a reference variable)
    public static void modifyArray(int[] numbers) {
        numbers[0] = 99; // Modifying the first element of the array
        System.out.println("Inside modifyArray method: numbers[0] = " + numbers[0]);
    }

    public static void main(String[] args) {
        // Primitive variable
        int myNumber = 10;
        System.out.println("Before modifyPrimitive method: myNumber = " + myNumber);
        modifyPrimitive(myNumber);
        System.out.println("After modifyPrimitive method: myNumber = " + myNumber);

        // Reference variable (array)
        int[] myArray = { 1, 2, 3, 4, 5 };
        System.out.println("Before modifyArray method: myArray[0] = " + myArray[0]);
        modifyArray(myArray);
        System.out.println("After modifyArray method: myArray[0] = " + myArray[0]);
    }
}
