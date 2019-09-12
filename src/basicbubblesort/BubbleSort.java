/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbubblesort;

/**
 *
 * @title BasicBubbleSort.java
 * @author James Mitchell 92020474
 * @date 12/09/19
 * 
 */

// Java program for implementation of Bubble Sort
public class BubbleSort
{
    public static int parseCounter = 0;
    public static int swapCheckCounter = 0;
    
    void doBubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            parseCounter++;
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCheckCounter++;
                }
            }
        }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("The Unsorted array is");
        ob.printArray(arr);
        
        // apply sort
        ob.doBubbleSort(arr);
        System.out.println("The Basic Bubble Sorted array is");
        ob.printArray(arr);
        
        // parse counter
        System.out.println("The number of times the array was parsed was " + parseCounter);
        
        // swap check counter
        System.out.println("The number of compare operations was " + swapCheckCounter);
    }
}
