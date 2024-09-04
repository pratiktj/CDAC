import java.util.Scanner;

class Assignment2e {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        String sArea = null;

        System.out.println("Enter a geometrical shape in small letters:");
        sArea = sobj.nextLine();

        switch (sArea) {
            case "circle":
                float fRadius = 0.0f;
                double fArea = 0.0d;
                System.out.println("Enter the radius of the circle:");
                fRadius = sobj.nextFloat();
                fArea = Math.PI * fRadius * fRadius;
                System.out.println("Area of the circle is: " + fArea);
                break;

            case "square":
                float fSide = 0.0f;
                System.out.println("Enter the side of the square:");
                fSide = sobj.nextFloat();
                fArea = fSide * fSide;
                System.out.println("Area of the square is: " + fArea);
                break;

            case "rectangle":
                float fLength = 0.0f;
                float fWidth = 0.0f;
                System.out.println("Enter the length of the rectangle:");
                fLength = sobj.nextFloat();
                System.out.println("Enter the width of the rectangle:");
                fWidth = sobj.nextFloat();
                fArea = fLength * fWidth;
                System.out.println("Area of the rectangle is: " + fArea);
                break;

            case "triangle":
                float fBase = 0.0f;
                float fHeight = 0.0f;
                System.out.println("Enter the base of the triangle:");
                fBase = sobj.nextFloat();
                System.out.println("Enter the height of the triangle:");
                fHeight = sobj.nextFloat();
                fArea = 0.5f * fBase * fHeight;
                System.out.println("Area of the triangle is: " + fArea);
                break;

            default:
                System.out.println("Please type a correct geometrical shape.");
                break;
        }
    }
}
