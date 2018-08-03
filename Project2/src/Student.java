//********************************************************************
//
//DESCRIPTION: An abstract student superclass
//
//COURSE: CSE 205 Summer 2018
//
//AUTHOR: Jason Sigler
//        jsigler2@asu.edu
//********************************************************************




public abstract class Student implements Comparable<Student> {


    private String mFname;
    private String mLname;
    private String mId;
    private int mCredits;
    private double mTuition;


    /**
     * Generic Constructor of the Student object
     */

   public Student(){

   }

    /**
     * Argumentative(?) Student object constructor
     * @param pId the student's ID number
     * @param pFname the student's first name
     * @param pLname the student's last name
     */
   public Student(String pId, String pFname, String pLname) {
        mId = pId;
        mFname = pFname;
        mLname = pLname;
   }//End constructor

    /**
     * Calculates tuition
     */
    public abstract void calcTuition();

    /**
     * Compares
     * @param pStudent
     * @return
     */
    public abstract int compareTo(Student pStudent);

    public abstract int compareTo(int pStudent);

    public abstract int getCredits();

    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getId();

    public abstract double getTuition();

    public abstract void  setCredits(int pCredits);

    public abstract void setFname(String pName);

    public abstract void setId(String pId);

    public abstract void setLname(String pLname);

    protected abstract void setTuition(double pTuition);






}//End of Student Class

