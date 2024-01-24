package Workshops.week02.RectangleComputation;
import java.util.Scanner;
public class RectangleComputation {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input a rectangle width:");
            float rectangleWidth = input.nextFloat();
            System.out.println("Input a rectangle length:");
            float rectangleLength = input.nextFloat();
            float rectangleArea = rectangleLength * rectangleWidth;
            float rectanglePerimeter = (2*rectangleLength) + (2*rectangleWidth);
            System.out.println("Rectangle Area is: " + rectangleArea);
            System.out.println("Rectangle Perimeter is: " + rectanglePerimeter);
            float ratio = rectangleWidth/rectangleLength;
            System.out.println("The ratio of Width to Length is: " + ratio);
            if(Math.abs(rectangleLength - rectangleWidth) < 0.0000001){
                boolean isSquare = true;
                System.out.println("The rectangle is a square");
            }
            else{
                boolean isSquare = false;
                System.out.println("The rectangle is not a square");
            }
            }

        }
    }

