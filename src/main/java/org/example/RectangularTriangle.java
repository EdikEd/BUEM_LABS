package org.example;

public class RectangularTriangle {

    private int cathetusA;
    private int cathetusB;

    public RectangularTriangle(int cathetusA, int cathetusB) {
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    public int getCathetusA() {
        return cathetusA;
    }

    public void setCathetusA(int cathetusA) {
        this.cathetusA = cathetusA;
    }

    public int getCathetusB() {
        return cathetusB;
    }

    public void setCathetusB(int cathetusB) {
        this.cathetusB = cathetusB;
    }

    public double getHypotenuseC () {
        return Math.sqrt(this.cathetusA * this.cathetusA + this.cathetusB * this.cathetusB);
    }

    public double getRectangularTriangleArea() {
        return 0.5 * this.cathetusA * this.cathetusB;
    }

    public boolean isIsosceles() {
        return this.cathetusA == this.cathetusB;
    }

    public double getPerimeter() {
        return  this.cathetusA + this.getCathetusB() + this.getHypotenuseC();
    }

    public double getSinAlpha() {
        return this.cathetusA / this.getHypotenuseC();
    }
}
