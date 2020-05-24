package JavaLearning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

public class FunctionQuote {
	/**
	 * 使用格式：类（对象）：：方法名
	 */
	@Test
	private void test1() {
		Comparator<Integer> comp = Integer::compare;
		List<String> list = new ArrayList<>();
		list.stream().map(StringBuilder::new);
	}
}
