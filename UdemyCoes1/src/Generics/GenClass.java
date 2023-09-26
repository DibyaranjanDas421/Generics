package Generics;

public class GenClass<T> {
	private T obj;

	public GenClass(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "GenClass [obj=" + obj + "]";
	}
}
class Dibya {
	public static void main(String[] args) {
		GenClass<String> G=new GenClass<String>("Deb");
		String var=G.getObj();
		System.out.println(var);

	}
}
