package pro.edu;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int length = 7;
        int widhts = 8;
        int area = length * widhts;
        System.out.println(area);
//--------------------------------------------
        //-    oop way  -----------------

         Rectangle myGarden = new Rectangle(7,8);
         myGarden.setLength(10);

        System.out.println(myGarden.toString());

        Double d = 19.0;

        LocalDate date = LocalDate.now();

        System.out.println(myGarden.getArea());

         Rectangle hisGarden = new Rectangle();
         hisGarden.setLength(12);
         hisGarden.setWidths(5);

         hisGarden.equals(myGarden);
        System.out.println(myGarden.hashCode());

    }
}
