package org.example;
import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int arr[]= new int[5];
        int count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many matches:");
        int n= scan.nextInt();
        System.out.println("Enter the score of:");
        for(int i=0;i<n;i++)
        {
            if(n==0)
                break;
            System.out.println(i+1+ " match");
            arr[i]=scan.nextInt();
            count+=arr[i];
        }
        System.out.println("Scores of given matches are:");
        for(int j=0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println("\n");
        System.out.println("No. of matches are:"+n);
        System.out.println("Average of given scores is:"+count/n);

    }
}