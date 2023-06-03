import java.util.Scanner;

public class Main2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter C for Circle\n Enter R for Rectangle\n Enter T for Triangle");

        String userInput = sc.nextLine();


        if(userInput.equals("R")){

            System.out.println("Enter the width of the Rectangle");
            int width = sc.nextInt();
            System.out.println("Enter the height of the Rectangle");
            int height = sc.nextInt();
            Rectangle r = new Rectangle(width,height);
            System.out.println("The area of Rectangle is: " + r.computeArea());

        }
        else if(userInput.equals("C")){
            System.out.println("Enter the radius of the circle");
            int radius = sc.nextInt();

            Circle c = new Circle(radius);
            System.out.println("The area of Circle is: " + c.computeArea());
        }
       else if(userInput.equals("T")){

            System.out.println("Enter the base of the Triangle");
            int base = sc.nextInt();
            System.out.println("Enter the height of the Triangle");
            int height = sc.nextInt();
            Triangle t = new Triangle(base,height);
            System.out.println("The area of Triangle is: " + t.computeArea());

        }
       sc.close();


    }
}
