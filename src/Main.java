/*
Question : Given an array of positive and negative numbers, arrange them in an alternate fashion such that
every positive number is followed by a negative and vice-versa maintaining the order of appearance.
The number of positive and negative numbers need not be equal. Begin with a negative number.
If there are more positive numbers, they appear at the end of the array. If there are more negative
numbers, they too appear at the end of the array.
____________________________________________________________________________________________________________________
Input 1:
N = 6
arr[] = {1, 2, 3, -4, -1, 4}
Output 1:
arr[] = {-4, 1, -1, 2, 3, 4}
Input 2:
N = 4
arr[] = {1, 2, 3, -4}
Output 2:
arr[] = {-4, 1, 2, 3}
 */
import java.util.Scanner;
public class Main {
    public static void  Rearrange_Class(int[] array, int n){
        int firstPointer = 0;
        int secondPointer = n - 1;
        while (firstPointer < secondPointer){
            while (secondPointer <= n - 1 && array[firstPointer] > 0)
                firstPointer += 1;
                while (secondPointer >= 0 && array[secondPointer] < 0)
                    secondPointer -= 1;
                if (firstPointer < secondPointer)
              swap(array,firstPointer,secondPointer);
            }
        if (firstPointer == 0 || firstPointer == n)
            return;
        int second_frist_pointer = 0;
        while (second_frist_pointer < n && firstPointer < n){
            swap(array,second_frist_pointer,firstPointer);
            firstPointer += 1;
            second_frist_pointer += 2;
        }
    }
    static void swap(int[] array, int firstpointer , int secondpointer){
        int swap = array[firstpointer];
        array[firstpointer] = array[secondpointer];
        array[secondpointer] = swap;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,sizeOfArray,n;
        System.out.println("Enter the size of array : ");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        n = array.length;
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        Rearrange_Class(array,n);
        for (start = 0; start < array.length; start++){
            System.out.print(" "+ array[start]);
        }
   }
}
