import javax.swing.plaf.synth.SynthUI;
import java.util.HashSet;

public class SubArrayWithGivenSum {
    boolean subArraySum(int arr[] , int n , int sum ){
        for( int i = 0 ; i < n ; i++ ){
            int curr_sum = 0 ;
            for( int j = i ; j < n ; j++ ){
                curr_sum += arr[j];
                if( curr_sum == sum )
                    return true;
            }
        }
        return false;
    }

    boolean SubArraySum( int arr[] , int n , int sum ){ // Sufficient solution with O(n) time complexity
        HashSet<Integer> s = new HashSet<Integer>();
        int pre_sum = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            pre_sum += arr[i];
            if( pre_sum == sum )            // Corner case if pre-sum is equal to sum.
                return true;
            if( s.contains(pre_sum - sum))
                return true;
            s.add(pre_sum);
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {5,8,6,13,3,-1};
        SubArrayWithGivenSum ob = new SubArrayWithGivenSum();
        System.out.print(ob.SubArraySum(arr,arr.length,19));
    }
}
