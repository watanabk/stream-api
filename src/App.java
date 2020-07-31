import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        // forEach(Consumer<? super T> action)
        // このストリームの各要素に対してアクションを実行します。

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // filter(Predicate<? super T> predicate)
        numbers.stream().filter(x -> x > 3).forEach(x -> System.out.println(x));

        // map(Function<? super T,? extends R> mapper)
        numbers.stream().map(x -> x + 10).forEach(x -> System.out.println(x));

        // anyMatch(Predicate<? super T> predicate)
        List<String> strings = Arrays.asList("filter", "map", "soeted", "anyMatch");
        System.out.println("anyMatch(map): " + strings.stream().anyMatch(x-> x.equals("map")));
        System.out.println("anyMatch(ma): " + strings.stream().anyMatch(x-> x.equals("ma")));

        // noneMatch(Predicate<? super T> predicate)

        // of(T... values)

        // sorted(Comparator<? super T> comparator)

        // collect(Collector<? super T,A,R> collector)
        List<String> aaa = strings.stream().map(x -> x + "aaa").collect(Collectors.toList());
        System.out.println(aaa);

        // toArray(IntFunction<A[]> generator)

        // count()

        // distinct()

        // findFirst()

        // generate(Supplier<T> s)
    }

}
