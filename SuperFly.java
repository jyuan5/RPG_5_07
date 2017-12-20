/**
  SuperFly encapsulates the implementation of a list of disparate types,
  programmed without polymorphism
 */
public class SuperFly {

    private int filledElements; // the number of elements in this list

    // underlying containers
    private int[]    intData;
    private double[] doubleData;
    private String[] StringData;

    private static final int INITIAL_CAPACITY = 10;


    /** 
      Constructs an empty list with an initial capacity of ten,
      and with no elements initially.
     */
    public SuperFly() {
    }


    /** 
      @return the number of elements in this list
     */
    // public int size() {
    // }


     /** 
       @return a string representation of this list, in [a,b,c,] format
      */ 
    // public String toString() {
    // }


    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     // public boolean add( int type
                       // , int intValue
                       // , double doubleValue
                       // , String stringValue
                       // ) {
     // }


    /** 
      Doubles the capacity of the SuperFly, 
      preserving existing data
     */
     // private void expand() {
        // System.out.println( "expand... (for debugging)"); /* comment out eventually
           // Working methods should be silent. But during development, the programmer
           // must verify that this method is called when that is appropriate. 
           // S.O.P. rules for debugging.
           // */
     // }
}
