package compile;

import java.lang.reflect.Method;
import java.util.Iterator;

import code.产品_配置_项目配置清单;

public class CompileRule {
	public static void main(String[] args) {
		Class c1 = 产品_配置_项目配置清单.class;
		System.out.println(c1.getName());
		Method[] ms = c1.getMethods();
		for (int i = 0; i < ms.length; i++) {
			Method m = ms[i];
			//System.out.println(m.getName());
			if (m.getName().startsWith("A")) {
				System.out.println(m.getName());
			}
		}
	}
}
