import java.util.HashSet;

public class SubArrayWithZeroSum {
    boolean isSum(int arr[] , int n ){
        for( int i = 0 ; i < n ; i++ ){
            int curr_sum = 0 ;
            for( int j = i ; j < n ; j++ ){
                curr_sum += arr[j];
                if( curr_sum == 0 )
                    return true;
            }
        }
        return false;
    }

    boolean IsSum( int arr[] , int n ){         // Sufficient Solution with O(n)
        HashSet<Integer> add = new HashSet<Integer>();
        int pre_sum = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            pre_sum += arr[i];
            if( add.contains(pre_sum))  // If pre-sum repeats than there is a sub-array with sum is equal to zero
                return true;
            if( pre_sum == 0 ) // This is for corner cases like when prefix sum become zero
                return true;
            add.add(pre_sum);
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {3,-1,-2,5,6,7};
        SubArrayWithZeroSum ob = new SubArrayWithZeroSum();
        System.out.print(ob.IsSum(arr,arr.length));
    }
}
