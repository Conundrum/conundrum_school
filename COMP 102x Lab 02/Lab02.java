import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        int x;
        int y;
        int total;
        
        IO.output("Enter an integer, x: ");
        x = IO.inputInteger( );
        IO.output("Enter an integer, y: ");
        y = IO.inputInteger( );
        IO.output("Answer = " + x * y);
        
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        
        double width;
        double height;
        
        IO.output("Enter the width of the triangle: ");
        width = IO.inputDouble( );
        IO.output("Enter the height of the triangle: ");
        height = IO.inputDouble( );
        IO.outputln("The triangle area = " + ((width * height) / 2));
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        int a;
        int b;
        int c;
        double first;
        double second;
        
        IO.output("Enter a: ");
        a = IO.inputInteger( );
        IO.output("Enter b: ");
        b = IO.inputInteger( );
        IO.output("Enter c: ");
        c = IO.inputInteger( );
        
        first = ((-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
        second = ((-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
        
        IO.outputln("First solution for x = " + first);
        IO.outputln("Second solution for x = " + second);
        
       
        
        
        
    }
}
