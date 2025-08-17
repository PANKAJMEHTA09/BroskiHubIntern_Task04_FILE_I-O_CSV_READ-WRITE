package Task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;

public class filterproducts {
    public static void main(String[] args) {
        String inputReader = "D:\\Broskihub_Intern\\Task4\\products.csv";
        String outputReader = "D:\\Broskihub_Intern\\Task4\\FilterProducts.csv";

try {


    BufferedReader br = new BufferedReader(new FileReader(inputReader));
    FileWriter fw = new FileWriter(outputReader);
//                FileReader=>
//        Low-level class in Java to read characters from a file.
//        Reads character by character (not efficient for big files).
//                 BufferedReader=>
//        High-level class that wraps around FileReader (or any Reader).
//        Reads line by line → much faster and easier.
//                 So the usual combination is:=>
//        BufferedReader br = new BufferedReader(new FileReader("products.csv"));
//        Here FileReader opens the file.
//           BufferedReader makes it efficient and gives you readLine().
//                     You should use both together  =>
//        BufferedReader(new FileReader(...)).

    String line = br.readLine();
    while (line != null) {
        String spliting[] = line.split(",");
        String name = spliting[0];
        double price = Double.parseDouble(spliting[1]);

        if (price < 10000) {
            fw.write(" our product is" + " " + name + ", " + "and its price is" + " "+ price + "\n");
        }
        System.out.println(" filtered products written to " + outputReader);

        line = br.readLine();

    }

    fw.close();
    br.close();

} catch (Exception e) {
    e.printStackTrace();
}










    }
}
