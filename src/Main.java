import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
      try {
          Days days=
                  Days.valueOf(word.toUpperCase());
          switch (days) {
              case MONDAY:
                  System.out.println("technikalik sabak");
                  break;
              case TUESDAY:
                  System.out.println("technikalik anglistili");
                  break;
              case WEDNESDAY:
                  System.out.println("technikaik sabak");
                  break;
              case THURSDAY:
                  System.out.println("technikali sabak");
                  break;
              case FRIDAY:
                  System.out.println("technikalik saba");
                  break;
              case SATURDAY:
                  System.out.println("technikalik sabag");
                  break;
              case SUNDAY:
                  System.out.println("sabak jok");
          }
      }catch (IllegalArgumentException e) {
          System.out.println("Myndai kun jok.");
      }

    }
}