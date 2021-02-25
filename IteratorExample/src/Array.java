import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array<T> implements Iterable<T> {

	private T[] values;
	
	public Array(T[] values) {
		super();
		this.values = values;
	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ArrayIterator();
	}

	class ArrayIterator implements Iterator<T>{

		private int current=0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return Array.this.values.length>current;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			if (!hasNext()) {
				throw new NoSuchElementException();
			}else {
				return Array.this.values[current++];
			}
		}
	}
}
