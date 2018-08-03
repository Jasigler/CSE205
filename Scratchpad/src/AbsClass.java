public abstract class AbsClass   {

    private int x;
    private int y;
    private static int z;

    public AbsClass (int x, int y) {
        x = this.x;
        y = this.y;

    }

    public AbsClass(){

    }

    public void methodOne(int x){
        x = this.x;

    }

    public  void methodTwo (int y){
        y = this.y;

    }


}
