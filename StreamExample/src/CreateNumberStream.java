import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateNumberStream {
	public static void main() {
		IntStream istream = IntStream.rangeClosed(3, 10);
		System.out.println(istream.average().getAsDouble());
		
		LongStream lstream = LongStream.range(3, 10);
		System.out.println(lstream.count());
		
		DoubleStream dstream = DoubleStream.of(1.3,2.5,7.4,3.3);
		dstream.sorted().forEachOrdered(e -> System.out.println(e));
		
		Stream<Integer> nums = Stream.of(3,4,5,6,1,-1);
		int maxValue = nums.max(Comparator.naturalOrder()).get();
		System.out.println(maxValue);
		
		Stream<Integer> it = Stream.iterate(3, i -> i*2).limit(8);
		it.forEach(System.out::println);
		
		Stream.generate(new Random()::nextDouble)
			.map(e -> e*10).limit(7).forEach(System.out::println);
		
		IntStream numStreams = IntStream.rangeClosed(0, 30);
		int[] values = numStreams.filter(e -> e > 10).toArray();
		System.out.println(Arrays.toString(values));
		
		IntStream.rangeClosed(0, 20)
			.filter(CreateNumberStream::isEven).forEach(System.out::println);
		
		IntStream integers = IntStream.of(4,3,1,-1,-5,7,9);
		integers.boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		IntStream ints = IntStream.of(4,3,-1,4,3,3,10,11);
		System.out.println(Arrays.toString(ints.distinct().toArray()));

		ints = IntStream.rangeClosed(1,10);
		int[] square = ints.map(e->e*e).toArray();
		System.out.println(Arrays.toString(square));
		
		System.out.println(IntStream.range(3, 10).min().getAsInt());
		System.out.println(IntStream.rangeClosed(3, 10).reduce((a,b)->a*b).getAsInt());
		System.out.println(IntStream.rangeClosed(3, 10).reduce((a,b)->a+b).getAsInt());
	}
	
	private static boolean isEven(int e) {
		return e % 2 == 0;
	}
}
