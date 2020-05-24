package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;


public class StreamAPILearning {
	@Test
	public void Test1() {
		int[] nums= new int[] {1,2,3,3,4,5,6};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Stream<Integer> s = list.stream();
		s.filter(v->v>1).forEach(System.out::println);
		//½Ø¶ÏÁ÷
		s.limit(3);
		//Ìø¹ý
		s.skip(3);
		//Ë¢Ñ¡
		s.distinct();
		//Arrays.stream(nums);
		//Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
	}
	@Test
	public void Test2() {
		
		int[] nums= new int[] {1,2,3,3,4,5,6};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Stream<Integer> s = list.stream();
		s.map(v->v+1).forEach(System.out::println);
		
		//Arrays.stream(nums);
		//Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
	}
	@Test
	public void Test3() {
		
		int[] nums= new int[] {1,23,4,6};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Stream<Integer> s = list.stream();
		s.sorted((n1,n2)->n2-n1).forEach(System.out::println);
		
		//Arrays.stream(nums);
		//Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
	}
	@Test
	public void Test4() {
		
		int[] nums= new int[] {1,23,4,6};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Stream<Integer> s = list.stream();
		boolean ss = s.allMatch(n->n>3);
		System.out.println(ss);
		boolean ss1 = list.stream().anyMatch(n->n>3);
		System.out.println(ss1);
		boolean ss2 = list.stream().noneMatch(n->n>1000);
		System.out.println(ss2);
		Integer f1 = list.stream().findFirst().get();
		System.out.println(f1);
		Integer f2 = list.stream().findAny().get();
		System.out.println(f2);
		Long f3 = list.stream().count();
		System.out.println(f3);
		Integer f4 = list.stream().max(Integer::compare).get();
		System.out.println("f4:"+f4);
		Integer f5 = list.stream().min(Integer::compare).get();
		System.out.println("f5:"+f5);
		
		//Arrays.stream(nums);
		//Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
	}
	@Test
	public void Test5() {
		
		int[] nums= new int[] {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Stream<Integer> s = list.stream();
		int res = s.reduce(0,(v1,v2)->v1+v2).intValue();
		System.out.println(res);
		Optional<Integer> res1 = list.stream().reduce(Integer::sum);
		System.out.println(res1);
		//Arrays.stream(nums);
		//Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
	}
}
