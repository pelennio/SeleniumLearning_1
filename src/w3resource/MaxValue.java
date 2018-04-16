package w3resource;

/**
 * Created by len4ik on 3/20/18.
 */
public class MaxValue {
    public int MaxValue(int arr[]) {
        int max;
        max=arr[0];
        for (int i=1; i<=arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }


        return max;
    }
}
