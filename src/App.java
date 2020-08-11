import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        // サンプル配列
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<String> strings = Arrays.asList("filter", "map", "soeted", "anyMatch");

        // forEach(Consumer<? super T> action)
        // このストリームの各要素に対してアクションを実行します。
        numbers.stream().forEach(x -> System.out.println(x));

        // filter(Predicate<? super T> predicate)
        // 条件に合致する要素のみを抽出する。
        numbers.stream().filter(x -> x > 3).forEach(x -> System.out.println(x));

        // map(Function<? super T,? extends R> mapper)
        // 各要素を加工する。
        numbers.stream().map(x -> x + 10).forEach(x -> System.out.println(x));

        // min

        // max

        // anyMatch(Predicate<? super T> predicate)
        // 条件に合致する要素が一つでもあった場合に true
        System.out.println("anyMatch(map): " + strings.stream().anyMatch(x-> x.equals("map")));
        System.out.println("anyMatch(ma): " + strings.stream().anyMatch(x-> x.equals("ma")));

        // noneMatch(Predicate<? super T> predicate)
        // 条件に合致する要素が一つもない場合に true
        System.out.println("numbers.noneMatch(x -> x == 3): " + numbers.stream().noneMatch(x -> x == 3));
        System.out.println("numbers.noneMatch(x -> x == 9): " + numbers.stream().noneMatch(x -> x == 9));

        // of(T... values)

        // sorted(Comparator<? super T> comparator)

        // collect(Collector<? super T,A,R> collector)
        // ストリームを配列に変換。
        List<String> aaa = strings.stream().map(x -> x + "aaa").collect(Collectors.toList());
        System.out.println(aaa);

        // toArray(IntFunction<A[]> generator)

        // count()
        // 要素数をカウント。
        System.out.println("numbers.stream().count(): " + numbers.stream().count());

        // distinct()

        // limit()

        // skip()

        // findFirst()
        // ストリームの先頭の要素を返却。（戻り値の型は Optional<T>）
        System.out.println("numbers.stream().findFirst(): " + numbers.stream().findFirst().get());

        // generate(Supplier<T> s)
    }

}
