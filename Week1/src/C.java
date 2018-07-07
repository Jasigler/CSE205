
public class C {

	//Instance variables
	  private int mX;
	  private int mY;
	  private final int A = 100;
	  public final int B = 200;
	  
	  //Constructors
	  public C(int pX) {
	   	setX(pX);
	  }
	  
	  public C(){
	    mX = -1;
	  }
	  
	  
	  //Accessor & mutator methods
	  public void setX(int setValue) {
	      mX = setValue;
	    }//End method
	  
	  public int getX() {
	      return mX;
	    }//End method
	  
	  public void setY(int setValue) {
	      mY = setValue;
	    }//End of method
	    
	  public int getY() {
	      return mY;
	    }//End of method
	  
	}//End of C class
	

