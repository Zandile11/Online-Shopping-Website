# Mini Shop – Online Shopping Website 

## About the Project

Mini Shop is a simple Java project that simulates an online shopping experience. It allows customers to log in, browse products, add items to their shopping cart, remove items, and place orders.

I created this project to practise my Java programming skills and learn more about object-oriented programming (OOP), as well as how to write and run tests using Maven.

## Features

- **Customer Login:** Customers can log in using their email and password.
- **Product Management:** Products have a name and a price.
- **Shopping Cart:** Customers can add products to their cart and remove them when needed.
- **Order Processing:** The system checks that the customer's email is valid and that the shopping cart is not empty before placing an order.
- **Email Validation:** Customer email addresses are checked to make sure they follow a valid format.
- **Automated Testing:** Maven is used to run tests and check that the application works as expected.

## Technologies Used

- Java
- Apache Maven
- JUnit (for testing, if configured)
- Git and GitHub

## Project Structure

The project is organised into different classes, with each class responsible for a specific part of the shopping process.

| Class | Description |
|---|---|
| `Product` | Stores information about a product, including its name and price. |
| `Customer` | Stores customer details and validates email addresses. |
| `ShoppingCart` | Allows customers to add and remove products from their cart. |
| `OrderService` | Handles customer login validation and order placement. |

## Getting Started

Follow the steps below to download, set up, and run the project on your computer.

### Prerequisites

Before you get started, make sure you have the following installed:

- Java JDK
- Apache Maven
- A Java IDE, such as IntelliJ IDEA or Eclipse (optional)

You can check whether Java and Maven are installed by running these commands in your terminal:

```bash
java -version
```

```bash
mvn -version
```

If both commands display version information, you're ready to continue.

### Download the Project

If you're using Git, open your terminal and run:

```bash
git clone <your-repository-url>
```

Replace `<your-repository-url>` with your GitHub repository URL.

Next, move into the project folder:

```bash
cd mini-shop
```

If you've downloaded the project as a ZIP file, simply extract it and open the folder in your IDE.

### Build the Project

Before running the application or its tests, open a terminal in the project directory and run:

```bash
mvn clean compile
```

This command cleans up previously generated files and compiles the Java code to check for compilation errors.

If everything works correctly, Maven will display `BUILD SUCCESS`.

## How to Run the Project

If the project contains a main class with a `main()` method, you can run the application through your Java IDE.

1. Open the project in your IDE.
2. Find the main class inside `src/main/java`.
3. Open the class containing `public static void main(String[] args)`.
4. Click **Run** to start the application.

If you've configured the Maven Exec Plugin in your `pom.xml`, you can also run the application using:

```bash
mvn exec:java
```

**Note:** If the project doesn't have a main class yet, you can still compile the code and run the tests. You'll need to add an entry point before you can launch it as a standalone application.

## How to Run the Tests

Testing is an important part of the project because it helps check that the different features work as expected.

Mini Shop uses Maven to run automated tests.

### Run All Tests

To run all the tests, open your terminal in the project directory and execute:

```bash
mvn test
```

Maven will compile the code and run the available tests.

If everything passes, you should see a message similar to:

```text
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

The numbers may differ depending on how many tests are in the project.

### Run Tests from Scratch

If you want to clean the project and run all the tests again, use:

```bash
mvn clean test
```

This removes previously generated build files before running the tests again.

### Run a Specific Test

You can also run an individual test class instead of running the entire test suite.

For example:

```bash
mvn -Dtest=CustomerTest test
```

Or, to test the shopping cart:

```bash
mvn -Dtest=ShoppingCartTest test
```

Replace the class names with the actual test classes in your project.

### View the Test Results

After running the tests, Maven saves the test reports in:

```text
target/surefire-reports/
```

You can open these reports to see which tests passed and whether any tests failed.

If a test fails, check the error message to help identify what needs to be fixed.

## What I Learned

Working on Mini Shop has helped me practise:

- Writing Java classes and working with objects.
- Applying object-oriented programming principles.
- Managing products and shopping cart operations.
- Validating customer information.
- Using Maven to build a Java project.
- Writing and running automated tests.

## Future Improvements

There are still many ways this project could be improved in the future, such as:

- Adding a graphical user interface.
- Allowing customers to search for products.
- Managing product stock and quantities.
- Saving customer and order information in a database.
- Improving the login and authentication system.
- Adding more tests to cover different scenarios.

## Author

Created as a school project to practise Java programming, object-oriented programming, and automated testing.

