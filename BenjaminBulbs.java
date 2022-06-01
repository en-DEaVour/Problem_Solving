package PepCoding;

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of bulbs U want-: ");
        int n = sc.nextInt();
        System.out.println("After toggling, bulbs that are ONN is -: ");
        for(int i=1; i*i <= n;i++)
        {
            System.out.println(i*i);
        }

    }
}
