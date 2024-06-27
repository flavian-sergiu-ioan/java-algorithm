package algorithms.leet_code.first_bad_version;

public class FirstBadVersion extends VersionControl {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    /*
    * 1, 2, 3, 4, 5
    * left = 1
    * right = 5
    * mid = 3
    * isBadVersion(3) -> false
    * left = 4
    * rigt = 5
    * mid = 4 -> right = 4
    * */
    public static int firstBadVersion(int n) {
       int left = 1;
       int right = n;
       while(left < right) {
           int mid = left + (right-left)/2;
           if (isBadVersion(mid)) {
               right = mid;
           } else {
               left = mid + 1;
           }
       }
       return left;
    }


}
