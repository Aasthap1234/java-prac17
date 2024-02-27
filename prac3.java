public class prac3 
 {
    public static Double calculateVolume(Double side) 
    {
        if (side <= 0) 
        {
            System.out.println("Error: Side must be positive.");
        }
        return side * side * side;
    }
    public static Double calculateVolume(Double radius, Double height) 
    {
        if (radius <= 0 || height <= 0) 
        {
            System.out.println("Error: Radius and height must be positive.");
        }
        return Math.PI * radius * radius * height;
    }
    public static Double calculateVolume(Double length, Double width, Double height) 
    {
        if (length <= 0 || width <= 0 || height <= 0) 
        {
            System.out.println("Error: Length, width, and height must be positive.");
        }
        return length * width * height;
    }

     public static void main(String[] args) 
     {
        Double cubeVolume = calculateVolume(5.0);
        System.out.println("Volume of cube with side 5.0: " + cubeVolume);
        Double cylinderVolume = calculateVolume(3.0, 7.0);
        System.out.println("Volume of cylinder with radius 3.0 and height 7.0: " + cylinderVolume);
        Double boxVolume = calculateVolume(2.0, 4.0, 6.0);
        System.out.println("Volume of box with length 2.0, width 4.0, and height 6.0: " + boxVolume);
    }
}