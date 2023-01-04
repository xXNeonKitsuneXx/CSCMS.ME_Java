import java.util.*;

//Didnt understand HashSet
public class Application {
    public static int getMinSubstrings(String res) {
        int right = 0;
        int count = 0;
        Set<Character> map = new HashSet<>();
        while(right < res.length()) {
            if (map.contains(res.charAt(right))) {
                count++;
                map.clear();
            }
            map.add(res.charAt(right));
            right++;
        }
        return count+1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toLowerCase();
        if (str.length() > 10000000)    return;
        System.out.println(getMinSubstrings(str));
    }
}