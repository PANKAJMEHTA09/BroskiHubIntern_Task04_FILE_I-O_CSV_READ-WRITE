Product Filter (Java File Handling Task)

📌 **Overview**

This project demonstrates file handling in Java by reading data from a CSV file, applying filtering conditions, and writing the filtered results into a new CSV file.
It is part of a learning exercise to practice reading/writing text files, parsing data, and applying conditions on structured input.

**🛠 Tools & Technologies
**

Java (JDK 8+ recommended)

IDE: IntelliJ IDEA / Eclipse / VS Code

File Types: CSV (Comma-Separated Values)

   ** **  🔑 Key Concepts**
**

File handling (FileReader, BufferedReader, FileWriter)

Reading text files line by line

Parsing CSV data using String.split(",")

Type conversion (String → double)

Conditional filtering

Writing results into a new CSV file

   **   **Steps Performed****

Create a sample products.csv file with product name and price.
**Example:**

Laptop,55000
Mouse,800
Keyboard,1200
Monitor,9500


Use BufferedReader to read lines from the file.

Split each line by comma , to extract name and price.

Convert price to a double and check if it satisfies the filtering condition (price < 10000 in this case).

Use FileWriter to write matching products into a new CSV file (FilterProducts.csv).

Print a success message and verify that the new file contains only the filtered products.

**📂 File Structure**
Broskihub_Intern/
│── Task4/
│   ├── products.csv        # Input file containing product data
│   ├── FilterProducts.csv  # Output file containing filtered products
│   └── filterproducts.java # Java program

▶️** How to Run**

Place your products.csv inside the Task4 folder.
Update the file paths in filterproducts.java if needed.
Compile and run the program:

javac filterproducts.java
java Task4.filterproducts

Check the generated FilterProducts.csv for results.

✅** Example Output**
If products.csv contains:

Laptop,55000
Mouse,800
Keyboard,1200
Monitor,9500
**The FilterProducts.csv will contain:
**
Mouse,800
Keyboard,1200
Monitor,9500  <img width="1905" height="1017" alt="image" src="https://github.com/user-attachments/assets/81224830-1737-496d-9d3e-6419d3f31d6a" />
