import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Set<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println("Множество из 5 элементов");
        for (String s : set) {
            System.out.println(s);
        }
        set.add("a");
        System.out.println("Добавил дублирующий элемент\nВывод с помощью итератора");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ExObject exObject1 = new ExObject(1,"one");
        ExObject exObject2 = new ExObject(2,"two");
        ExObject exObject3 = new ExObject(3,"three");
        ExObject exObject4 = new ExObject(4,"four");
        ExObject exObject5 = new ExObject(5,"five");
        ExObject exObject6 = new ExObject(1,"one");

        System.out.println("Множество из объектов");

        Set<ExObject> exObjectSet  = new HashSet<ExObject>();
        exObjectSet.add(exObject1);
        exObjectSet.add(exObject2);
        exObjectSet.add(exObject3);
        exObjectSet.add(exObject4);
        exObjectSet.add(exObject5);

        for (ExObject exObject : exObjectSet) {
            System.out.println(exObject);
        }
        System.out.println("Добавил дублирующий объект");
        exObjectSet.add(exObject6);

        for (ExObject exObject : exObjectSet) {
            System.out.println(exObject);
        }

        System.out.println("Задание 2");

        List<ExObject> exObjectList = new ArrayList<ExObject>();
        exObjectList.add(exObject1);
        exObjectList.add(exObject2);
        exObjectList.add(exObject3);
        exObjectList.add(exObject4);
        exObjectList.add(exObject5);

        System.out.println("Список объектов");
        for (ExObject exObject : exObjectList) {
            System.out.println(exObject);
        }

        System.out.println("Список с добавлением объекта");
        for(int i =0; i< exObjectList.size(); i++){
            if(i==2){
                exObjectList.add(new ExObject(0,"zero"));
            }
            System.out.println(exObjectList.get(i));
        }

        System.out.println("Список с удалением объекта");
        for(int i =0; i< exObjectList.size(); i++){
            if(i==4){
                exObjectList.remove(1);
            }
            System.out.println(exObjectList.get(i));
        }
        System.out.println(exObjectList);

        System.out.println("Задание 3");

        System.out.println("Вывод hashmap");
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);

        for(String s : map.keySet()){
            System.out.println(s + " " + map.get(s));
        }
        System.out.println("Добавление элемента и одинаковым ключом");
        map.put("four",0);

        for(String s : map.keySet()){
            System.out.println(s + " " + map.get(s));
        }

        System.out.println("Задание 4");

        System.out.println("Сортированное множество из строк");

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("z");
        stringSet.add("b");
        stringSet.add("a");
        stringSet.add("d");
        stringSet.add("f");
        stringSet.add("c");

        System.out.println(stringSet);

        System.out.println("Сортированное множество из объектов");
        Set<ExObject> objectSet = new TreeSet<>();
        objectSet.add(new ExObject(5,"five"));
        objectSet.add(new ExObject(2,"two"));
        objectSet.add(new ExObject(4,"four"));
        objectSet.add(new ExObject(1,"one"));
        objectSet.add(new ExObject(3,"three"));

        System.out.println(objectSet);

        System.out.println("Задание 5");

        System.out.println("Отсортированная hashmap ключей строк");

        Map<String,Integer> stringMap = new TreeMap<>();
        stringMap.put("four",4);
        stringMap.put("one",1);
        stringMap.put("three",3);
        stringMap.put("two",2);
        stringMap.put("five",5);

        System.out.println(stringMap);

        System.out.println("Отсортированная hashmap объектов");
        Map<ExObject,Integer> objectMap = new TreeMap<>();
        objectMap.put(new ExObject(1,"one"),10);
        objectMap.put(new ExObject(2,"two"),19);
        objectMap.put(new ExObject(3,"three"),4);
        objectMap.put(new ExObject(4,"four"),32);
        objectMap.put(new ExObject(5,"one"),21);

        System.out.println(objectMap);
    }
}