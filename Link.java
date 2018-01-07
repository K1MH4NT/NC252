package Chatchai;

/**@nantawat5907401001
 */

public class Link {
	 public long data;
	  public Link next;

	  public Link(long val) {
	    data = val;
	    next = null;
	  }

	  public void displayLink() {
	    System.out.print(data + " ");
	  }

	}  
