/**
  @ Project : Vector de bit
  @ File Name : VectorBit_jv.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

import java.util.*;
import java.lang.*;

/** */
public class VectorBit_jv implements VectorBit
{
    private boolean[] bits;
    private Descriptor_VectorBit descriptorVector_;

	/** Instanciate a vectorDeBit
     *  @param toConvert the #integer to convert and put in the vector of bit
     *  @param descriptorVector the #Descriptor_VectorBit to use to configure the new vector of bit
     **/
	public VectorBit_jv (int toConvert, Descriptor_VectorBit descriptorVector)
      {
        int i = 0;
        String binStr = Integer.toBinaryString(toConvert);
        int arraySize = descriptorVector.getLimiteSuperior()-descriptorVector.getLimiteInferior();

        descriptorVector_ = descriptorVector;

        bits = new boolean[arraySize];

        for (i = binStr; i < binStr.lenght(); i = i++)
          {
            char aChar = binStr.getCharAt (i) 
            if (aChar == '0')
              bits[i] = false;
            else
              bit[i] = true;
          }
      }

    /** Implements the test metods of the VectorBit interface.
     *  @param indice indicate the indice of the bit we want to get.
     *  @return the value of the concerned bit. 
     **/
    @overide
    public boolean test (int indice)
      {
        return this.bits[indice];
      }

    /** Sets the bit as #true
      * @param indice the indice of the bit we want to set as true
      * @return #true if the opertion was change otherwise #false
      **/ 
	public boolean set(int indice)
	{
      if (indice < this.descriptorVector.getLimiteInferior() 
                  || indice < this.descriptorVector.getLimiteInferior()) 
            return false;
      else if (this.bits[indice] == true)
            return false;
      else
          this.bits[indice] = true;

      return true;
	
	}
	
    /** Sets the bit as #false
      * @param indice the indice of the bit we want to set as true
      * @return #true if the value was change otherwise #false
      **/ 
	public boolean unset(int indice)
	{
      if (indice < this.descriptorVector.getLimiteInferior() 
                  || indice < this.descriptorVector.getLimiteInferior()) 
        {
            return false;
        }
      else if (this.bits[indice] == false)
        {
            this.bits[indice] = true;
            return false;
        }
      else
        {
          this.bits[indice] = false;
        }

      return true;
	}
	
    /** Sets the bit as #false if it was true, and at #true otherwise
      * @param indice the indice of the bit we want to  negate
      * @return #true if the value was change otherwise #false
      **/ 
	public boolean negar(int indice)
	{
      if (indice < this.descriptorVector.getLimiteInferior() || indice < this.descriptorVector.getLimiteInferior()) 
            return false;
      else if (this.bits[indice] == false)
          this.bits[indice] = true;
      else
          this.bits[indice] = false;

      return true;
	}
	
	/** */
	public void or(VectorBit bs)
	{
      Descriptor_VectorBit bs_descriptor = bs.getDescriptor_VectorBit();

      if ( bs_descriptor.getLimiteSuperior() != this.descriptorVector_.getLimiteSuperior())
            return;
      else if ( bs_descriptor.getLimiteInferior() != this.descriptorVector_.getLimiteInferior())
            return;
      else
        {
            int i = 0;
            boolean[] bsBits = bs.getBits();

        }
        	
	}
	
	/** */
	public void xor(VectorBit_jv bs)
	{
	
	}
	
	/** */
	public void copiar(VectorBit )
	{
	
	}
	
	/** */
	public void iterator()
	{
	
	}
	
	/** */
	public void builder()
	{
	
	}
	
	/** */
	public String toString()
	{
	
	}

	/** */
	public VectorBit buildVectorBit(VectorBit val)
	{
              
	}

    /** bits assesor.
      * @return the bits property
      **/
    public Descriptor_VectorBit getBits ()
      {
        return this.bits;
      }

    /** descriptorVector_ assesor.
      * @return the descriptorVector_ property
      **/
    public Descriptor_VectorBit getDescriptor_VectorBit ()
      {
        return this.descriptorVector_;
      }
}
