import java.util.Arrays;
public class removeElement {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int index=2;
        for(int i=arr.length-1;i>index;i--){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=0;
        String array=Arrays.toString(arr);
        System.out.println(array);
    }
}
