import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C1_q7q16 {
    public static void main(String[] args) throws IOException {
        //q7
//        q7(1, 13);

        //q8
//        System.out.println(q8(6, 4));

//        q9();

//        q10();

//        q11();

//        q12();

//        q13();

//        q14_1(5);

//        q14_2(5);

//        q14_3(5);

//        q14_4(5);

//        q15(4);

//        q16(4);
    }
    public static void q7(int a, int b){
        if((b/2)*10 == 5){
            System.out.println((a+(b-1)) * (b-1)/2 + b);
        }else{
            System.out.println((a+b)*b/2);
        }
    }
    static int q8(int a, int b){
        int tmp;
        int sum = 0;
        if(a>b){
            tmp = a;
            a = b;
            b = tmp;
        }

        for(int i = a; i<=b; i++){
            sum += i;
        }
        return sum;
    }
    static void q9(){
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.print("a :");
        a = scanner.nextInt();
        do{
            System.out.print("b :");
            b = scanner.nextInt();
            if(b<=a){System.out.println("type bigger than a");}
        }while (b<=a);
        System.out.println("b-a = " + (b-a));
    }
    static void q10(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int num = 1;
        while(a/10 != 0){
            num++;
            a /= 10;
        }
        System.out.println(num + "'s digit");
    }
    static void q11(){
        System.out.printf("  |%3d%3d%3d%3d%3d%3d%3d%3d%3d\n",1,2,3,4,5,6,7,8,9);
        System.out.println("--+---------------------------");
        for(int i = 1; i <10; i++){
            System.out.print(i+" |");
            for(int j = 1; j < 10; j++){
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }
    static void q12(){
        System.out.printf("  |%3d%3d%3d%3d%3d%3d%3d%3d%3d\n",1,2,3,4,5,6,7,8,9);
        System.out.println("--+---------------------------");
        for(int i = 1; i <10; i++){
            System.out.print(i+" |");
            for(int j = 1; j < 10; j++){
                System.out.printf("%3d", i+j);
            }
            System.out.println();
        }
    }
    static void q13() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i<a; i++){
            System.out.println("*".repeat(a));
        }
    }
    static void q14_1(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q14_2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void q14_3(int n){
        for(int i = 0; i<n; i++){
            System.out.println(" ".repeat(i) + "*".repeat(n-i));
        }
    }

    static void q14_4(int n){
        for(int i = 1; i<=n; i++){
            System.out.println(" ".repeat(n-i) + "*".repeat(i));
        }
    }

    static void q15(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(" ".repeat(((2*n-1)-1)/2-i+1));
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.print(" ".repeat(((2*n-1)-1)/2-i+1));
            System.out.println();
        }
    }
    static void q16(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(" ".repeat(((2*n-1)-1)/2-i+1));
            for(int j = 1; j<=2*i-1; j++){
                System.out.print(i%10);
            }
            System.out.print(" ".repeat(((2*n-1)-1)/2-i+1));
            System.out.println();
        }
    }
}
