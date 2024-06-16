package algorithms.isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "egg";
        String s3 = "bar";

        System.out.print(isIsomorphic(s1, s2)==true);
        System.out.print(isIsomorphic(s1, s3)==false);
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s==null || t==null || (s.length() != t.length())) {
            return false;
        }

        if (s.isEmpty() || t.isEmpty()) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            Character c = getKey(map, c2);
            if(c != null && c != c1) {
                return false;
            } else if(map.containsKey(c1)) {
                if(c2 != map.get(c1)) {
                    return false;
                }
            } else {
                map.put(c1, c2);
            }
        }
        return true;
    }

    private static Character getKey(Map<Character, Character> map, char target) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getValue().equals(target)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
