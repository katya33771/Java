package ru.spb.herzen.ivt3;



import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        Function<Integer, Integer> NumberCrusher = n -> n*2;

        List<Integer> random = new Random().ints(10, 0, 100)
                .mapToObj(i -> new Integer(i))
                .collect(Collectors.toList());
        random.forEach(System.out::println);

        System.out.println("----------");
        random = random.stream()
                .filter(i -> i%2==0)
                .sorted()
                .collect(Collectors.toList());
        random.forEach(System.out::println);

        System.out.println("----------");
        Function<Integer, Integer> NumberCrusher2 = n->n*2;
        random
                .stream()
                .map(NumberCrusher2)
                .forEach(System.out::println);
    }
}