/**
  @ Project : Vector de bit
  @ File Name : VectorIterator_jv.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

/** Interface of the vector of bit, it should be extended by other concrete classes */
public class VectorIterator_jv implements VectorIterator
{
    public VectorIterator_jv (VectorBit_jv bs)
      {

      }

	public boolean hasNext()
      {
        return this.iterator.hasNext ();
      }

	public Object next()
      {
        iteratorPosition++;
        return this.iterator.next();
      }

	/** */
	public int position()
      {
        return iteratorPosition;
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

        this.set(skippedElmentIndex+1);

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
        this.unset(skippedElmentIndex+1);

        return skippedElmentIndex;
      }
}
