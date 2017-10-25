package HW3;

import java.util.Random;

public class ControlStructures {

    enum Letters {
        a,b,c,d,e,f,g,h,i,j,k,l,m,n,o
    }

    private static void elseIfCount(int[] qtn, int[] arr) {
        for (int i=0;i<50;i++){
            if (arr[i]==0) qtn[0]++;
            else {
                if (arr[i] == 1) qtn[1]++;
                else {
                    if (arr[i] == 2) qtn[2]++;
                    else {
                        if (arr[i] == 3) qtn[3]++;
                        else {
                            if (arr[i] == 4) qtn[4]++;
                            else {
                                if (arr[i] == 5) qtn[5]++;
                                else {
                                    if (arr[i] == 6) qtn[6]++;
                                    else {
                                        if (arr[i] == 7) qtn[7]++;
                                        else {
                                            if (arr[i] == 8) qtn[8]++;
                                            else {
                                                if (arr[i] == 9) qtn[9]++;
                                                else {
                                                    if (arr[i] == 10) qtn[10]++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void switchCaseCount(int[] qtn, int[] arr){
        for (int i=0;i<50;i++){
            switch (arr[i]){
                case 0:
                    qtn[0]++;
                    break;
                case 1:
                    qtn[1]++;
                    break;
                case 2:
                    qtn[2]++;
                    break;
                case 3:
                    qtn[3]++;
                    break;
                case 4:
                    qtn[4]++;
                    break;
                case 5:
                    qtn[5]++;
                    break;
                case 6:
                    qtn[6]++;
                    break;
                case 7:
                    qtn[7]++;
                    break;
                case 8:
                    qtn[8]++;
                    break;
                case 9:
                    qtn[9]++;
                    break;
                case 10:
                    qtn[10]++;
                    break;
            }
        }
    }

    private static void elseIfOut(Letters letter)
    {
        if (letter == Letters.a)
            System.out.println("a");
        else {
            if (letter == Letters.b)
                System.out.println("b");
            else {
                if (letter == Letters.c)
                    System.out.println("c");
                else {
                    if (letter == Letters.d)
                        System.out.println("d");
                    else {
                        if (letter == Letters.e)
                            System.out.println("e");
                        else {
                            if (letter == Letters.f)
                                System.out.println("f");
                            else {
                                if (letter == Letters.g)
                                    System.out.println("g");
                                else {
                                    if (letter == Letters.h)
                                        System.out.println("h");
                                    else {
                                        if (letter == Letters.i)
                                            System.out.println("i");
                                        else {
                                            if (letter == Letters.j)
                                                System.out.println("j");
                                            else {
                                                if (letter == Letters.k)
                                                    System.out.println("k");
                                                else {
                                                    if (letter == Letters.l)
                                                        System.out.println("l");
                                                    else {
                                                        if (letter == Letters.m)
                                                            System.out.println("m");
                                                        else {
                                                            if (letter == Letters.n)
                                                                System.out.println("n");
                                                            else {
                                                                if (letter == Letters.o)
                                                                    System.out.println("o");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void switchCaseOut(Letters letter)
    {
        switch (letter){
            case a:
                System.out.println("a");
                break;
            case b:
                System.out.println("b");
                break;
            case c:
                System.out.println("c");
                break;
            case d:
                System.out.println("d");
                break;
            case e:
                System.out.println("e");
                break;
            case f:
                System.out.println("f");
                break;
            case g:
                System.out.println("g");
                break;
            case h:
                System.out.println("h");
                break;
            case i:
                System.out.println("i");
                break;
            case j:
                System.out.println("j");
                break;
            case k:
                System.out.println("k");
                break;
            case l:
                System.out.println("l");
                break;
            case m:
                System.out.println("m");
                break;
            case n:
                System.out.println("n");
                break;
            case o:
                System.out.println("o");
                break;
        }
    }

    public static void main(String[] args) {

        //пример с enum
        Letters letter;
        letter = Letters.m;
        long startTime = System.nanoTime();
        switchCaseOut(letter);
        long switchCaseTime = System.nanoTime()-startTime;
        startTime = System.nanoTime();
        elseIfOut(letter);
        long elseIfTime = System.nanoTime() -startTime;
        System.out.println("Switch-case: "+switchCaseTime);
        System.out.println("Else-if: "+elseIfTime);

        //пример с массивом
        /*int[] arr = new int[50];
        final Random random=new Random();
        for (int i = 0; i<50;i++)
            arr[i]=random.nextInt(11);
        int[] qtn1 = new int[11];
        int[] qtn2 = new int[11];
        long startTime = System.nanoTime();
        switchCaseCount(qtn1,arr);
        long switchCaseCountTime = System.nanoTime()-startTime;
        startTime = System.nanoTime();
        elseIfCount(qtn2,arr);
        long elseIfCountTime = System.nanoTime() - startTime;
        System.out.println("Switch-case: "+switchCaseCountTime);
        System.out.println("Else-if: "+elseIfCountTime);*/


    }


}
