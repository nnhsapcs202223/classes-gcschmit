import java.util.Scanner;

public class RectangleCalculator
{
    private double height;
    private double width;
    
    public RectangleCalculator(double initialHeight, double initialWidth)
    {
        this.height = initialHeight;
        this.width = initialWidth;
    }
    
    public double getArea()
    {
        return this.height * this.width;
    }
    
    public double getPerimeter()
    {
        return 2 * (this.height + this.width);
    }
    
    public double getDiagonalLength()
    {
        return Math.sqrt((this.height * this.height) + (this.width * this.width));
    }
    
    public String toString()
    {
        return "[height: " + this.height +
                "; width: " + this.width + 
                "; area: " + this.getArea() + 
                "; perimeter: " + this.getPerimeter() +
                "; diagonal: " + this.getDiagonalLength() +
                "]";
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the rectangle's height: ");
        double height = in.nextDouble();
        
        System.out.print("Enter the rectangle's width: ");
        double width = in.nextDouble();
        
        RectangleCalculator rect = new RectangleCalculator(height, width);
        System.out.println(rect);
    }
    
}
