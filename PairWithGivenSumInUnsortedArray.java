import java.util.HashSet;

public class PairWithGivenSumInUnsortedArray {    // Naive solution with O(n ^ 2)
    boolean findPair( int arr[] , int sum , int n ){
        for( int i = 0 ; i < n ; i++ ){
            for( int j = i + 1 ; j < n ; j++ ){
                if( arr[i] + arr[j] == sum )
                    return true;
            }
        }
        return false;
    }

    boolean FindPair( int arr[] , int n , int sum ){    // Efficient Solution with O(n) time complexity.
        HashSet<Integer> set = new HashSet<Integer>();
        for( int i = 0 ; i < n ; i++ ){
            if( set.contains(sum-arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = {3,2,8,15,-8};
        PairWithGivenSumInUnsortedArray ob = new PairWithGivenSumInUnsortedArray();
        System.out.print(ob.FindPair(arr,arr.length,12));
    }
}
