package pro.edu;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int length = 7;
        int widhts = 8;
        int area = length * widhts;
        System.out.println(area);

//-------------------------------------------
// -    oop way  -----------------

         Rectangle myGarden = new Rectangle(7,8);
        System.out.println("The area of my garden is " + myGarden.getArea());

        System.out.println(Rectangle.getArea(10, 5));

        myGarden.setLength(10);

        System.out.println(myGarden.toString());

        Double d = 19.0;
        double f = 77.0;

        LocalDate date = LocalDate.now();

        System.out.println(myGarden.getArea());

         Rectangle hisGarden = new Rectangle();
         hisGarden.setLength(12);
         hisGarden.setWidths(5);

         hisGarden.equals(myGarden);
        System.out.println(myGarden.hashCode());

        Triangle first = new Triangle(2,2,2);
        Triangle second = new Triangle(2f,2f,2d);

         Triangle third = new Triangle(10,1, 1);
        System.out.println(third.toString());


        Triangle fourth = TriangleFactory.create(10,1,1);



    }
}
