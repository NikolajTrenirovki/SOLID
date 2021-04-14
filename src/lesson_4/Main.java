package lesson_4;

public class Main {
    static Rectangle getRect() {
        return new Rectangle();
    }

   static Squeare getSqueare() {
        return new Squeare();
    }


    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(10);
        rectangle.setWith(5);
        System.out.println(rectangle.getSquere());

        Squeare squeare = getSqueare();
        squeare.setWith(5);
        System.out.println(squeare.getSquere());
    }
}
interface Shape {
    int getSquere();
}
class Rectangle implements Shape {

    int with;
    int height;

    public int getWith() {
        return with;
    }

    public void setWith(int with){
        this.with = with;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquere() {
        return with*height;
    }
}

class Squeare implements Shape {

    int with;

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    @Override
    public int getSquere() {
        return with*with;
    }
}