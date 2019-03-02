import java.util.*;
import java.io.*;

public class MyRecordsCollection2 {

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
      List<String> fuckMeHarder = new ArrayList<String>();
      while (input2.hasNextLine()) {
         String analDestroyer = input2.nextLine();
         if (!analDestroyer.contains("(Read)") && analDestroyer.contains("(Have)")) {
            fuckMeHarder.add(analDestroyer);   
         } else if (!analDestroyer.contains("(Watched)"))  {
            motherFucker.add(analDestroyer);
         } else {
            fuckMeHarder.remove(analDestroyer);
            motherFucker.remove(analDestroyer);
         }
      } 
      Random killMe = new Random();
      String fuckMyLife = "";
      if (!motherFucker.isEmpty()) {
         for (int i = 0; i < motherFucker.size(); i++) {
            int myLifeIsMeaningless = killMe.nextInt(motherFucker.size());
            fuckMyLife = motherFucker.get(myLifeIsMeaningless);
         }
         System.out.println(fuckMyLife);
      } else {
         for (int i = 0; i < fuckMeHarder.size(); i++) {
            int myLifeIsMeaningless = killMe.nextInt(fuckMeHarder.size());
            fuckMyLife = motherFucker.get(myLifeIsMeaningless);
         }
         System.out.println(fuckMyLife);
      }
   }
}