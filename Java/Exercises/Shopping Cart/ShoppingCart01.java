import java.util.Scanner;

public class ShoppingCart01 {
    public static void main(String[] args) {
        // Create scanner class
        Scanner scan = new Scanner(System.in);

        // Declare Variables
        float rate, total = 0;
        short quantity, count = 0;
        String itemName, chart="""
        S.no | Name        | Rate | Quan | Total
        -----|-------------|------|------|------
        """;

        // Add items to chart
        while (true) {
            System.out.println("Item count: " + (++count));
            System.out.print("Name of item (q to end loop): "); itemName = scan.nextLine();
            if (itemName.equals("q")) {break;}
            System.out.print("Rate of item: "); rate = scan.nextFloat();
            System.out.print("Quantity of item: "); quantity = scan.nextShort();
            scan.nextLine();    // buffer for next iteration

            total += (rate*quantity);
            chart += (count + "   | " +itemName + " | " + rate + " | " + quantity + " | " + (rate*quantity) + '\n');


        }

        System.out.println("------------- SHOPPING LIST ----------------");
        System.out.println(chart);
        System.out.println("Grand Total = " + total);

        // Close Scanner object
        scan.close();
    }
}

/* IMPROVEMENT SCOPE
 * 
 * BEGINNER LEVEL UPGRADES
🧼 Code Quality:

✅ Separate Methods for actions (addItem(), showCart(), showTotal()) to clean up main().
✅ Use of constants (e.g., tax rate, max quantity) instead of magic numbers.
✅ Better naming: rate → unitPrice, cart → shoppingCart.

📋 Input Improvements:

🔐 Input validation (e.g., prevent negative price or quantity).
💢 Exception handling with try-catch blocks (e.g., catching InputMismatchException).
🔁 Input retry on invalid entry (without crashing the program).
🪄 UI Output Enhancements
🎨 Better tabular formatting using String.format() or printf.
🌐 Localized currency (e.g., NumberFormat.getCurrencyInstance()).
🧾 Add headers every time the cart is displayed.

🧱 STRUCTURAL IMPROVEMENTS (INTERMEDIATE):

🧱 Object-Oriented Design:

🎯 Encapsulation — make fields private, and access them via getters/setters.
🔁 Override .equals() and .hashCode() for comparing/removing items.
🧩 Add static cart ID to each item (Item.ID).
🛍️ Use inheritance: subclass Item into GroceryItem, ElectronicItem, etc.
🧪 Add unit tests using JUnit for Item class methods.

🧺 Cart Features:

✏️ Edit/Update an item (change name, quantity, price).
❌ Delete an item from the cart by S.no or name.
🔄 Clear cart (empty the list).
🔍 Search/filter item by name.

📦 ADVANCED FUNCTIONALITY (PROJECT-GRADE):

📊 Pricing Features

💸 Apply discount (flat %, coupon code, per item).
🧾 Add tax (GST, etc.).
📈 Total with breakdown (subtotal + tax + discount = total).

💾 File I/O:

💽 Save cart to file (cart.txt or .csv).
📂 Load cart from file (resume previous session).
🧷 Allow exporting cart as JSON, CSV, or tabular text.

🧠 Data Structures:

🧮 Use HashMap<String, Item> for faster item lookup/edit by name.
📑 Use TreeMap to sort items alphabetically.
🔢 Implement sorting: by name, price, quantity, or total.

🖥️ USER INTERFACE & EXPERIENCE:

🧑‍💻 Console UI:

🔄 Looped menu with submenus for each feature.
🛑 Add confirmation before delete or exit.
🕹️ Use enums or constants for menu choices.
🔁 Pagination if items exceed a certain count (10 per page).

🖱️ GUI (Graphical UI):

🖼️ Swing-based GUI version.
📦 JavaFX-based visual cart with buttons and table view.

🌐 BEYOND CONSOLE (PRO LEVEL IDEAS):

☁️ Persistence:

🗃️ Use SQLite or MySQL to store cart and items persistently.
👤 Add user login/signup system and cart per user.
🌍 Make a REST API backend for this cart system (Spring Boot).

🌐 Web Integration:

🕸️ Convert to a web app using Java + JSP/Servlet.
📲 Create a frontend using React or HTML/CSS and connect to Java backend.

🔒 BONUS IDEAS (FOR PRACTICE OR FUN):

🧠 Add "most expensive item" or "cheapest item" display.
📏 Show average item cost.
🧠 Show item with highest quantity.
🧾 Print cart receipt with date/time stamp.
📆 Add item expiry date (if groceries).
🧭 Filter items by category.
🛑 Auto-remove expired items.
🖨️ Print cart to printer.
⏳ Track time spent on cart session.
🧾 Add quantity limits per item (e.g., max 5 per user).
🧪 Add unit test cases with boundary conditions.
🧊 Freeze the cart (make it read-only) once “checkout” happens.

 */
