/**
  @ Project : Vector de bit
  @ File Name : Builder_VectorBit.java
  @ Date : 02/11/2009
  @ Author : David Vargas; Thibault Saunier, Carlos Lagos
*/

package upla.vector.de.bit;

/** */
public class Descriptor_VectorBit implements Director_Descriptor
{
	private int final bajo_;
	private int final alto_;
	private boolean final optEspacio;
	private boolean final optRapidez;
	private boolean final chequeado;
	
	/** 
     *   Instanciar el descriptor de vector de Bit
     *   @param bajo El limite inferior
     *   @param alto El limite superior
     **/
	public void Descriptor_VectorBit(int bajo, int alto)
	{
      bajo_ = bajo;
      alto_ = alto;
	}

	
	/** 
     *   Instanciar el descriptor de vector de Bit
     */
	public void Descriptor_Vector()
	{
        bajo_ = 0;
        alto_ = 127;
	}
	
	/** @return Boolean saying if the space optimization 
      *         feature is enabled or not.
     **/
	public boolean optimizarEspacio()
	{
	    return this.optEspacio;
	}
	
	/** @return Boolean saying if the speed optimization 
      *         feature is enabled or not.
     **/
	public boolean optimizarRapidez()
	{
      return this.optRapidez;	
	}
	
    /**
     * @return El limite inferior del vector de bit.
     **/ 
	public int getLimiteInferior()
	{
      return bajo_;
	}
	
    /**
     * @return El limite superior del vector de bit.
     **/ 
	public int getLimiteSuperior()
	{
	    return alto_;
	}
	
	/** */
    @override
	public String getDescripcion ()
	{
        string = new string ("");
        return	
	}
	
	/** */
	public void and (VectorBit bs)
	{
	}
}
