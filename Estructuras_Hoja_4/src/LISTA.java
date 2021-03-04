
public class LISTA<E> extends Pila<E>{
	
	FabricaListas<String> fabrica = new FabricaListas<String>();
	private ILista<String> list;
	
	public LISTA(String tipoLista) {
		list = fabrica.getList(tipoLista);
	}
	/**
	* Este es un metodo que agrega un elemento E a un ArrayList
	*
	* @param item  el elemento que se quiere ingresar al Stack
	*/
	@Override
	public void push(E item) {
		list.addLast((String) item);
	}
	/**
	* Este es un metodo que quita un elemento E a un ArrayList
	*
	* @return  se quita el ultimo elemento del stack.
	*/
	@Override
	public E pop() {
		E p= (E) list.removeFirst();
		return p;
	}
	/**
	* Este es un metodo que devuelve el último elemento ingresado en el stack
	*
	* @return  último elemento en el stack
	*/
	
	@Override
	public E peek() {
		E p = (E) list.getFirst();
		return p;
	}
	/**
	* Este es un metodo que devuleve
	*
	* @return  se quita el ultimo elemento del stack.
	*/
	@Override
	public int size() {
		return list.size();
	}
	/**
	* Este es un metodo que verifica si el Stack no está vacío
	*
	* @return  un 0 si esta vacio. 
	*/
	@Override
	public boolean empty() {
		return false;
	}

}
