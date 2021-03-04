
public class LISTA<E> extends Pila<E>{
	
	FabricaListas<String> fabrica = new FabricaListas<String>();
	private ILista<String> list;
	
	public LISTA(String tipoLista) {
		list = fabrica.getList(tipoLista);
	}

	@Override
	public void push(E item) {
		list.addLast((String) item);
	}

	@Override
	public E pop() {
		E p= (E) list.removeFirst();
		return p;
	}

	@Override
	public E peek() {
		E p = (E) list.getFirst();
		return p;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean empty() {
		return false;
	}

}
