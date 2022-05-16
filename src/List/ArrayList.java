package List;

import java.util.Collection;
import java.util.List;

public class ArrayList<E> implements TDAList<E>,Collection<E> {
    private E[] list; 
	private int	size;
	private final int default_Size = 10;
	
	//constructors
	public ArrayList() {
		this.list = (E[]) new Object[default_Size];
		this.size = 0;
	}

	public ArrayList(int n){
		this.size = 0;
		this.list = (E[])new Object[n];
	}
	
	//metodo que añade un elemento al final de un array
	public boolean add(E e) {
		if(size == list.length) {
			resize();
		}
		list[size] = e;
		size++;
		return true;
	}
	
	//add añade un elemento al final de un array
	public void add(int index, E element) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if(size == list.length) {
			resize();
		}
		for(int i = size; i > index; i--) {
			list[i] = list[i-1];
		}
		list[index] = element;
		size++;
	}

	//addAll añade una collecion al final de la lista
	public boolean addAll(Collection<? extends E> c){
		if(c.size() == 0) {
			return false;
		}
		if(size + c.size() > list.length) {
			resize();
		}
		for(int i = size; i < size + c.size(); i++) {
			list[i] = ((List<E>)c).get(i-size);
		}
		size += c.size();
		return true;
	}

	//addAll inserta todos los elementos de una coleccion en la pocicion indicada en la lista
	public boolean addAll(int index, Collection<? extends E> c){
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		int sumSize = size + c.size();
		if(sumSize > list.length) {
			resize();
		}
		
		for(int i = sumSize-1; i > index+c.size()-1; i--) {
			list[i] = list[i-c.size()];
		}
		
		for(int i = index; i < index + c.size(); i++) {
			list[i] = ((List<E>)c).get(i-index);
		}
		size += c.size();
		return true;
	}

	//clear elimina todos los elementos de la lista
	public void clear() {
		for(int i = 0; i < size; i++) {
			list[i] = null;
		}
		size = 0;
	}

	//contains comprueba si un elemento esta en la lista
	public boolean contains(Object o) {
		for(int i = 0; i < size; i++) {
			if(list[i].equals(o)) {
				return true;
			}
		}
		return false;
	}
	
	//containsAll retorna true si todos los elementos de una coleccion estan en la lista
	public boolean containsAll(Collection<?> c) {
		for(int i = 0; i < c.size(); i++) {
			if(!contains(((List<E>) c).get(i))) {
				return false;
			}
		}
		return true;
	}

	//equals comprueba si dos listas son iguales
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o == this) {
			return true;
		}
		if(o instanceof ArrayList) {
			ArrayList<?> a = (ArrayList<?>) o;
			if(a.size() != size) {
				return false;
			}
			for(int i = 0; i < size; i++) {
				if(!list[i].equals(a.get(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	//get retorna el elemento en la pocicion indicada
	public E get(int index) {
		testSize(index);
		return list[index];
	}

	//indexOf retorna la primera ocurrencia de un lemento especifico o -1 si no lo encuentra
	public int indexOf(Object o) {
		for(int i = 0; i < size; i++) {
			if(list[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}	

	public boolean isEmpty() {
		return size == 0;
	}

	//lastIndexOf retorna la ultima ocurrencia del objeto especifico o -1 si no lo encuentra
	public int lastIndexOf(Object o) {
		for(int i = size - 1; i >= 0; i--) {
			if(list[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	//Remove elimina el objeto en la pocicion indicadas
	public E remove(int index) {
		testSize(index);
		E e = list[index];
		for(int i = index; i < size - 1; i++) {
			list[i] = list[i+1];
		}
		list[size-1] = null;
		size--;
		return e;
	}

	//Remove elimina la primera ocurrencia y devuelve false si no lo encuentra
	public E remove(E x) {
		int index = indexOf(x);
		if(index == -1) {
			return null;
		}
		return remove(index);
	}

	//Removeall elimina todas las ocurrencias de una coleccion
	public boolean removeAll(Collection<?> c) {
		boolean elements = false;
		for(int i = 0; i < c.size(); i++) {
			if(remove(((List<E>)c).get(i)) != null) {
				elements = true;
			}
		}
		return elements;
	}

	//set reemplaza el objeto en la pocicion indicada 
	public E set(int index, E element) {
	
		testSize(index);
		
		E e = list[index];
		list[index] = element;
		return e;
	}

	//size retorna el tamamaño del arreglo
	public int size() {
		return size;
	}

	//subList retorna una porcion del arreglo
	public List<E> subList(int fromIndex, int toIndex) {
		if(fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
			throw new IndexOutOfBoundsException();
		}
		ArrayList<E> a = new ArrayList<E>();
		for(int i = fromIndex; i < toIndex; i++) {
			a.add(list[i]);
		}
		return a;
	}
	
	//metodo de comprobacion de largo de
	public void testSize(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
	}

	//inserta un elemento al inicio del arreglo
	public void insertFirst(E x) {
		if(size == list.length) {
			resize();
		}
		for(int i = size; i > 0; i--) {
			list[i] = list[i-1];
		}
		list[0] = x;
		size++;
		
	}
	//insert x at the k-th position
	public void insert(E x, int k) {
		if(k > size) {
			throw new RuntimeException("Index out of bounds");
		}
		if(k == size) {
			list[size] = x;
			size++;
		}else {
			for(int i = size; i > k; i--) {
				list[i] = list[i-1];
			}
			list[k] = x;
			size++;
		}
	}
	//search for x in the list and return its position
	public int search(E x) {
		for(int i = 0; i < size; i++) {
			if(list[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}
	//searchK retorna el objeto en la pocicion k
	public E searchK(int k) {
		if(k < 0 || k >= size) {
			throw new IndexOutOfBoundsException();
		}
		return list[k];
	}

	//resize redimensiona el arreglo
	private void resize() {
		E[] newList = (E[]) new Object[size*2];
		for(int i = 0; i < size; i++) {
			newList[i] = list[i];
		}
		list = newList;
	}
	//toString
	public String toString() {
		String s = "[";
		for(int i = 0; i < size; i++) {
			s += list[i] + " " + i;
			if(i != size - 1) {
				s += ", ";
			}
		}
		s += "]";
		return s;
	}
}