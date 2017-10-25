package HW4;


import java.util.LinkedList;

public class CompareMyAndJavaLinkedList {

    public static void main(String[] args) {
        MyLinkedList<Circle> myList = new MyLinkedList<>();
        LinkedList<Circle> javaList = new LinkedList<>();

        for(int i = 0; i<100000; i++)
        {
            myList.add(new Circle(i,"red"));
            javaList.add(new Circle(i,"red"));
        }


        long startTime = System.nanoTime();
        myList.add(new Circle(100000,"red"));
        long myListAddEnd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        javaList.add(new Circle(100000,"red"));
        long javaListAddEnd = System.nanoTime()-startTime;

        System.out.println("Добавление в конец моего списка: "+myListAddEnd);
        System.out.println("Добавление в конец java списка: "+javaListAddEnd);

        startTime = System.nanoTime();
        myList.add(50000,new Circle(100000,"red"));
        long myListAdd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        javaList.add(50000,new Circle(100000,"red"));
        long javaListAdd = System.nanoTime()-startTime;

        System.out.println("Добавление в середину мой списка: "+myListAdd);
        System.out.println("Добавление в середину java списка: "+javaListAdd);

        startTime = System.nanoTime();
        myList.indexOf(new Circle(50000,"red"));
        long myListSearch = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        javaList.indexOf(new Circle(50000,"red"));
        long javaListSearch = System.nanoTime()-startTime;

        System.out.println("Поиск в моем списке: "+myListSearch);
        System.out.println("Поиск в java списке: "+javaListSearch);

        startTime = System.nanoTime();
        myList.remove(50000);
        long myListRemove = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        javaList.remove(50000);
        long javaListRemove = System.nanoTime()-startTime;

        System.out.println("Удаление в моем списке: "+myListRemove);
        System.out.println("Удаление в java списке: "+javaListRemove);



    }

}
