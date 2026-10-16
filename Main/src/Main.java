public class Main {
    public static void main (String[] args) {

        /*
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

        //Exercise 2.1: Pass or fail
        PassOrFail passOrFail = new PassOrFail();
        passOrFail.validMark();

        //Exercise 2.2: Grade calculator
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.determineGrade();

        //Exercise 2.3: Number analysis
        NumberAnalysis numberAnalysis = new NumberAnalysis();
        numberAnalysis.analyse();

        //Exercise 2.4: Login check
        LoginCheck loginCheck = new LoginCheck();
        loginCheck.checkCredentials();

        //Exercise 3.1: Store student marks
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.displayMarks();

        //Exercise 3.2: Highest and lowest values
        ArrayStatistics arrayStatistics = new ArrayStatistics();
        arrayStatistics.arrayAnalysis();

        //Exercise 3.3: Search an array
        ArraySearch arraySearch = new ArraySearch();
        arraySearch.findTargetIndex();

        //Exercise 3.4: Separate even and odd numbers
        EvenOddArray evenOddArray = new EvenOddArray();
        evenOddArray.splitEvenAndOdd();

        //Exercise 3.5: Reverse an array
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverseArray();

        //Exercise 4.1: Student class
        Student student1 = new Student("Hishaam", "123456", 96.5);
        Student student2 = new Student("John", "654321", 49.7);

        student1.displayDetails();
        student1.hasPassed();
        student2.displayDetails();
        student2.hasPassed();

        //Exercise 4.2: Bank account
        BankAccount bankAccount = new BankAccount("Hishaam", 123456789, 12000.56);

        bankAccount.getBalance();
        bankAccount.deposit(4567.98);
        bankAccount.getBalance();

        bankAccount.withdraw(3000.54);
        bankAccount.getBalance();

        //Exercise 4.3: Product inventory
        Product product = new Product(12, "Redbull", 25, 255);

        product.displayProductDetails();
        product.addStock(34);
        product.reduceStock(26);
        product.calculateStockValue();

        //Exercise 4.4: Rectangle
        Rectangle rectangle1 = new Rectangle(23.8, 27.6);
        Rectangle rectangle2 = new Rectangle(12.2, 15.4);

        rectangle1.area();
        rectangle1.perimeter();

        rectangle2.area();
        rectangle2.perimeter();

        //Exercise 5.1: Student result system
        StudentResults studentResults1 = new StudentResults(1234, "Makwa", new double[] {10, 55.5, 30.4});
        StudentResults studentResults2 = new StudentResults(5432, "Lona", new double[] {65.9, 80, 78.8});
        StudentResults studentResults3 = new StudentResults(9789, "Ditebogo", new double[] {89, 78.5, 80.5});

        studentResults1.displayDetails();
        studentResults1.average();

        studentResults2.displayDetails();
        studentResults2.average();

        studentResults3.displayDetails();
        studentResults3.average();

        studentResults1.countPassed();
        studentResults1.highestAverage();

         */

        //Exercise 5.2: Mini point-of-sale system
        ShoppingCart shoppingCart1 = new ShoppingCart("Redbull", 25, 100);
        ShoppingCart shoppingCart2 = new ShoppingCart("Scones", 11.50, 60);
        ShoppingCart shoppingCart3 = new ShoppingCart("Burger", 99.99, 10);
        ShoppingCart shoppingCart4 = new ShoppingCart("Monster", 24, 80);

        ShoppingCart[] items = {shoppingCart1, shoppingCart2, shoppingCart3, shoppingCart4};

        for (int i = 0; i < items.length; i++) {
            items[i].lineTotal();
        }

        shoppingCart1.displaySubTotal();
        shoppingCart1.calculateDiscount();
        shoppingCart1.displayFinalTotal();
    }
}
