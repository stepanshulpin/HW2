package HW3;

import java.util.Arrays;
import java.util.Random;

public class SortProgram {

    public static void main(String[] args) {

        int[] a = new int[1000];
        createArray(a);
        int[] b = a.clone();
        int[] c = a.clone();
        long startTime = System.nanoTime();
        bubbleSort(a);
        long bubbleSortTime = System.nanoTime()-startTime;
        startTime = System.nanoTime();
        selectionSort(b);
        long selectionSortTime = System.nanoTime()- startTime;
        startTime = System.nanoTime();
        Arrays.sort(c);
        long arraysSortTime = System.nanoTime() - startTime;
        System.out.println("Сортировка пузырьком - "+bubbleSortTime+" ns");
        System.out.println("Сортировка выбором - "+selectionSortTime+" ns");
        System.out.println("Сортировка с помощью коллекции - "+arraysSortTime+" ns");
        if (bubbleSortTime<selectionSortTime) {
            if (bubbleSortTime < arraysSortTime) {
                System.out.println("Сортировка пузырьком самая быстрая");
            }
            else System.out.println("Сортировка с помощью коллекции самая быстрая");
        }
        else {
            if (selectionSortTime < arraysSortTime) {
                System.out.println("Сортировка выбором самая быстрая");
            }
            else System.out.println("Сортировка с помощью коллекции самая быстрая");
        }




    }

    private static void createArray(int[] arr){
        final Random random = new Random();
        for(int i = 0; i<arr.length-1;i++){
            arr[i]=random.nextInt(99)+1;
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length-1 ; i > 0 ; i--) {
            for (int j=0; j<i; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    private static void selectionSort (int[] arr) {
        for (int min=0;min<arr.length-1;min++) {
            int least = min;
            for (int j=min+1;j<arr.length;j++) {
                if(arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
    }

}
