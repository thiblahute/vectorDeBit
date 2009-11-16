package upla.vector.de.bit;

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

