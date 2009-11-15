/**
  @ Project : Vector de bit
  @ File Name : Builder_VectorBit.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

/** Interface of the vector of bit, it should be extended by other concrete classes */
public interface VectorBit
{
    /** Implements the test metods of the VectorBit interface.
     *  @param indice indicate the indice of the bit we want to get.
     *  @return the value of the concerned bit. 
     **/
	public boolean test (int indice);

    /** Sets the bit as #true
      * @param indice the indice of the bit we want to set as true
      * @return #true if the opertion was change otherwise #false
      **/ 
	public boolean set(int indice);

    /** Sets the bit as #false
      * @param indice the indice of the bit we want to set as true
      * @return #true if the value was change otherwise #false
      **/ 
	public boolean unset(int indice);
	
    /** Sets the bit as #false if it was true, and at #true otherwise
      * @param indice the indice of the bit we want to  negate
      * @return #true if the value was change otherwise #false
      **/ 
	public boolean negar(int indice);
	
	/** 
     *   Applies the "or" logical operation.
     *  @param bs the vector de bit with wich we will apply the or logical opertion.
     */
	public void or(VectorBit bs);
	
	/** 
     *   Applies the "xor" logical operation.
     *  @param bs the vector de bit with wich we will apply the or logical opertion.
     */
	public void xor(VectorBit bs);
	/** Permits to copu the vector passed as parameter
     *  @param bs the VectirBit to copy
     **/
	public void copiar(VectorBit bs);

	/** 
      * Permit to enable the iterator
     **/
	public void iterator();
	
    /**
     *   Creates the builder, it should be implemented for the next part
     **/
	public void builder();

	/** 
     *  Convert the vector of bit to a string containing the bit map (0 and 1)
     *  @return the newly created string
     */
	public String toString();
    
	/** 
     *  Applies the "and" logical operation.
     *  @param bs the vector de bit with wich we will apply the or logical opertion.
     */
	public void and (VectorBit bs);

}
