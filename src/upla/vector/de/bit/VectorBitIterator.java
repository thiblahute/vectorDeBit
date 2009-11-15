/**
  @ Project : Vector de bit
  @ File Name : Builder_VectorBit.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

import java.util.Iterator;


public interface VectorBitIterator extends Iterator<Boolean>
{
	/** 
     *  Gets the current position of the iterator
     *  @return the position of the iterator
     **/
	public int position ();
	/** 
     *  Skip the next element and set the one after
     *  @return the indice of the skipped element or -1 if impossible.
     *  @throws NoSuchElementException either if the next element doesn't exits or the one after
     **/
	public int skipToSet();

	/** 
     *  Skip the next element and unset the one after
     *  @return the indice of the skipped element or -1 if impossible
     *  @throws NoSuchElementException either if the next element doesn't exits or the one after
     **/
	public int skipToUnset();
}
