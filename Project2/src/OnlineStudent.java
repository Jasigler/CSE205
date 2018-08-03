//********************************************************************
//
//DESCRIPTION: Creates an online student that implements a tech fee
//
//COURSE: CSE 205 Summer 2018
//
//AUTHOR: Jason Sigler
//        jsigler2@asu.edu
//********************************************************************



import tuition.TuitionConstants;

public class OnlineStudent extends Student implements Comparable<Student> {

   private boolean mTechFee;
   private String mFname;
   private String mLname;
   private String mId;
   private int mCredits;
   private double mTuition;

    /**
     * Generic constructor
     */
    public OnlineStudent(){

   }//End of generic constructor

    /**
     * The argumentative online student object constructor
     * @param pId is the student's ID number
     * @param pFname is the student's first name
     * @param pLname is the student's last name
     */
    public OnlineStudent(String pId, String pFname, String pLname){
      super(pId, pFname, pLname);
      setId(pId);
      setFname(pFname);
      setLname(pLname);
    }//End of argumentative constructor

    /**
     * Calculates tuition based on the online credit rate and applies an online tech fee if
     * required. Calls the setTuition method with the calculated tuition as an argument.
     */
    public void calcTuition() {
        double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
        if (getTechFee()){
            t += TuitionConstants.ONLINE_TECH_FEE;
        }

        setTuition(t);

    }//End of calcTution method


    /**
     * Compares the uniqe student ID passed as a constructor argument to the instance variable to ensure
     * continuity.
     * @param pStudent the student constructor
     * @return the difference between two student ids
     *
     */
    public int compareTo(int pStudent){
        return getId().compareTo(pStudent.getID);
    }

    /**
     * An accessor method for the mCredits variable
     * @return the total credits
     */
    public int getCredits(){
        return mCredits;
    }

    /**
     * An accessor method for the mFname variable
     * @return the student's First name
     */
    public String getFirstName(){
        return mFname;
    }

    /**
     * An accessor method for the mLname variable
     * @return the student's last name
     */
    public String getLastName() {
        return mLname;
    }

    /**
     * An accessor method for the mId variable
     * @return the student's ID
     */
    public String getId(){
        return mId;
    }

    /**
     *  An accessor method for the mTuition variable
     * @return the total tuition cost
     */
    public double getTuition(){
        return mTuition;
    }

    /**
     * A mutator method for the mTuition variable
     * @param pCredits : the total credits that the student has
     */
    public void  setCredits(int pCredits){
        mCredits = pCredits;
    }

    /**
     * A mutator method for the mFname variable
     * @param pName : the student's first name
     */
    public void setFname(String pName){
        mFname = pName;
    }

    /**
     * A mutator method for the mTuition variable
     * @param pId : the student's ID number
     */
    public void setId(String pId){
        mId = pId;
    }

    /**
     * A mutator method for the mLnamevariable
     * @param pLname : the sudent' last name
     */
    public void setLname(String pLname){
        mLname = pLname;
    }

    /**
     * A mutator method for the mTuition variable
     * @param pTuition : the student's total tuition cost
     */
    protected void setTuition(double pTuition){
        mTuition = pTuition;

    }

    /**
     * An accessor method for the mLnamevariable
     * @return : the tech fee boolean.
     */
    public boolean getTechFee() {
        return mTechFee;
    }


    /**
     * A mutator method for the mTechFee variable.
     * @param pTechFee : the tech fee, if determined by getTechFee()
     */
    public void  setTechFee(boolean pTechFee){
        mTechFee = pTechFee;

    }
}//End of OnlineStudent Class
