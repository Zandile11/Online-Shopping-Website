# 🛒 Mini Shop – Online Shopping Website

A small Java project that simulates a basic online shopping experience.
Customers can log in, browse products, add items to a shopping cart,
and place orders.

## 📌 Project Overview

Mini Shop demonstrates the basic functionality of an online shopping
system using Java and object-oriented programming principles.

The project includes product management, customer information,
shopping cart operations, and order processing.

## 📂 Project Structure

| Class | Description |
|-------|-------------|
| `Product` | Represents a product with a name and price. |
| `Customer` | Stores a customer's email and password and validates the email format. |
| `ShoppingCart` | Maintains a list of products and allows customers to add or remove items. |
| `OrderService` | Handles login validation and order placement. |

## ⚙️ How It Works

1. **Login:** Customers log in using their email and password.
2. **Browse Products:** Customers can view available products.
3. **Add to Cart:** Customers add products to their shopping cart.
4. **Remove Items:** Customers can remove products from their cart.
5. **Place an Order:** The system validates the customer's email and checks that the cart is not empty before processing the order.

## 🧪 Running the Tests

This project uses Maven to run automated tests.

Open a terminal in the project directory and run:

```bash
mvn test
