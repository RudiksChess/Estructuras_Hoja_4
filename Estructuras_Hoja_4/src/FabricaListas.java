public class FabricaListas<E> {
	/**
	* Este es un metodo que verifica si el Stack no está vacío
	* @param option un string pero genial
	* @return  una lista bien nice
	*/
	public ILista<E> getList(String option) {
		if(option.equals("3")) {
			return new SinglyLinkedList<E>();
		}
		else {
			return new DoublyLinkedList<E>();
		}
	}
}
