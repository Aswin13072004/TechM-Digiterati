package Week_1_Tasks.Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramFinder {

    // Method to find all starting indices of anagrams of p in s
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length())
            return result; // Edge case

        int[] pFrequency = new int[26]; // Frequency array for p
        int[] sFrequency = new int[26]; // Sliding window frequency array for s

        // Populate the frequency array for p
        for (char c : p.toCharArray()) {
            pFrequency[c - 'a']++;
        }

        int windowSize = p.length();
        // Populate the first window
        for (int i = 0; i < windowSize; i++) {
            sFrequency[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(pFrequency, sFrequency)) {
            result.add(0);
        }

        // Sliding window through s
        for (int i = windowSize; i < s.length(); i++) {
            // Add new character to window
            sFrequency[s.charAt(i) - 'a']++;

            // Remove the character that is sliding out
            sFrequency[s.charAt(i - windowSize) - 'a']--;

            // Check if current window is an anagram
            if (Arrays.equals(pFrequency, sFrequency)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}
