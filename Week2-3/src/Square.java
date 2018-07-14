public class Square {

    private int mSideLen;
    private int mX;
    private int mY;


    //constructors
    public Square(){
        this(0, 0, 0);
    }

    public Square(int pX, int pY, int pSideLen){
        setX(pX);
        setY(pY);
        setSideLen(pSideLen);

    }

    //accessor methods

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }

    public int getSideLen() {
         return mSideLen;
    }

    //mutators

    public void move(int pNewX, int pNewY) {
        setX(pNewX);
        setY(pNewY);
    }

    public void setX(int newX) {
        mX = newX;
    }

    public void setY(int newY) {
        mY = newY;
    }

    public void setSideLen(int newSideLen) {
        mSideLen = newSideLen;
    }
}
