package HW3;

import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArrays {

    public static void main(String[] args) {
        //a();
        //b();
        //c();
        //d();
        //e();
        f();
    }

    private static void a() {
        int[] arr = new int[50];
        for (int i =0;i<50;i++)
            arr[i] = 2*i+1;
        System.out.println(Arrays.toString(arr));
        for (int i =49;i>=0;i--)
            System.out.print(arr[i]+" ");
    }

    private static void b() {
        int[] arr = new int[20];
        final Random random = new Random();
        for(int i =0;i<20;i++)
            arr[i] = random.nextInt(11);
        System.out.println(Arrays.toString(arr));
    }

    private static void c() {
        int[] arr = new int[10];
        final Random random = new Random();
        for(int i =0;i<10;i++)
            arr[i] = random.nextInt(100)+1;
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<5;i++)
            arr[2*i+1]=0;
        System.out.println(Arrays.toString(arr));
    }

    private static void d() {
        int[] arr = new int[15];
        final Random random = new Random();
        for (int i = 0; i < 15; i++)
            arr[i] = random.nextInt(101) -50;
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        int min_i=0;
        int max=arr[0];
        int max_i=0;
        for (int i = 1; i < 15; i++){
            if (arr[i] <= min) { min=arr[i]; min_i=i;}
            if (arr[i] >= max) { max=arr[i]; max_i=i;}
        }
        System.out.println("Min="+min+" index="+min_i);
        System.out.println("Max="+max+" index="+max_i);
    }

    private static void e() {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        final Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr1[i] = random.nextInt(11);
            arr2[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        double avg1 = 0, avg2 = 0;
        for (int i = 0; i < 10; i++) {
            avg1+=arr1[i];
            avg2+=arr2[i];
        }
        avg1=avg1/10;
        avg2=avg2/10;
        System.out.println("Среднее первого="+avg1);
        System.out.println("Среднее второго="+avg2);
        if (avg1<avg2) System.out.println("У первого меньше");
        else
            if (avg2<avg1) System.out.println("У второго меньше");
            else System.out.println("равны");
    }

    private static void f(){
        int[] arr = new int[20];
        final Random random = new Random();
        for(int i =0;i<20;i++)
            arr[i] = random.nextInt(3)-1;
        System.out.println(Arrays.toString(arr));
        int[] qtn = new int[3]; //сколько -1,0,1
        for(int i =0;i<20;i++){
            switch (arr[i]){
                case -1: qtn[0]++; break;
                case 0: qtn[1]++; break;
                case 1: qtn[2]++; break;
                default: break;
            }
        }
        if (qtn[0] > qtn[1]) {
            if (qtn[0] < qtn[2]){
                System.out.println("1 чаще");
            }
            else if (qtn[0] > qtn[2]){
                System.out.println("-1 чаще");
            }
            else System.out.println("1 и -1 чаще");
        }
        else if (qtn[0] < qtn[1]){
            if (qtn[1] < qtn[2]){
                System.out.println("1 чаще");
            }
            else if (qtn[1] > qtn[2]){
                System.out.println("0 чаще");
            }
            else System.out.println("1 и 0 чаще");
        }
        else {
            if (qtn[0] < qtn[2]){
                System.out.println("1 чаще");
            }
            else if (qtn[0] > qtn[2]){
                System.out.println("-1 и 0 чаще");
            }
            else System.out.println("1 и -1 и 0 чаще");
        }




    }



}
