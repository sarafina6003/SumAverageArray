/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayssumave;

import java.util.Scanner;

/**
 *
 * @author nyawira
 */
public class ArraysSumAve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, sum = 0;
        float average;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of marks you want to calculate:");
        n = s.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter all the marks:");
        
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = sum / n;
        System.out.println("Average:"+average);
        
    }
    
}
