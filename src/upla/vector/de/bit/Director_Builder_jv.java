/**
 * @ Project : Vector de bit
 * @ File Name : Builder_VectorBit_jv.java
 * @ Date : 02/11/2009
 * @ Author : David Vargas; Thibault Saunier, Carlos Lagos
 **/

package upla.vector.de.bit;

/** */
public class Director_Builder_jv implements Director_Builder
{
/*
    Director_Builder Director_Builder_jv()
      {
      }
TODO see if needed */

	/** 
     */
	public Object build()
	{
        return new  Builder_VectorBit_jv ();
	}
}
