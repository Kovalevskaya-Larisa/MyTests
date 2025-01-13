public class Point implements Movable{
    private int x;
    private int y;

    public Point() {

    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp(int movement){
        y += movement;
        System.out.println("После движения вверх: " + toString ());
    }
    @Override
    public void moveDown(int movement){
        y -= movement;
        System.out.println("После движения вниз: " + toString ());

    }
    @Override
    public void moveLeft(int movement){
        x -= movement;
        System.out.println("После движения влево: " + toString ());

    }
    @Override
    public void moveRight(int movement){
        x += movement;
        System.out.println("После движения вправо: " + toString ());
    }
     public String toString() {
        return "(" + x + ", " + y + ")";

    }

}
