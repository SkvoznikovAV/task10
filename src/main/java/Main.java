import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        testExchange();
        appleOrange();
    }

    private static void appleOrange() {
        System.out.println("------------------");
        System.out.println("Задача 2");

        Box<Apple> appleBox1 = new Box<>("Коробка яблок 1");
        appleBox1.add(new Apple(0.2f));
        appleBox1.add(new Apple(0.21f));
        appleBox1.add(new Apple(0.15f));
        appleBox1.add(new Apple(0.31f));
        appleBox1.add(new Apple(0.32f));
        appleBox1.add(new Apple(0.21f));
        appleBox1.add(new Apple(0.34f));

        Box<Apple> appleBox2 = new Box<>("Коробка яблок 2");
        appleBox2.add(new Apple(0.333f));
        appleBox2.add(new Apple(0.444f));
        appleBox2.add(new Apple(0.555f));

        Box<Orange> orangeBox1 = new Box<>("Коробка апельсинов 1");
        orangeBox1.add(new Orange(0.2f));
        orangeBox1.add(new Orange(0.21f));
        orangeBox1.add(new Orange(0.15f));
        orangeBox1.add(new Orange(0.31f));
        orangeBox1.add(new Orange(0.32f));
        orangeBox1.add(new Orange(0.21f));
        orangeBox1.add(new Orange(0.34001f));

        Box<GoldenApple> goldenAppleBox1 = new Box<>("Коробка золотых яблок 1");
        goldenAppleBox1.add(new GoldenApple(0.111f));
        goldenAppleBox1.add(new GoldenApple(0.222f));
        goldenAppleBox1.add(new GoldenApple(0.333f));
        goldenAppleBox1.add(new GoldenApple(0.444f));

        System.out.println(appleBox1.getInfo());
        System.out.println("Вес: "+appleBox1.getWeight());

        System.out.println(appleBox2.getInfo());
        System.out.println("Вес: "+appleBox2.getWeight());

        System.out.println(orangeBox1.getInfo());
        System.out.println("Вес: "+orangeBox1.getWeight());

        System.out.println(goldenAppleBox1.getInfo());
        System.out.println("Вес: "+goldenAppleBox1.getWeight());

        System.out.println("Результат сравнения веса коробки с яблоками 1 и коробки с апельсинами 1: "+appleBox1.compare(orangeBox1));

        System.out.println("Пересыпаем коробку с яблоками 2 в коробку с яблоками 1");
        appleBox2.pourTo(appleBox1);

        System.out.println(appleBox1.getInfo());
        System.out.println("Вес: "+appleBox1.getWeight());

        System.out.println(appleBox2.getInfo());
        System.out.println("Вес: "+appleBox2.getWeight());

        System.out.println("Пересыпаем коробку с золотыми яблоками 1 в коробку с яблоками 1");
        goldenAppleBox1.pourTo(appleBox1);

        System.out.println(goldenAppleBox1.getInfo());
        System.out.println("Вес: "+goldenAppleBox1.getWeight());

        System.out.println(appleBox1.getInfo());
        System.out.println("Вес: "+appleBox1.getWeight());

        System.out.println("Пересыпаем коробку с яблоками 1 в коробку с золотыми яблоками 1");
        goldenAppleBox1.pourFrom(appleBox1);

        System.out.println(goldenAppleBox1.getInfo());
        System.out.println("Вес: "+goldenAppleBox1.getWeight());

        System.out.println(appleBox1.getInfo());
        System.out.println("Вес: "+appleBox1.getWeight());

        //Collections.copy(appleBox1.data,goldenAppleBox1.data);
        //Collections.copy(goldenAppleBox1.data,appleBox1.data);

    }

    private static void testExchange() {
        System.out.println("Задача 1");
        String[] arrStr = {"A","B","C","D","E","F","G","H"};
        System.out.println(Arrays.toString(arrStr));
        exchange(arrStr,0,2);
        System.out.println(Arrays.toString(arrStr));

        Integer[] arrInt = {0,1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arrInt));
        exchange(arrInt,0,2);
        System.out.println(Arrays.toString(arrInt));

        DataStorage<String> dataStorage = new DataStorage<>(5);
        dataStorage.add("000");
        dataStorage.add("111");
        dataStorage.add("222");
        dataStorage.add("333");
        dataStorage.add("444");
        dataStorage.add("555");
        dataStorage.add("666");
        dataStorage.add("777");

        dataStorage.print();
        dataStorage.exchange(0,7);
        dataStorage.print();
    }

    private static <T> void exchange(T[] arr, int i, int j) {
        if (i<0 || i>arr.length-1 || j<0 || j> arr.length-1)
            throw new ArrayIndexOutOfBoundsException("Один из индексов выходит за пределы массива");

        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}