package validator;

public class BookValidator {

    public Integer validateBookByYear(Integer year) {
        if (year < 1000 || year > 9999) {
            System.out.println("Invalid year");
        }
        return year;
    }

}
