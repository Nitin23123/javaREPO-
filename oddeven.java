

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
            }
    }
}
