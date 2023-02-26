import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class C2_q1q6 {
    public static void main(String[] args) throws Exception{
//        q1();
        int[] arr = {2, 5, 1, 3, 9, 6, 7};
        int[] arr2 = new int[7];
//        q2(arr);
//        System.out.println(q3(arr));
//        q4(arr, arr2);
//        q5(arr, arr2);
        q6();
    }

    static void q1(){
        Random random = new Random();
        int num = random.nextInt(5)+1;
        System.out.println("num :" + num);
        int[] arr = new int[num];
        arr[0] = 100 + random.nextInt(90);
        System.out.println("arr[0] :" + arr[0]);
        int max = arr[0];
        for(int i = 1; i<num; i++){
            arr[i] = 100 + random.nextInt(90);
            System.out.println("arr["+i+"] :" + arr[i]);
            if(arr[i]>max){max = arr[i];}
        }
        System.out.println("max : " + max);
    }

    static void q2(int[] arr){
        int tmp;
        int len = arr.length-1;
        for(int i = 0; i < arr.length/2; i++){
            System.out.println(Arrays.toString(arr));
            System.out.println("a["+i+"] <-> a[" + (len-i) + "]");
            tmp = arr[i];
            arr[i] = arr[len-i];
            arr[len-i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("finish");
    }

    static int q3(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        return sum;
    }

    static void q4(int[] a, int[] b){
        if(a.length > b.length) {
            return;
        }
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        System.out.println("a : " + Arrays.toString(a) + " b : " + Arrays.toString(b));
    }
    static void q5(int[] a, int[] b){
        if(a.length > b.length) {
            return;
        }
        for(int i = 0; i < a.length; i++) b[a.length-1 - i] = a[i];

        System.out.println("a : " + Arrays.toString(a) + " b : " + Arrays.toString(b));
    }

    static void q6() throws Exception{
        int num;
        int cd;
        int cnoNum = -1;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] cno = new char[32];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("10진수를 기수 변환합니다.");
        do{
            System.out.print("변환하는 음이 아닌 정수 : ");
            num = Integer.parseInt(br.readLine());
        } while(num < 0);
        do {
            System.out.print("어떤 진수로 변환할까요? (2~36) : ");
            cd = Integer.parseInt(br.readLine());
        } while (cd < 2 || cd > 36);


        System.out.printf("%d|%10d\n", cd, num);
        while(num>cd){
            System.out.printf(" + ----------\n%d|%10d ··· %d\n", cd, num/cd, num%cd);
            cno[++cnoNum] = dchar.charAt(num % cd);
            num/=cd;
        }
        System.out.printf(" + ----------\n%12d ··· %d\n", num/cd, num%cd);
        cno[++cnoNum] = dchar.charAt(num % cd);


        System.out.print(cd + "진수로 ");
        for(int i = cnoNum; i >=0; i--){
            System.out.print(cno[i]);
        }
        System.out.print("입니다.");
    }
}

