import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
      try {
          Enum enume=
                  Enum.valueOf(word.toUpperCase());
          switch (word) {
              case "MONDAY":
                  System.out.println("texnikalik sabak");
                  break;
              case "TUESDAY":
                  System.out.println("texnikalik anglistili");
                  break;
              case "WEDNESDAY":
                  System.out.println("texnikaik sabak");
                  break;
              case "THURSDAY":
                  System.out.println("texnikali sabak");
                  break;
              case "FRIDAY":
                  System.out.println("texnikalik saba");
                  break;
              case "SATURDAY":
                  System.out.println("texnikalik sabag");
                  break;
              case "SUNDAY":
                  System.out.println("sabak jok");
          }
      }catch (IllegalArgumentException e) {
          System.out.println("Myndai kun jok.");
      }

    }
}