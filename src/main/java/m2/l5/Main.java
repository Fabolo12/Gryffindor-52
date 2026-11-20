package m2.l5;

import java.util.List;
import java.util.function.Supplier;

public class Main {
    static void main() {
        Maper<Integer, String> maper = new MyMaper<>();
        Maper<String, Integer> maper2 = new Maper<>() {
            @Override
            public Integer map(String input) {
                return Integer.parseInt(input);
            }
        };

        Maper<String, Integer> maper3 = input -> Integer.parseInt(input);
        Maper<String, Integer> maper4 = input -> {
            System.out.println("Mapping string to integer: " + input);
            return Integer.parseInt(input);
        };
        Maper<String, Integer> maper5 = Integer::parseInt;
        Maper<String, Integer> maper7 = input -> Integer.parseInt(input.trim()) * 10;
        Maper2<String, Integer, String> maper6 = (input, data) -> Integer.parseInt(input);



        System.out.println(maper2.map("123"));
        System.out.println(maper3.map("123"));
        System.out.println(maper4.map("123"));
        System.out.println(maper5.map("123"));

        Supplier<Box> boxCreator = Box::new;
        Box box1 = boxCreator.get();
        Box box2 = boxCreator.get();
        System.out.println(box1 == box2);
    }
}

class MyMaper<I, O> implements Maper<I, O> {
    @Override
    public O map(I input) {
        return null;
    }
}