public class FabricaListas<E> {
	
	public ILista<E> getList(String option) {
		if(option.equals("3")) {
			return new SinglyLinkedList<E>();
		}
		else {
			return new DoublyLinkedList<E>();
		}
	}
}
