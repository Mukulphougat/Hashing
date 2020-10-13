import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FrequencyOfElement {
    void printFreq( int arr[] , int n ){
        for( int i = 0 ; i < n ; i++ ){
            boolean flag = false;
            for( int j = i - 1 ; j >= 0 ; j-- ){
                if( arr[j] == arr[i] ){
                    flag = true;
                    break;
                }
            }
            if( flag == true )
                continue;
            int freq = 1 ;
            for( int j = i + 1 ; j < n ; j++ ){
                if( arr[j] == arr[i] ){
                    freq++;
                }
            }
            System.out.print(arr[i]+" : "+freq);
            System.out.println();
        }
    }

    void CountFreq(int arr[], int n){
        HashMap<Integer,Integer> Hm = new HashMap<Integer, Integer>();
        for( int i = 0 ; i < n ; i++ ) {
            if (Hm.containsKey(arr[i]))
                Hm.put(arr[i], Hm.get(arr[i]) + 1);
            else
                Hm.put(arr[i], 1);
        }
        for(Map.Entry<Integer,Integer> s: Hm.entrySet() ){
            System.out.print(s.getKey()+" : "+s.getValue());
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {10,10,10,10,11};
        FrequencyOfElement ob = new FrequencyOfElement();
        ob.printFreq(arr,arr.length);
        int arr1[] = {5,5,10,5};
        ob.CountFreq(arr1,arr1.length);
    }
}
