package HW3;

public class Factorial {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        loopFact(10);
        long loopFactTime = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        recFact(10);
        long recFactTime = System.nanoTime() - startTime;
        System.out.println("Время вычисления факториала с помощью цикла - "+loopFactTime+" ns");
        System.out.println("Время вычисления факториала с помощью рекурсии - "+recFactTime+" ns");
        if (loopFactTime<recFactTime) System.out.println("Циклом быстрее");
        else System.out.println("Рекурсией быстрее");
    }

    private static int loopFact(int n){
        int ret = 1;
        for (int i = 1; i <= n; ++i) ret *= i;
        return ret;
    }

    private static int recFact(int n){
        if (n == 0) return 1;
        return n * recFact(n-1);
    }

}
