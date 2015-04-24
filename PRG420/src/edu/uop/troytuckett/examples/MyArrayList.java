package edu.uop.troytuckett.examples;

/** This is a demonstration class that shows in a very basic way how the ArrayList class uses a
 *  set of primitive arrays to create dynamic memory allocation.  The class uses two private member 
 *  arrays with one used at a time and when the first gets short on elements, the second is expanded
 *  and the contents of the first is copied to the second.  It keeps track of which array is 
 *  currently in use.
 *  
 * @author Troy Tuckett
 *
 */
public class MyArrayList {
    
    private Object[] array1;
    private Object[] array2;
    private boolean usingArray1 = true;
    private int arraySize = 0;
    private int numElements = 0;
    private final int GROWBY = 50;
         
    /** This method is used to expand the array as more data is added. */
    private void allocateArray() {
	
	try {
	    if(usingArray1) {
		if (array1 == null) {
		    array1 = new Object[GROWBY];
		} else {
		    // allocate more space
		    array2 = new Object[arraySize+GROWBY];

		    //copy from 1 to 2
		    System.arraycopy(array1, 0, array2, 0, numElements);
		    
		    usingArray1 = false;
		}		
	    } else {
		if (array2 == null) {
		    array2 = new Object[GROWBY];
		} else {
		    // allocate more space
		    array1 = new Object[arraySize+GROWBY];

		    //copy from 2 to 1
		    System.arraycopy(array2, 0, array1, 0, numElements);
		    
		    usingArray1 = true;
		}	
	    }
	}
	catch (Exception e) {
	    System.err.println(e.getMessage());
	}
	
	arraySize+=GROWBY;	
    }
    
    /** Keeps track of which array is currently in use. */
    private Object[] getMyArray() {
	
	if (usingArray1) {
	    return array1;
	} else {
	    return array2;
	}	
    }
    
    /** Constructor.  Sets up initial array for use. */
    public MyArrayList() {
	allocateArray();
    }
    
    /** Adds an Object element to the end of the array. */
    public void addElement(Object myObject) {
	
	//Check if more space needs to be allocated to add element
	if (numElements==arraySize) {
	    this.allocateArray();
	}
	
	//Set array value
	getMyArray()[numElements] = myObject;
	
	numElements++;	
    }
    
    /** Adds an Object element at the desired position in the array. Element is zero based. */
    public void addElement(int element, Object myObject) {
	
	//Handle element being larger than array or adding to the end.
	if (element>numElements) {
	    element=numElements;
	    numElements++;	    
	}
	
	//Expand array, if necessary
	if (element>=arraySize) {
	    this.allocateArray();
	}	

	//Set Array value
	getMyArray()[element] = myObject;
    }
    
    /** Removes an element from the specified place. Element is zero based. */
    public void removeElement(int element) {
	
	//Handle element larger than array or removing from the end.
	if (element >= numElements) {
	    element = numElements-1;
	    numElements--;
	}
	
	// Remove array element
	getMyArray()[element] = null;
    }
    
    /** Returns an Object from the specified place. Element is zero based. */
    public Object getElement(int element) {
	
	//Handle element larger than array
	if (element>=numElements) {
	    element=numElements-1;
	}
	
	return getMyArray()[element];
    }
    
    /** Returns current array length. 1 greater than the last element. */
    public int getLength() {
	return numElements;
    }
}