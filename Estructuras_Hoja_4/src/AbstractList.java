
public abstract class AbstractList<E> implements ILista<E>{
	
   public AbstractList()
   // post: does nothing
   {
   }
   /**
	* Este es un metodo que verifica si el Stack no está vacío
	*
	* @return  un 0 si esta vacio. 
	*/
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
   /**
	* Este es un metodo que verifica si el Stack no está vacío
	*
	* @return  verifica si contiene algo.
	*/
  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
  }
  
}
