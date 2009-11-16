package upla.vector.de.bit;

public class VectorDeBit
{ 
    public static void main(String[] args) { 
        Director director = new Director_jv ();

        Director_Builder directorBuilder = director.hacerBuilder ();

        Object builder_VectorBit = directorBuilder.build ();
        VectorBit vectorBit = ((Builder_VectorBit) builder_VectorBit).buildVectorBit (10);
        VectorBit vectorBit2 = ((Builder_VectorBit) builder_VectorBit).buildVectorBit (12);

        String vectorStr = vectorBit.toString ();
        System.out.print(vectorStr);
        System.out.println();

        vectorStr = vectorBit2.toString ();
        System.out.print(vectorStr);
        System.out.println();
        
        vectorBit.and (vectorBit2);

        vectorStr = vectorBit.toString ();
        System.out.print(vectorStr);
        System.out.println();
    } 
}

