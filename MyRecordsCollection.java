import java.util.*;
import java.io.*;

public class MyRecordsCollection {

   public static void main(String[] args) throws FileNotFoundException  {
      Scanner console = new Scanner(System.in);
      System.out.print("What is the file name?: ");
      String anime = console.nextLine();
      Scanner input = new Scanner(new File(anime));
      count(input);
      Scanner input2 = new Scanner(new File(anime));
      random(input2);
   }
   
   public static void count(Scanner input) {
      int watched = 0;
      int read = 0;
      while (input.hasNextLine()) {
         String gay = input.nextLine();
         if (gay.contains("(Watched)")) {
            watched++;
         } else if (gay.contains("(Read)")) {
            read++;
         }
      }
      System.out.println("Things watched = " + watched);
      System.out.println("Things read = " + read);
   }
   
   public static void random(Scanner input2) { 
      List<String> list = new ArrayList<String>();
      while (input2.hasNextLine()) {
         String notDone = input2.nextLine();
         if (!notDone.contains("(Watched)") && !notDone.contains("(Read)")) {
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