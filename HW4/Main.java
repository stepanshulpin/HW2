package HW4;


import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Circle> list = new MyLinkedList<>();

        list.add(new Circle(1.0,"red"));
        list.add(new Circle(2.0,"red"));

        list.add(new Circle(3.0,"black"));

        System.out.println(list);

        System.out.println("Площади");


        for (Circle c:list) {
            System.out.println(c.getArea());
        }

        Object[] circles = list.toArray();

        System.out.println("Печать из массива");

        for (Object c: circles) {

            System.out.println(c);

        }

    }
}
