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

	/** Instanciate a vectorDeBit
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
	
    public void iterator()
      {
        this.iterator = this.bits.iterator();
      }
	

	public String toString()
      {
        int i = 0;
        String returnStr = new String ();

        for (boolean bool = this.bits.get (i); i < this.bits.size(); bool = this.bits.get (i))
          {
            if (bool)
              returnStr +=  '1';
            else
              returnStr +=  '0';

          }
        return returnStr;
      }

	public VectorBit buildVectorBit(VectorBit val)
	{
        return null;
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
        this.iterator.remove();
      }

    public void builder() 
      {
        throw new UnsupportedOperationException("Not supported yet.");
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
        this.set(skippedElmentIndex);

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
        this.unset(skippedElmentIndex);

        return skippedElmentIndex;
      }
}


