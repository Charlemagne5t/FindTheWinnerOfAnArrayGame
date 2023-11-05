import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getWinnerTest1(){
        int[] arr = {2,1,3,5,4,6,7};
        int k = 2;
        int expected = 2;
        int actual = new Solution().getWinner(arr, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWinnerTest2(){
        int[] arr = {3,2,1};
        int k = 10;
        int expected = 3;
        int actual = new Solution().getWinner(arr, k);

        Assert.assertEquals(expected, actual);
    }
}
