import java.util.*;

public class Main {
    public static void main(String[] args) {


        // 1 Задание
        System.out.println("Задание 1");

        // Создал множество строк
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println("Множество из 5 элементов");
        // Вывел множество на экран с помощью цикла for each
        for (String s : set) {
            System.out.println(s);
        }
        // Добавил элемент, который уже есть
        set.add("a");
        System.out.println("Добавил дублирующий элемент\nВывод с помощью итератора");

        // Вывел на экран множество с помощью итератора, но дублирующей троки нет
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Создал несколько объектов своего класса и добавил во множество
        ExObject exObject1 = new ExObject(1,"one");
        ExObject exObject2 = new ExObject(2,"two");
        ExObject exObject3 = new ExObject(3,"three");
        ExObject exObject4 = new ExObject(4,"four");
        ExObject exObject5 = new ExObject(5,"five");
        ExObject exObject6 = new ExObject(1,"one");

        System.out.println("Множество из объектов");

        Set<ExObject> exObjectSet  = new HashSet<>();
        exObjectSet.add(exObject1);
        exObjectSet.add(exObject2);
        exObjectSet.add(exObject3);
        exObjectSet.add(exObject4);
        exObjectSet.add(exObject5);

        // Вывел тоже с помощью for each, добавил дублирующий оьъект, но при
        // повтооном выводе все не повторялись
        for (ExObject exObject : exObjectSet) {
            System.out.println(exObject);
        }
        System.out.println("Добавил дублирующий объект");
        exObjectSet.add(exObject6);

        for (ExObject exObject : exObjectSet) {
            System.out.println(exObject);
        }

        // 2 задание
        System.out.println("Задание 2");

        // Создал список из тех же объектов и вывел на экран
        List<ExObject> exObjectList = new ArrayList<>();
        exObjectList.add(exObject1);
        exObjectList.add(exObject2);
        exObjectList.add(exObject3);
        exObjectList.add(exObject4);
        exObjectList.add(exObject5);

        System.out.println("Список объектов");
        for (ExObject exObject : exObjectList) {
            System.out.println(exObject);
        }

        // Попытался добавить новый элемент в список, когда цикл был на 3
        // но он добавился в самый конец
        System.out.println("Список с добавлением объекта");
        for(int i =0; i< exObjectList.size(); i++){
            if(i==2){
                exObjectList.add(new ExObject(0,"zero"));
            }
            System.out.println(exObjectList.get(i));
        }

        // потом попробовал удалить 2 элемент, находясь на 5 позиции
        // во время вывода 2 все еще оставался, а 5 удалился
        // но во время вывода после цикла все нормально
        // как я понял в первый раз просто индексы сместились (i)
        System.out.println("Список с удалением объекта");
        for(int i =0; i< exObjectList.size(); i++){
            if(i==4){
                exObjectList.remove(1);
            }
            System.out.println(exObjectList.get(i));
        }
        System.out.println(exObjectList);


        // 3 задание
        System.out.println("Задание 3");


        // заполнил и вывел содержимое хэш таблицы
        System.out.println("Вывод hashmap");
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);

        for(String s : map.keySet()){
            System.out.println(s + " " + map.get(s));
        }

        // добавил пару с ключом, который уже есть
        // и пара заменилась
        System.out.println("Добавление элемента и одинаковым ключом");
        map.put("four",0);

        for(String s : map.keySet()){
            System.out.println(s + " " + map.get(s));
        }


        // 4 задание
        System.out.println("Задание 4");

        System.out.println("Сортированное множество из строк");
        // нужно было создать сортированное множество
        // использовал TreeSet
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("z");
        stringSet.add("b");
        stringSet.add("a");
        stringSet.add("d");
        stringSet.add("f");
        stringSet.add("c");

        System.out.println(stringSet);


        // создалось еще одно множество из объектов
        // они отсортировались, потому что я добавил компаратор,
        // который сравнивал по полю num
        System.out.println("Сортированное множество из объектов");
        Set<ExObject> objectSet = new TreeSet<>();
        objectSet.add(new ExObject(5,"five"));
        objectSet.add(new ExObject(2,"two"));
        objectSet.add(new ExObject(4,"four"));
        objectSet.add(new ExObject(1,"one"));
        objectSet.add(new ExObject(3,"three"));

        System.out.println(objectSet);

        // 5 задание
        // сделал тоже самое для хэш талицы
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