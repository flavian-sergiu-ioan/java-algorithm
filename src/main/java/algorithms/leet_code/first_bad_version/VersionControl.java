package algorithms.leet_code.first_bad_version;

public class VersionControl {

    public static boolean isBadVersion(int mid) {
        return switch(mid) {
            case 1 -> false;
            case 2 -> false;
            case 3 -> false;
            case 4 -> true;
            case 5 -> true;
            default -> throw new IllegalArgumentException("version does not exist");
        };
    }
}
