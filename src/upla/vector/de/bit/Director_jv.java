/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package upla.vector.de.bit;

/**
 *
 * @author 
 */
public class Director_jv implements Director
{

/*    Director_Builder Director_jv()
	{
      return new Director_Builder_jv();	
	}
TODO see if needed
*/

	public Director_Builder hacerBuilder()
      {
        return new Director_Builder_jv ();
      }
    
}
