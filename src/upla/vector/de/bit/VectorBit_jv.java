/**
  @ Project : Vector de bit
  @ File Name : VectorBit_jv.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

import java.util.*;
import java.lang.*;
import java.text.*;
import java.util.ArrayList;
import java.util.Iterator;



public class VectorBit_jv implements VectorBit
{
    ArrayList<Boolean> bits;
    private int iteratorPosition=0;
    private Iterator iterator;

	/**
     *   Instanciate a vectorBit
     **/
	public VectorBit_jv ()
      {
        ; /* Interesting */
      }
	/** Instanciate a vectorBit
     *  @param toConvert the #integer to convert and put in the vector of bit
     **/
	public VectorBit_jv (int toConvert)
      {
        int i = 0;
        String binStr = Integer.toBinaryString(toConvert);
        StringCharacterIterator binStrIter = new StringCharacterIterator (binStr); 

        bits = new ArrayList<Boolean>();

        for(char c = binStrIter.first(); c != CharacterIterator.DONE; c = binStrIter.next())
          {
            if (c == '0')
              this.bits.add (false);
            else
              this.bits.add (true);
          }
      }

    public boolean test (int indice)
      {
        return this.bits.get (indice);
      }

	public boolean set(int indice)
	{
      if (indice < 0 || indice > this.bits.size ())
            return false;
      else if (this.bits.get (indice) == true)
            return false;
      else
          this.bits.set (indice, true);
      return true;
	
	}
	
	public boolean unset(int indice)
	{
      if (indice < 0 || indice > this.bits.size ())
            return false;
      else if (this.bits.get (indice) == false)
            return false;

      else
          this.bits.set (indice, false);

      return true;
	}
	
	public boolean negar(int indice)
	{
      if (indice < 0 )
            return false;
      else if (!this.test (indice))
          this.set (indice);
      else
          this.unset (indice);

      return true;
	}
	
	public void or(VectorBit bs)
      {

        int i;

        for (i=0; i < this.bits.size (); i++)
          {
            if (bs.test (i) || this.test (i))
              this.set (i);
            else 
              this.unset (i);
          }
      }
	
	public void xor(VectorBit bs)
	{
        int i;

        for (i=0; i < this.bits.size (); i++)
          {
            if ((bs.test (i) || this.test (i)) && bs.test (i) != this.test (i))
              this.set (i);
            else 
              this.unset (i);
          }
	}

	public void and (VectorBit bs)
      {
        int i;

        for (i=0; i < this.bits.size (); i++)
          {
            if (this.test (1) && bs.test (i) == this.test (i))
              this.set (i);
            else 
              this.unset (i);
          }

      }
	
	public void copiar(VectorBit bs)
	{
        int i;

        for (i=0; i < this.bits.size (); i++)
          {
            if (this.test (1) && bs.test (i) == this.test (i))
              this.set (i);
            else 
              this.unset (i);
          }
	}
	
    public int length ()
      {
        return this.bits.size ();
      }

	public String toString()
      {
        String returnStr = new String ();
        VectorBitIterator iter = new VectorBitIterator_jv (this); 

        while (iter.hasNext()) { 
            Boolean b = iter.next();               
            returnStr += (b.booleanValue() ? "1" : "0"); 
        } 

        return returnStr;
      }

	public VectorBit buildVectorBit(VectorBit val)
	{
        throw new UnsupportedOperationException("Not supported yet.");
	}

    public void builder() 
      {
        throw new UnsupportedOperationException("Not supported yet.");
      }
}


