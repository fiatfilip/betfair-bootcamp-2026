package ro.digitalstack.betfair.session04;

import ro.digitalstack.betfair.session02.shapes.Circle;
import ro.digitalstack.betfair.session02.shapes.Shape;

public class Box<T> {

    private T content;

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.set(1);
        System.out.println(box.get());
        Box<String> box2 = new Box<>();
        box2.set("hello");
        System.out.println(box2.get());
        Box<Circle> box3 = new Box<>();
        box3.set(new Circle(5));
        System.out.println(box3.get().getArea());
        Box<Shape> box4 = new Box<>();
    }
}
