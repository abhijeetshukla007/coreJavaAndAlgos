/**
 * 
 */
package core.java.collections;

/**
 * @author abhijeet
 *
 */
public class ObjectMethods implements Cloneable {

	int t = 0;

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {

		/// clone
		ObjectMethods arrayList = new ObjectMethods();
		ObjectMethods objectMethods = (ObjectMethods) arrayList.clone();
		objectMethods.t = 2;
		System.out.println(objectMethods.t);
		System.out.println(arrayList.t);
		arrayList.t = 4;

		objectMethods.finalize();
		System.out.println(objectMethods.t);

		objectMethods.clone();
		objectMethods.finalize();
		objectMethods.finalize();

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone called");
		this.t = 0;
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("called finalize");
	}

}
