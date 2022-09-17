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

}
