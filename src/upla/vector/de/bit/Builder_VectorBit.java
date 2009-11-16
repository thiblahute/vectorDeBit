/**
  @ Project : Vector de bit
  @ File Name : Builder_VectorBit.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;


/** */
interface Builder_VectorBit
{
    /** 
      * Instanciate an empty vector of bit
      **/
    public VectorBit buildVectorBit ();

    /** 
      * Instanciate a vector of bit from an int
      * @param val the integer to convert in vector of bit
      **/
    public VectorBit buildVectorBit (int val);
}
