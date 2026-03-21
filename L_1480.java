import java.lang.reflect.Array;
import java.util.Arrays;

public class L_1480 {
    public static void main(String[] args) {
       int nums[] = {1,2,3,4};
       int len=nums.length;
       for(int i=1; i<len; i++){
          nums[i]=nums[i]+nums[i-1];
       }
       System.out.println(Arrays.toString(nums));
    }
}
