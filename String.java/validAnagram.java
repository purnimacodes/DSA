//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

//Example 1:

//Input: s = "anagram", t = "nagaram"
//Output: true

//Example 2:

//Input: s = "rat", t = "car"

//Output: false


class Solution {
    public boolean isAnagram(String s, String t) {
        // char both variable mai equal hona chaiye
        if(s.length() != t.length()){
            return false;
        }
         // char ka size 26 alphabet hota isliye frequency count karte
        int[] freq = new int[26];

        //s variable ke under s mai jitne char hote usko traverse karega ismai plus kar ke count karte hai
        for(int i = 0; i< s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
    // same ismai t char ko -- isliye hua hai ki jitna char s mai utne char t mai hone chaiye toh minus karengai toh 0 ho jayega
        for(int i = 0 ; i<t.length(); i++){
            freq[t.charAt(i) - 'a']--;
        }
    // ismai  sab ko har char ke frequency ko chalte hai agar 0 nhi aya toh false hoga because s aur t ke done ek dusre ke bara aayega toh count 0 hoga 
        for(int i =0; i<26; i++){
            if(freq[i] !=0){
                return false;
            }
        }
        return true;
    }
}
