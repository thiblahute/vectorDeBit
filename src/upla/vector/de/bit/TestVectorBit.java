package test;

import upla.vector.de.bit.*;

public class TestVectorBit 
{ 
    public static void main(String[] args) { 
        VectorBit vectorBit = new VectorBit_jv (17); 
        String vectorStr = vectorBit.toString ();

        System.out.print(vectorStr);
        System.out.println(); 
    } 
} 

