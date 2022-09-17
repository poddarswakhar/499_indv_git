import java.util.Arrays;
import java.util.Collections;

public class descending {
    public static Integer[] sort_desc(Integer[]input){
        Arrays.sort(input, Collections.reverseOrder());
        return input;
    }
}
