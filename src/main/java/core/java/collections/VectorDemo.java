/**
 * 
 */
package core.java.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author M1034403
 *
 */
public class VectorDemo extends Vector {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
	}

	@Override
	public synchronized void copyInto(Object[] anArray) {
		// TODO Auto-generated method stub
		super.copyInto(anArray);
	}

	@Override
	public synchronized void trimToSize() {
		// TODO Auto-generated method stub
		super.trimToSize();
	}

	@Override
	public synchronized void ensureCapacity(int minCapacity) {
		// TODO Auto-generated method stub
		super.ensureCapacity(minCapacity);
	}

	@Override
	public synchronized void setSize(int newSize) {
		// TODO Auto-generated method stub
		super.setSize(newSize);
	}

	@Override
	public synchronized int capacity() {
		// TODO Auto-generated method stub
		return super.capacity();
	}

	@Override
	public synchronized int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public synchronized boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public Enumeration elements() {
		// TODO Auto-generated method stub
		return super.elements();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return super.contains(o);
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return super.indexOf(o);
	}

	@Override
	public synchronized int indexOf(Object o, int index) {
		// TODO Auto-generated method stub
		return super.indexOf(o, index);
	}

	@Override
	public synchronized int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return super.lastIndexOf(o);
	}

	@Override
	public synchronized int lastIndexOf(Object o, int index) {
		// TODO Auto-generated method stub
		return super.lastIndexOf(o, index);
	}

	@Override
	public synchronized Object elementAt(int index) {
		// TODO Auto-generated method stub
		return super.elementAt(index);
	}

	@Override
	public synchronized Object firstElement() {
		// TODO Auto-generated method stub
		return super.firstElement();
	}

	@Override
	public synchronized Object lastElement() {
		// TODO Auto-generated method stub
		return super.lastElement();
	}

	@Override
	public synchronized void setElementAt(Object obj, int index) {
		// TODO Auto-generated method stub
		super.setElementAt(obj, index);
	}

	@Override
	public synchronized void removeElementAt(int index) {
		// TODO Auto-generated method stub
		super.removeElementAt(index);
	}

	@Override
	public synchronized void insertElementAt(Object obj, int index) {
		// TODO Auto-generated method stub
		super.insertElementAt(obj, index);
	}

	@Override
	public synchronized void addElement(Object obj) {
		// TODO Auto-generated method stub
		super.addElement(obj);
	}

	@Override
	public synchronized boolean removeElement(Object obj) {
		// TODO Auto-generated method stub
		return super.removeElement(obj);
	}

	@Override
	public synchronized void removeAllElements() {
		// TODO Auto-generated method stub
		super.removeAllElements();
	}

	@Override
	public synchronized Object clone() {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public synchronized Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}

	@Override
	public synchronized Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
	}

	@Override
	public synchronized Object get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}

	@Override
	public synchronized Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return super.set(index, element);
	}

	@Override
	public synchronized boolean add(Object e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return super.remove(o);
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		super.add(index, element);
	}

	@Override
	public synchronized Object remove(int index) {
		// TODO Auto-generated method stub
		return super.remove(index);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
	}

	@Override
	public synchronized boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return super.containsAll(c);
	}

	@Override
	public synchronized boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return super.addAll(c);
	}

	@Override
	public synchronized boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return super.removeAll(c);
	}

	@Override
	public synchronized boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return super.retainAll(c);
	}

	@Override
	public synchronized boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return super.addAll(index, c);
	}

	@Override
	public synchronized boolean equals(Object o) {
		// TODO Auto-generated method stub
		return super.equals(o);
	}

	@Override
	public synchronized int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public synchronized String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public synchronized List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return super.subList(fromIndex, toIndex);
	}

	@Override
	protected synchronized void removeRange(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		super.removeRange(fromIndex, toIndex);
	}

	@Override
	public synchronized ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return super.listIterator(index);
	}

	@Override
	public synchronized ListIterator listIterator() {
		// TODO Auto-generated method stub
		return super.listIterator();
	}

	@Override
	public synchronized Iterator iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}

	@Override
	public synchronized void forEach(Consumer action) {
		// TODO Auto-generated method stub
		super.forEach(action);
	}

	@Override
	public synchronized boolean removeIf(Predicate filter) {
		// TODO Auto-generated method stub
		return super.removeIf(filter);
	}

	@Override
	public synchronized void replaceAll(UnaryOperator operator) {
		// TODO Auto-generated method stub
		super.replaceAll(operator);
	}

	@Override
	public synchronized void sort(Comparator c) {
		// TODO Auto-generated method stub
		super.sort(c);
	}

	@Override
	public Spliterator spliterator() {
		// TODO Auto-generated method stub
		return super.spliterator();
	}

}
