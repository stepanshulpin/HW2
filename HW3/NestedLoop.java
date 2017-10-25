package HW3;

public class NestedLoop {

    public static void main(String[] args) {
        //rectangle(4,5);
        //triangleBottomLeft(5);
        //triangleTopLeft(5);
        notZ(5);
    }

    private static void rectangle(int rows, int columns)
    {
        for (int row = 1;row<=rows;row++) {
            for (int col = 1;col<=columns;col++)
                System.out.print('#');
            System.out.println();
        }
    }

    private static void triangleBottomLeft(int rows){
        for (int row = 1;row<=rows;row++) {
            for (int col = 1;col<=row;col++)
                System.out.print('#');
            System.out.println();
        }
    }

    private static void triangleTopLeft(int rows){
        for (int row = 1;row<=rows;row++) {
            for (int col = row;col<=rows;col++)
                System.out.print('#');
            System.out.println();
        }
    }

    private static void notZ(int rows)
    {
        for(int i = 1;i<=rows;i++)
            System.out.print('#');
        System.out.println();
        for(int row = 2;row<rows;row++) {
            for(int col = 1;col<rows;col++) {
                if (col == row) System.out.print('#');
                else  System.out.print(' ');
            }
            System.out.println();
        }
        for(int i = 1;i<=rows;i++)
            System.out.print('#');
    }


}
