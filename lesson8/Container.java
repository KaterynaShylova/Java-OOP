package lesson8;

public class Container<E>{
	private E[] m;
	
	public Container(E[] m){
		this.m = m;
	}
	

	public E[] getValue() {
		return m;
	}

	public void setValue(E[] m) {
		this.m = m;
	}
	
	public E getElem(int i){
		return m[i];
	}
}
