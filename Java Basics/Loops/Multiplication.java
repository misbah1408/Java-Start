import java.util.*;
public class Multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n +" x " + i + " = " + n*i);
        }
        sc.close();
    }
}
