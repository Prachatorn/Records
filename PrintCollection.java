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
      int have = 0;
      //List<String> completeList = new ArrayList<String>();
      //List<String> haveList = new ArrayList<String>();
      while (input.hasNextLine()) {
         String complete = input.nextLine();
         if (complete.contains("(Read)")) {
            //completeList.add(complete);
            read++;
         }
         if (complete.contains("(Have)")) {
            have++;
            //haveList.add(complete);
         }  
      }
      //System.out.println(completeList);
      //System.out.println(haveList);
      System.out.println("Things Read = " + read);
      System.out.println("Things Have = " + have);
   }
   
   public static void random(Scanner input2) { 
      List<String> list = new ArrayList<String>();
      while (input2.hasNextLine()) {
         String notDone = input2.nextLine();
         //if (!notDone.contains("(Read)") & notDone.contains("(Have)")) {
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
      System.out.println("Things Unread = " + list.size());
      System.out.println(choose);
   }
}