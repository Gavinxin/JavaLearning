package JavaLearning;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTest {
	/**
	 * 1.�޲��޷���ֵ
	 */
	@Test
	public void test1() {
		Runnable r1= new Runnable() {			
			@Override
			public void run() {
				System.out.println("i love you");
				
			}
		};
		
		r1.run();
		Runnable r2 = ()->System.out.println("i love you too");
		r2.run();
		
		
	}
	/**
	 * ��һ������ �޷���ֵ
	 */
	@Test
	public void test2() {
		Consumer<String>  con = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println("Test2");
				
			}
		};
		
		con.accept("this is test 2!");
		Consumer<String>  con1 = (String s)->System.err.println("Test2");
		con1.accept("This is a lambda test2��");
	}
	/**
	 * ��������ʡ�ԣ������ƶϣ�
	 */
	@Test
	private void test3() {
		Consumer<String>  con1 = s->System.err.println("Test2");
		con1.accept("This is a lambda test2��");
	}
	/**
	 * �������ϲ���������ִ����䣬����ֵ
	 */
	@Test
	public void test4() {
		Comparator<Integer> comp1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println(o1);
				return o1.compareTo(o2);
			}
		};
		Comparator<Integer> comp = (o1,o2)->{
			System.out.println(o1);
			return o1.compareTo(o2);
		};
		//PriorityQueue<Integer> p = new PriorityQueue<>((o1,o2)->Integer.compare(o1, o2));
		System.out.println(comp.compare(1, 2));
	}
	
	/**
	 * lamdba��ֻ��һ�� {} return����ʡ��
	 */
	@Test
	public void test5() {
		Comparator<Integer> comp = (o1,o2)->Integer.compare(o1, o2);
		//PriorityQueue<Integer> p = new PriorityQueue<>((o1,o2)->Integer.compare(o1, o2));
		System.out.println(comp.compare(1, 2));
	}
}
