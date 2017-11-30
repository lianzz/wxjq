package rule.合同;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test{
	public static void main(String[] args){
		List<Integer> l = new ArrayList();
		for(int i=0;i<1000000;i++){
			l.add(i+1);
		}
		System.out.println(test1(l));
		System.out.println(test2(l));
		System.out.println(test3(l));
	}
	public static long test1(List l){
		long l1 = System.currentTimeMillis();
		for(int i=0;i<l.size();i++){
			//int in = (Integer)l.size()-1;
			if(i==l.size()-1){
				System.out.println("I'm test1");
			}
		}
		long l2 = System.currentTimeMillis();
		return l2-l1;
	}
	public static long test2(List<Integer> l){
		long l1 = System.currentTimeMillis();
		for(Integer i:l){
			if(i==l.size()-1){
				System.out.println("I'm test2");
			}
		}
		long l2 = System.currentTimeMillis();
		return l2-l1;
	}
	public static long test3(List<Integer> l){
		long l1 = System.currentTimeMillis();
		for(Iterator ite = l.iterator();ite.hasNext();){
			if((Integer)ite.next()==l.size()-1){
				System.out.println("I'm test3");
			}
		}
		long l2 = System.currentTimeMillis();
		return l2-l1;
	}
}
