import java.util.Scanner;
class input_movie_plan
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String choice;
    String showTime;
    String movie;
    System.out.print("Do you wanna join us for a movie? (Yes/No)");
    choice = sc.nextLine();
    if (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("yes"))
      {
         System.out.print("\nEnter the show timing (Morning / Noon / Evening / Night):");
         showTime = sc.nextLine();
         System.out.print("\nEnter the movie name (Padaiyappa / Gilli / Singam /  Dhurandhar):");
         movie = sc.nextLine();
         if (
             ( showTime.equalsIgnoreCase("Morning") ||
               showTime.equalsIgnoreCase("Noon") || 
               showTime.equalsIgnoreCase("Evening") ||
               showTime.equalsIgnoreCase("Night")) &&
              ( movie.equalsIgnoreCase("Padaiyappa") || 
              movie.equalsIgnoreCase("Gilli") ||
              movie.equalsIgnoreCase("Singam") ||
              movie.equalsIgnoreCase("Dhurandhar"))
            )
           {
             System.out.print("\nWe are going to " + movie + ". I'll book the tickets for the " + showTime + " show");
           }
          else 
           {
             System.out.print("\nInvalid show timing or movie name.");
           }
      }
    else
       {
         System.out.print("\nThat's ok let's plan for an other day");
       }
  }
}

