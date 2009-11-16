/**
  @ Project : Vector de bit
  @ File Name : Builder_VectorBit_jv.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;


/** */
public class Builder_VectorBit_jv implements Builder_VectorBit
{
    protected VectorBit vectorBit;

	/** */
	public VectorBit buildVectorBit ()
	{
      return new VectorBit_jv ();
	}
	
	/** */
	public VectorBit buildVectorBit (int val)
	{
        return new VectorBit_jv (val);
    }
}
