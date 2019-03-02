import java.util.*;
import java.io.*;

public class MyRecordsCollection1 {

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
      int weeaboo = 0;
      int bookNerd = 0;
      while (input.hasNextLine()) {
         String gay = input.nextLine();
         if (gay.contains("(Watched)")) {
            weeaboo++;
         } else if (gay.contains("(Read)")) {
            bookNerd++;
         }
      }
      System.out.println("Things watched = " + weeaboo);
      System.out.println("Things read = " + bookNerd);
   }
   
   public static void random(Scanner input2) { 
      List<String> motherFucker = new ArrayList<String>();
      while (input2.hasNextLine()) {
         String analDestroyer = input2.nextLine();
         if (!analDestroyer.contains("(Watched)") && !analDestroyer.contains("(Read)")) {
            motherFucker.add(analDestroyer);   
         } else {
            motherFucker.remove(analDestroyer);
         }
      } 
      Random killMe = new Random();
      String fuckMyLife = "";
      for (int i = 0; i < motherFucker.size(); i++) {
         int myLifeIsMeaningless = killMe.nextInt(motherFucker.size());
         fuckMyLife = motherFucker.get(myLifeIsMeaningless);
      }
      System.out.println(fuckMyLife);
   }
}