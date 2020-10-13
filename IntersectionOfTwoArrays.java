import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int intersect(int arr[] , int arr1[] , int n , int n1){  // Naive Solution with O(m*(m+n))
        int res = 0 ;
        for( int i = 0 ; i < n ; i++ ){
            boolean flag = false;
            for( int j = 0 ; j < i - 1 ; j++ ){
                if( arr[i] == arr[j] ) {
                    flag = true;
                    break;
                }
                if( flag == true )
                    continue;

                for( int k = 0 ; k < n1 ; k++ ){
                    if( arr[i] == arr1[k] ){
                        res++;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public int Intersect(int a[] , int b[] , int n , int n1 ){  // Sufficient solution with O(n) time
        HashSet<Integer> duplicates = new HashSet<Integer>();   // and O(n) space complexity
        for( int i = 0 ; i < n ; i++ ){
            duplicates.add(a[i]);
        }
        int res = 0;
        for( int j = 0 ; j < n1 ; j++ ){
            if(duplicates.contains(b[j])){
                res++;
                duplicates.remove(b[j]);
            }
        }
        return res;
    }

    public static void main(String args[]){
        int arr[] = {10,15,20,15,30,30,5};
        int arr1[] = {30,5,30,80};
        IntersectionOfTwoArrays ob = new IntersectionOfTwoArrays();
        System.out.print(ob.Intersect(arr,arr1,arr.length,arr1.length));
    }
}
