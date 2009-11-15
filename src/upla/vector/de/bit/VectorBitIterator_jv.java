/**
  @ Project : Vector de bit
  @ File Name : VectorIterator_jv.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

import java.util.*;

/** Interface of the vector of bit, it should be extended by other concrete classes */
public class VectorBitIterator_jv implements VectorBitIterator
{
    private final VectorBit vectorBit; 
    private int position;

    public VectorBitIterator_jv (VectorBit bs)
      {
        this.vectorBit = bs;
        position = 0;
      }

	public boolean hasNext()
      {
        return position < vectorBit.length ();
      }

	public Boolean next()
      {
        this.position++;

        if (position > vectorBit.length())
            throw new NoSuchElementException(); 

        return this.vectorBit.test(position);
      }

	public int position()
      {
        return this.position;
      }

    public void remove ()
      {
        throw new UnsupportedOperationException(); 
      }

	public int skipToSet()
      {
        int skippedElmentIndex;

        if (this.hasNext())
          this.next();
        else 
            return -1;
        if (!this.hasNext())
            return -1;

        skippedElmentIndex = this.position();

        this.vectorBit.set(skippedElmentIndex+1);

        return skippedElmentIndex;
      }

	public int skipToUnset()
      {
        int skippedElmentIndex;

        if (this.hasNext())
          this.next();
        else 
            return -1;
        if (!this.hasNext())
          return -1;

        skippedElmentIndex = this.position();
        this.vectorBit.unset(skippedElmentIndex+1);

        return skippedElmentIndex;
      }
}
