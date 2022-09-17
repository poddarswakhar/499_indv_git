import org.junit.Assert;
import org.junit.Test;

public class tests {

    @Test
    public void feat_one_test(){
        int[] input = new int[]{2,4,7,8,5};
        int[] expected = new int[]{2,4, 5, 7, 8};

        int[] actual = ascending.sort_asc(input);
        Assert.assertArrayEquals(actual,expected);
    }

    @Test
    public void feat_two_test(){
        Integer[] input = new Integer[]{2,4,7,8,5};
        Integer[] expected = new Integer[]{8, 7, 5, 4, 2};

        Integer[] actual = descending.sort_desc(input);
        Assert.assertArrayEquals(actual,expected);
    }
}
