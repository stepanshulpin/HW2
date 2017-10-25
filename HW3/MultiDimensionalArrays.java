package HW3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        //a();
        //b();
        //c();
        d();
    }

    private static void a(){
        int[][] a = new int[8][8];
        final Random random = new Random();
        for (int i = 0; i<8;i++)
            for (int j= 0; j<8;j++)
                a[i][j]=random.nextInt(99)+1;
        for (int i = 0; i<8;i++)
            System.out.println(Arrays.toString(a[i]));
        int sumMainDiag=0;
        long multMainDiag=1;
        int sumSecDiag=0;
        long multSecDiag=1;
        for (int i = 0; i<8;i++)
        {
            sumMainDiag+=a[i][i];
            sumSecDiag+=a[i][8-i-1];
            multMainDiag*=a[i][i];
            multSecDiag*=a[i][8-i-1];
        }
        System.out.println("Сумма элементов главной диагонали: "+sumMainDiag);
        System.out.println("Сумма элементов побочной диагонали: "+sumSecDiag);
        System.out.println("Произведение элементов главной диагонали: "+multMainDiag);
        System.out.println("Произведение элементов побочной диагонали: "+multSecDiag);
    }

    private static void b(){
        int[][] a = new int[8][5];
        final Random random = new Random();
        for (int i = 0; i<8;i++)
            for (int j= 0; j<5;j++)
                a[i][j]=random.nextInt(199)-99;
        for (int i = 0; i<8;i++)
            System.out.println(Arrays.toString(a[i]));
        int max = a[0][0];
        int max_r = 0;
        int max_c = 0;
        for (int i = 0; i<8;i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    max_r = i;
                    max_c = j;
                }
            }
        }
        System.out.println("Максимум: "+max);
        System.out.println("Столбец: "+max_c+" строка: "+max_r);

    }
    private static void c() {
        int[][] a = new int[8][5];
        final Random random = new Random();
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 5; j++)
                a[i][j] = random.nextInt(21) - 10;
        for (int i = 0; i<8;i++)
            System.out.println(Arrays.toString(a[i]));
        int[] maxMult = new int[8];
        for (int i = 0; i < 8; i++)
            maxMult[i] = 1;
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 5; j++)
                maxMult[i]*=a[i][j];
        int max = Math.abs(maxMult[0]);
        int max_i = 0;
        for (int i = 1; i<8;i++){
            if (max<Math.abs(maxMult[i])){
                max=Math.abs(maxMult[i]);
                max_i=i;
            }
        }
        System.out.println("Строка с наибольшим произведением: "+max_i);
    }
    private static void d() {
        Integer[][] a = new Integer[10][7];
        final Random random = new Random();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 7; j++)
                a[i][j] = random.nextInt(101);
        for (int i = 0; i<10;i++)
            System.out.println(Arrays.toString(a[i]));
        for (int i = 0; i<10;i++)
            Arrays.sort(a[i]);
        System.out.println("Sorted:");
        for (int i = 0; i<10;i++)
            System.out.println(Arrays.toString(a[i]));
    }

}
