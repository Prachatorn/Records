import java.util.*;
import java.io.*;

public class PrintCollection {

   public static void main(String[] args) throws FileNotFoundException  {
      Scanner console = new Scanner(System.in);
      System.out.print("What is the file name?: ");
      String name = console.nextLine();
      Scanner input = new Scanner(new File(name));
      count(input);
      Scanner input2 = new Scanner(new File(name));
      random(input2);
   }
   
   public static void count(Scanner input) {
      int read = 0;
      List<String> listComplete = new ArrayList<String>();
      while (input.hasNextLine()) {
         String complete = input.nextLine();
         if (complete.contains("(Read)")) {
            listComplete.add(complete);
            read++;
         }
      }
      System.out.println(listComplete);
      System.out.println("Things Read = " + read);
   }
   
   public static void random(Scanner input2) { 
      List<String> list = new ArrayList<String>();
      while (input2.hasNextLine()) {
         String notDone = input2.nextLine();
         // if (!notDone.contains("(Read)") & notDone.contains("(Have)")) {
         if (!notDone.contains("(Read)")) {
            list.add(notDone);   
         } else {
            list.remove(notDone);
         }
      } 
      Random rand = new Random();
      String choose = "";
      for (int i = 0; i < list.size(); i++) {
         int num = rand.nextInt(list.size());
         choose = list.get(num);
      }
      System.out.println(choose);
   }
}