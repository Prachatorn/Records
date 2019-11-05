import java.util.*;
import java.io.*;

public class VisualCollection {

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
      int watched = 0;
      while (input.hasNextLine()) {
         String list = input.nextLine();
         if (list.contains("(Watched)")) {
            watched++;
         }
      }
      System.out.println("Things watched = " + watched);
   }
   
   public static void random(Scanner input2) { 
      List<String> list = new ArrayList<String>();
      while (input2.hasNextLine()) {
         String notDone = input2.nextLine();
         if (!notDone.contains("(Watched)")) {
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