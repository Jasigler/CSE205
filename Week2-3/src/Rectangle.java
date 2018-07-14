public class Rectangle {

    private int mHeight;
    private int mWidth;
    private int mX;
    private int mY;

    //default constructor

    public Rectangle(){
        this(0, 0, 0, 0);
        }//End of constructor

    public Rectangle(int pX, int pY, int pWidth, int pHeight){
        setX(pX);
        setY(pY);
        setWidth(pWidth);
        setHeight(pHeight);
    }

    public int getHeight(){
        return mHeight;
    }

    public int getWidth () {
        return mWidth;
    }

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }

    public void move(int pNewX, int pNewY) {
        setX(pNewX);
        setY(pNewY);
    }

    public void resize(int pNewWidth, int pNewHeight){
        setWidth(pNewWidth);
        setHeight(pNewHeight);
    }

    public void setHeight(int newHeight) {
        mHeight = newHeight;
    }

    public  void setWidth(int newWidth) {
        mWidth = newWidth;
    }

    public void setY (int newY) {
        mY =  newY;
    }

    public void setX (int newX) {
        mX = newX;
    }
}
