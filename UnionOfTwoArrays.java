import java.util.HashSet;

public class UnionOfTwoArrays {
    public int union(int a[] , int b[] , int n , int n1){
        int res[] = new int[n+n1] ;
        for( int i = 0 ; i < n ; i++ ){
            res[i] = a[i];
        }

        for( int i = 0 ; i < n1 ; i++) {
            res[n + i] = b[i];
        }

        int ans = 0 ;
        for( int i = 0 ; i < n + n1 ; i++ ){
            boolean flag = false;
            for( int j = 0 ; j < i ; j++ ){
                if( res[i] == res[j] ){
                    flag = true;
                    break;
                }
                if(  flag == false )
                    ans++;

            }
        }
        return ans;
    }

    public int Union(int a[] , int b[] , int m , int n ){  // Efficient solution with O(n) time O(n) space complexity
        HashSet<Integer> S = new HashSet<Integer>();
        for( int i = 0 ; i < m ; i++ ){
            S.add(a[i]);
        }
        for( int i = 0 ; i < n ; i++ ){
            S.add(b[i]);
        }
        return S.size();
    }

    public static void main(String args[]){
        int arr[] = {15,20,5,15};
        int arr1[] = {15,15,15,20,10};
        UnionOfTwoArrays ob = new UnionOfTwoArrays();
        System.out.println(ob.union(arr,arr1,arr.length,arr1.length));
        System.out.print(ob.Union(arr,arr1,arr.length,arr1.length));
    }
}
