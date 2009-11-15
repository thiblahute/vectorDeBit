package test;

import upla.vector.de.bit.*;

public class TestVectorBit 
{ 
    public static void main(String[] args) { 
        // create BitSet and set some bits 
        VectorBit vectorBit = new VectorBit_jv (17); 
        VectorBitIterator iter = new VectorBitIterator_jv(vectorBit); 
        while (iter.hasNext()) { 
            Boolean b = iter.next();               
            String tf = (b.booleanValue() ? "T" : "F"); 
            System.out.print(tf); 
        } 
        System.out.println(); 
    } 
} 

