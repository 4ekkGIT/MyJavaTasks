import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = Arrays.stream(nums)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sum();

        System.out.println(result);
    }
}