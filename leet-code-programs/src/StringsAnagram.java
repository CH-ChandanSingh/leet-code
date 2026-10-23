public class StringsAnagram {

    public static void main(String[] args) {
        boolean isAnagramTest1 = isAnagram("rat", "car");
        System.out.println(" Is rat and car anagram "+isAnagramTest1);

        
        boolean isAnagramTest2 = isAnagram("listen", "silent");
        System.out.println(" Is listen and silent anagram "+isAnagramTest2);
    }

    public static boolean isAnagram(String s, String t) {

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();

        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[256];

        for(char c : char1) {
            count[c]++;
        }
        // for(int i = 0; i < s.length(); i++) {
        //     count[char1[i]]++;
        // }

        for(char c : char2) {
            count[c]--;
        }
        // for(int i = 0; i < t.length(); i++) {
        //     count[char2[i]]--;
        // }

        for(int c : count) {
            if(c != 0) {
                return false;
            }
        }

        return true;
    }
}