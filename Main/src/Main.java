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

        //Exercise 5.3: Employee salary review
        EmployeeSalaryReport employeeSalaryReport1 = new EmployeeSalaryReport(1234, "Makwa", 75000);
        EmployeeSalaryReport employeeSalaryReport2 = new EmployeeSalaryReport(4321, "Lona", 55000);
        EmployeeSalaryReport employeeSalaryReport3 = new EmployeeSalaryReport(5678, "Hishaam", 80000);
        EmployeeSalaryReport employeeSalaryReport4 = new EmployeeSalaryReport(9879, "John", 9878.99);
        EmployeeSalaryReport employeeSalaryReport5 = new EmployeeSalaryReport(3754, "Alice", 15460.65);

        EmployeeSalaryReport[] employees = {employeeSalaryReport1, employeeSalaryReport2, employeeSalaryReport3, employeeSalaryReport4, employeeSalaryReport5};

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayEmployeeDetails();
            employees[i].determineThreshold();
        }

        employeeSalaryReport1.determineAverageSalary(employees);
        employeeSalaryReport1.determineHighestSalary(employees);

         */

        /*
        Exercise 6.1: Incorrect string comparison

        Explain why the following code may print Different text, then correct it to compare String contents.

        String first = new String("Java");
        String second = new String("Java");

        if (first == second) {
            System.out.println("Same text");
        } else {
            System.out.println("Different text");
        }

        The following code may print "Different text" as it is comparing text using "==" and not the
        .equals() method. The "==" compares object references and not the actual value of the strings

        The correction is as follows:
        String first = new String("Java");
        String second = new String("Java");

        if (first.equals(second)) {
            System.out.println("Same text");
        } else {
            System.out.println("Different text");
        }

         */

        /*
        Exercise 6.2: Array index

        Explain the error and correct the loop condition.

        int[] numbers = {10, 20, 30};

        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        The error above is that the loop will continue while i is less than or equal to the length of
        the array. If we loop until the exact length of the array this will cause an error because
        the index of the array will no longer be accessible as it will be out of bounds since array
        indexes start at 0

        The correct code is as follows:

        int[] numbers = {10, 20, 30};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */

        /*
        Exercise 6.3: Incorrect grade conditions

        Rewrite the conditions so a mark of 85 displays Distinction.

        int mark = 85;

        if (mark >= 50) {
            System.out.println("Pass");
        } else if (mark >= 80) {
            System.out.println("Distinction");
        }

        Correction:

        int mark = 85;

        if (mark >= 50) {
            System.out.println("Pass");
        } else if (mark >= 85 && mark <= 100) {
            System.out.println("Distinction");
        }

         */
    }
}
