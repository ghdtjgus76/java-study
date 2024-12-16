package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate);
        
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("ofDate = " + ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println("ofDate = " + ofDate);
    }
}
