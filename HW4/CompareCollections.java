package HW4;

import java.util.*;

public class CompareCollections {

    public static void main(String[] args) {
        //a();
        //b();
        c();
    }

    private static void c(){
        Map<Integer,Circle> hashMap = new HashMap<>();
        Map<Integer,Circle> linkedHashMap = new LinkedHashMap<>();
        Map<Integer,Circle> treeMap = new TreeMap<>();

        for(int i = 0; i<100000; i++)
        {
            hashMap.put(i,new Circle(i,"red"));
            linkedHashMap.put(i,new Circle(i,"red"));
            treeMap.put(i,new Circle(i,"red"));
        }


        long startTime = System.nanoTime();
        hashMap.put(100000,new Circle(100000,"red"));
        long hastMapAdd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedHashMap.put(100000,new Circle(100000,"red"));
        long linkedHashMapAdd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        treeMap.put(100000,new Circle(100000,"red"));
        long treeMapAdd = System.nanoTime()-startTime;

        System.out.println("Добавление в HashMap: "+hastMapAdd);
        System.out.println("Добавление в LinkedHashMap: "+linkedHashMapAdd);
        System.out.println("Добавление в TreeMap: "+treeMapAdd);


        startTime = System.nanoTime();
        hashMap.containsValue(new Circle(50000,"red"));
        long hashMapContains = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedHashMap.containsValue(new Circle(50000,"red"));
        long linkedHashMapContains = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        treeMap.containsValue(new Circle(50000,"red"));
        long treeMapContains = System.nanoTime()-startTime;

        System.out.println("Поиск в HashMap: "+hashMapContains);
        System.out.println("Поиск в LinkedHashMap: "+linkedHashMapContains);
        System.out.println("Поиск в TreeMap: "+treeMapContains);

        startTime = System.nanoTime();
        hashMap.remove(50000);
        long hashMapRemove = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedHashMap.remove(50000);
        long linkedHashMapRemove = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        treeMap.remove(50000);
        long treeMapRemove = System.nanoTime()-startTime;

        System.out.println("Удаление в HashMap: "+hashMapRemove);
        System.out.println("Удаление в LinkedHashMap: "+linkedHashMapRemove);
        System.out.println("Удаление в TreeMap: "+treeMapRemove);
    }

    private static void b() {

        Set<Circle> hashSet = new HashSet<>();
        Set<Circle> linkedHashSet = new LinkedHashSet<>();
        Set<Circle> treeSet = new TreeSet<>();

        for(int i = 0; i<100000; i++)
        {
            hashSet.add(new Circle(i,"red"));
            linkedHashSet.add(new Circle(i,"red"));
            treeSet.add(new Circle(i,"red"));
        }


        long startTime = System.nanoTime();
        hashSet.add(new Circle(100000,"red"));
        long hastSetAdd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedHashSet.add(new Circle(100000,"red"));
        long linkedHashSetAdd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        treeSet.add(new Circle(100000,"red"));
        long treeSetAdd = System.nanoTime()-startTime;

        System.out.println("Добавление в HashSet: "+hastSetAdd);
        System.out.println("Добавление в LinkedHashSet: "+linkedHashSetAdd);
        System.out.println("Добавление в TreeSet: "+treeSetAdd);


        startTime = System.nanoTime();
        hashSet.contains(new Circle(50000,"red"));
        long hashSetContains = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedHashSet.contains(new Circle(50000,"red"));
        long linkedHashSetContains = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        treeSet.contains(new Circle(50000,"red"));
        long treeSetContains = System.nanoTime()-startTime;

        System.out.println("Поиск в HashSet: "+hashSetContains);
        System.out.println("Поиск в LinkedHashSet: "+linkedHashSetContains);
        System.out.println("Поиск в TreeSet: "+treeSetContains);

        startTime = System.nanoTime();
        hashSet.remove(new Circle(50000,"red"));
        long hashSetRemove = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedHashSet.remove(new Circle(50000,"red"));
        long linkedHashSetRemove = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        treeSet.remove(new Circle(50000,"red"));
        long treeSetRemove = System.nanoTime()-startTime;

        System.out.println("Удаление в HashSet: "+hashSetRemove);
        System.out.println("Удаление в LinkedHashSet: "+linkedHashSetRemove);
        System.out.println("Удаление в TreeSet: "+treeSetRemove);

    }

    private static void a() {


        List<Circle> arrayListList = new ArrayList<>();
        List<Circle> linkedListList = new LinkedList<>();

        for(int i = 0; i<100000; i++)
        {
            arrayListList.add(new Circle(i,"red"));
            linkedListList.add(new Circle(i,"red"));
        }


        long startTime = System.nanoTime();
        arrayListList.add(new Circle(100000,"red"));
        long arrayListAddEnd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedListList.add(new Circle(100000,"red"));
        long linkedListAddEnd = System.nanoTime()-startTime;

        System.out.println("Добавление в конец ArrayList: "+arrayListAddEnd);
        System.out.println("Добавление в конец LinkedList: "+linkedListAddEnd);

        startTime = System.nanoTime();
        arrayListList.add(50000,new Circle(100000,"red"));
        long arrayListAdd = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedListList.add(50000,new Circle(100000,"red"));
        long linkedListAdd = System.nanoTime()-startTime;

        System.out.println("Добавление в середину ArrayList: "+arrayListAdd);
        System.out.println("Добавление в середину LinkedList: "+linkedListAdd);

        startTime = System.nanoTime();
        arrayListList.indexOf(new Circle(50000,"red"));
        long arrayListSearch = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedListList.indexOf(new Circle(50000,"red"));
        long linkedListSearch = System.nanoTime()-startTime;

        System.out.println("Поиск в ArrayList: "+arrayListSearch);
        System.out.println("Поиск в LinkedList: "+linkedListSearch);

        startTime = System.nanoTime();
        arrayListList.remove(50000);
        long arrayListRemove = System.nanoTime()-startTime;
        startTime=System.nanoTime();
        linkedListList.remove(50000);
        long linkedListRemove = System.nanoTime()-startTime;

        System.out.println("Удаление в ArrayList: "+arrayListRemove);
        System.out.println("Удаление в LinkedList: "+linkedListRemove);


    }

}
