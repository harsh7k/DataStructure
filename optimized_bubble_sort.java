import java.util.Scanner;
import java.util.Arrays;
public class optimized_bubble_sort 
{
    static void sort(int [] arrA)
    {
        if(arrA==null || arrA.length==0)
            return;
        System.out.println("Original Array: " + Arrays.toString(arrA));
        boolean isSwapped;
        int size = arrA.length;
        for (int i = 0; i <size-1 ; i++) 
        {
            isSwapped = false;
            for (int j = 0; j <size-i-1 ; j++) 
            {
                if(arrA[j]>arrA[j+1])
                {
                    int temp = arrA[j];
                    arrA[j] = arrA[j+1];
                    arrA[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped==false)
            break;
        }
        System.out.println("Sorted Array: " +  Arrays.toString(arrA));
    }
    public static void main(String[] args) 
    {
        int [] arrA = {5, 1, 9, 3, 2, 10};
        sort(arrA);
        System.out.println("------------------------------");
        arrA = new int []{1, 2, 4, 6, 8, 10};
        sort(arrA);
    }
}
