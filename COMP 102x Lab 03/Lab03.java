import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage image = new ColorImage();
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        ColorImage imageA = new ColorImage();
        ColorImage imageB = new ColorImage();
        Canvas canvas = new Canvas(imageA.getWidth() + imageB.getWidth(), imageA.getHeight());
        canvas.add(imageA);
        canvas.add(imageB, imageA.getWidth(), 0);
        
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage imageA = new ColorImage();
        ColorImage imageB = new ColorImage();
        ColorImage imageC = new ColorImage(imageA.getWidth(), imageA.getHeight());
        imageC = imageC.add(imageA, imageB);
        Canvas canvas = new Canvas(imageA.getWidth() + imageB.getWidth() + imageC.getWidth() + 20, imageA.getHeight());
        canvas.add(imageA);
        canvas.add(imageB, imageA.getWidth() + 10, 0);
        canvas.add(imageC, imageA.getWidth() + 10 + imageB.getWidth() + 10, 0);
        
        
        
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        ColorImage imageA = new ColorImage();
        ColorImage imageB = new ColorImage();
        ColorImage imageC = new ColorImage(imageA.getWidth(), imageA.getHeight());
        imageC = imageC.multiply(imageA, imageB);
        Canvas canvas = new Canvas(imageA.getWidth() + imageB.getWidth() + imageC.getWidth() + 20, imageA.getHeight());
        canvas.add(imageA);
        canvas.add(imageB, imageA.getWidth() + 10, 0);
        canvas.add(imageC, imageA.getWidth() + 10 + imageB.getWidth() + 10, 0);
        
        
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
