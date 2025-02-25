package com.wipro.java.ms.l;

public class Test {
	static void getAreaTest(Rectangle r) {
        int length = r.getLength();
        r.setBreadth(10);
        System.out.println("Expected area: " + (length * 10) + ", got: " + r.getArea());
    }

    public static void main(String[] args) {
        // Testing Rectangle
        Rectangle rc = new Rectangle();
        rc.setLength(2);
        rc.setBreadth(3);
        getAreaTest(rc);

        // Testing Square
        Square sq = new Square();
        sq.setLength(5); 
        getAreaTest(sq);
    }
}
