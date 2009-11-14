/**
  @ Project : Vector de bit
  @ File Name : Builder_VectorBit.java
  @ Date : 02/11/2009
  @ Author : David Vargas, Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

/** */
public interface Iterator
{
	/** 
     *  Checks if the iterator has a next element
     *  @return #true if there is another element #false otherwise
     */
	public boolean hasNext();

	/** 
     *  Gets the next element of the iterator, you should first check if it exist with the hasNext method
     *  @return the next operator
     */
	public boolean getNext();
	/** 
     *  Gets the current position of the iterator
     *  @return the position of the iterator
     **/
	public int position();

	/** 
     *  Skip the next element and set the one after
     *  @return the indice of the skipped element
     **/
	public int skipToSet();

	/** 
     *  Skip the next element and unset the one after
     *  @return the indice of the skipped element
     **/
	public int skipToUnset();
}
