//find largest /smallest element = Max-Min pattern
//Max-Min pattern
//assume first element is largest/smallest
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];

        }   
    }
    System.out.println("largest element is: " + max);
    }
}