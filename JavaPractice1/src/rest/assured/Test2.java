package rest.assured;
import java.util.*;
public class Test2 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] array = new int[N];
        for(int i=0;i<N;i++){
            array[i]= scn.nextInt();
        }
        int sum =0;
        for(int i=0;i<N;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
