import java.util.HashSet;

public class DistinctElements {
    int countDist(int arr[], int n ){  // Naive solution with O(n ^ 2) time complexity.
        int res = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            boolean flag = false;
            for( int j = i - 1 ; j >= 0 ; j-- ){
                if( arr[j] == arr[i] ) {
                    flag = true;
                    break;
                }
            }
            if( flag == false )
                res++;
        }
        return res;
    }

    int CountDist(int arr[] , int n ){    // Efficient solution with O(n) time and O(n) space complexity.
        HashSet<Integer> s = new HashSet<Integer>();
        for( int i = 0 ; i < n ; i++ ){
            s.add(arr[i]);
        }
        return s.size();
    }

    public static void main(String args[]){
        int arr[] = {15,12,13,12,13,13,18};
        DistinctElements ob = new DistinctElements();
        System.out.println("Naive Solution: "+ob.countDist(arr,arr.length));
        System.out.println("Efficient Solution: "+ob.CountDist(arr,arr.length));
    }
}
