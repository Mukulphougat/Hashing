import java.util.HashMap;

public class LongestSubArrayWithSumZero {
    int maxLen( int arr[] , int n , int sum ){ // Naive solution with O(n) time and O(1) space complexity.
        int res = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            int curr_sum = 0 ;
            for( int j = i ; j < n ; j++ ){
                curr_sum += arr[j];
                if( curr_sum == sum )
                    res = Math.max(res,j - i + 1);
            }
        }
        return res;
    }

    int MaxLen( int arr[] , int n , int sum ){  // Efficient solution with O(n) time and O(n) space complexity.
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        int pre_sum = 0 , res = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            pre_sum += arr[i];
            if( pre_sum == sum )
                res = i + 1 ;

            if( m.containsKey(pre_sum) == false )
                m.put(pre_sum,i);

            if(m.containsKey(pre_sum - sum)) {
                res = Math.max(res, i - m.get(pre_sum - sum));
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {5,8,-4,-4,9,-2,2};
        LongestSubArrayWithSumZero ob = new LongestSubArrayWithSumZero();
        System.out.print(ob.MaxLen(arr,arr.length,0));
    }
}
