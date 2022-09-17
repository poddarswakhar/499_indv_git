import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] input = new int[]{2,4,7,8,5};
        System.out.println("Input: ");
        System.out.println(Arrays.toString(input));
        int [] result_one = ascending.sort_asc(input);
        System.out.println("Output of Feature 1: ");
        System.out.println(Arrays.toString(result_one));

        Integer[] input_two = new Integer[]{2,4,7,8,5};
        Integer [] result_two = descending.sort_desc(input_two);
        System.out.println("Output of Feature 2: ");
        System.out.println(Arrays.toString(result_two));

    }
}
