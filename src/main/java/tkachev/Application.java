package tkachev;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("Second branch");
        System.out.println("new message");
        int[] integerList = {1, 5, 9, 3};
        Arrays.sort(integerList);

        System.out.println(Arrays.toString(integerList));
        System.out.println((Integer.MAX_VALUE - 1) / 2);
        System.out.println(Integer.MAX_VALUE);

    }
}
