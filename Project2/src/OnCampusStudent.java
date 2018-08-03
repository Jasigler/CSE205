//********************************************************************
//
//DESCRIPTION: Creates an on-campus student that determines residency and
//             any program fees.
//
//COURSE: CSE 205 Summer 2018
//
//AUTHOR: Jason Sigler
//        jsigler2@asu.edu
//********************************************************************


import tuition.TuitionConstants;

public class OnCampusStudent extends Student implements Comparable<Student> {

    private boolean mResident;
    private double mProgramFee;
    private String mFname;
    private String mLname;
    private String mId;
    private int mCredits;
    private double mTuition;



    /**
     * Calculates tuition based on the online credit rate and applies an online tech fee if
     * required. Calls the setTuition method with the calculated tuition as an argument.
     */
    public void calcTuition() {
        double t;
        if (getResidency()) {
            t = TuitionConstants.ONCAMP_RES_BASE;
        } else {
            t = TuitionConstants.ONCAMP_NONRES_BASE;
        }//end of loop

        t = t += getProgramFee();

        if (getCredits() > TuitionConstants.MAX_CREDITS) {
            t += (getCredits() - TuitionConstants.MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }//end of loop

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
     * A mutator method for the mFname variable
     * @param pId : the sudent's ID number
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
     * Assessor method for the mProgram fee variable
     * @return program fee boolean
     */
    public double getProgramFee(){
        return mProgramFee;
    }

    /**
     *Assessor method for the residency variable
     * @return: student's residency status boolean
     */
    public boolean getResidency(){
        return mResident;
    }

    /**
     * Mutator method for the mProgramFee variable
     * @param pProgramFee : the program fee cost
     */
    public void setProgramFee(double pProgramFee){
        mProgramFee = pProgramFee;

    }

    /**
     * Sets the student's residency status
     * @param pResident : boolean residency status
     */
    public void setResidency(boolean pResident) {
        mResident = pResident;
    }



}//End OnCampusStudent Class
