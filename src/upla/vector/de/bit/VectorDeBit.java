/**
  @ Project : Vector de bit
  @ File Name : Builder_VectorBit.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

/** @public class  Vector Bits*/

public class VectorDeBit
{ 
    public static void main(String[] args) { 
        Director director = new Director_jv ();

        Director_Builder directorBuilder = director.hacerBuilder ();

        Object builder_VectorBit = directorBuilder.build ();
        VectorBit vectorBit = ((Builder_VectorBit) builder_VectorBit).buildVectorBit (10);

        String vectorStr = vectorBit.toString ();

        System.out.print(vectorStr);
        System.out.println();
    } 
}

