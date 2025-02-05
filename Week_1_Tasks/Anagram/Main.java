package Week_1_Tasks.Anagram;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter string s: ");
        String s = scanner.nextLine();

        System.out.print("Enter string p: ");
        String p = scanner.nextLine();

        // Finding anagrams
        List<Integer> indices = AnagramFinder.findAnagrams(s, p);

        // Displaying results
        System.out.println("Starting indices of anagrams: " + indices);

        scanner.close();
    }
}
