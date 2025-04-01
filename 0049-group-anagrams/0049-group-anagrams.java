public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store the anagram groups.
        Map<String, List<String>> res = new HashMap<>();
        
        // Loop through each string in the input array.
        for (String s : strs) {
        //Create an array to count the frequency of each letter in the string.
            int[] count = new int[26];  // Array to store letter frequencies 
            
        //Loop through each character in the string and update the frequency count.
            for (char c : s.toCharArray()) {
                count[c - 'a']++;  // Update the count for the character `c`
            }
            
        // Convert the frequency count array to a string (to be used as the key).
            String key = Arrays.toString(count);  // Convert the count array to a string (unique signature)
            
    // If the key is not already in the map, add it with an empty list.
            res.putIfAbsent(key, new ArrayList<>());
            
        //Add the current string `s` to the list of anagrams for the given key.
            res.get(key).add(s);
        }
        
        // Step 8: Return the values (lists of anagrams) from the HashMap.
        return new ArrayList<>(res.values());  // Convert the map values to a list and return them
    }
}
