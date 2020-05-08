package pro.edu;

import java.util.Objects;
/*
*
* Class Rectangle
*
* created by Ivanov
*
* 5 May 2020
*
*
* */
public class Rectangle {

    private int length;
    private int widths;

    public Rectangle() {
    }

    public Rectangle(int length, int widhts) {
        this.length = length;
        this.widths = widhts;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {

        if(length>0) {
            this.length = length;
        }
    }

    public int getWidths() {
        return widths;
    }

    public void setWidths(int widths) {
        this.widths = widths;
    }

    public int getArea(){
        return  this.getLength() * this.getWidths();
    }

    public static int getArea(int length, int widhts){
        return  length * widhts;
    }

    public  int getPerimeter(){
        return 2 * ( this.getLength() + this.getWidths() );
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", widths=" + widths +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() &&
                getWidths() == rectangle.getWidths();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidths());
    }



}
