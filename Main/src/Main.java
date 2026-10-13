public class Main {
    public static void main (String[] args) {

        //Exercise 1.1: Student details
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.displayStudentDetails();

        //Exercise 1.2: Shopping total
        ShoppingTotal shoppingTotal = new ShoppingTotal();

        shoppingTotal.total();
        shoppingTotal.discountAmount();

        //Exercise 1.3: Temperature conversion
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.convertTemp();
    }
}
