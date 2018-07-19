/**
 * 
 */
package core.java.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author abhijeet
 *
 */
public class TreeSetDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(1);
		treeSet.add(2);
		// treeSet.add(new String(""));
		// treeSet.add(new StringBuffer("temp"));// Exception in thread "main"
		// java.lang.ClassCastException:
		// java.lang.StringBuffer cannot be cast to java.lang.Comparable

		System.out.println(treeSet);

		Comparator<Stu> comparator = (a, b) -> {
			if (a.getAge() > b.getAge())
				return -1;
			else if (a.getAge() == b.getAge())
				return 0;
			else {
				return 1;
			}
		};
	}

	class Stu implements Comparable<Stu> {
		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public int compareTo(Stu o) {
			return 0;
		}

	}

}
