import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int a){
        int res=1;
        for (int i=1;i<=a;i++){
            res *= i;
        }
        return res;
    }
}
