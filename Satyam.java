public class Satyam {

    // Constructor - Called when we instantiate a class
    Satyam()
    {
        inStr = "Dixit";
        System.out.println("Construct");
    }

    public String inStr = "Cool";
    public String inStr2 = "No Change";

    public int Sum(int a , int b)
    {
        return a + b;
    }

    public float Multiply(float a, float b)
    {
        return a * b;
    }
}

public void main(String args[]) {

    int[][] a = 
    {
        {2,4},
        {5,6}
    };
    a[0][1] = 11;
    System.out.println(a[0][1]);

    int[][] matrix = 
    {
        {1,6,7,8},
        {22,1,0,9},
        {33,44,1,67},
        {11,34,66,1}
    };

    int[] mm = 
    {
        1,6,7,8,
        22,1,0,9,
        33,44,1,67,
        11,34,66,1
    };

    System.out.println(matrix[0][0]);
    System.out.println(matrix[3][0]);
    System.out.println(matrix[0][3]);
    System.out.println(matrix[1][2]);
    System.out.println(matrix[2][2]);


    // Satyam sat = new Satyam(); // This calls the constructor
    // System.out.println(sat.inStr + " " + sat.inStr2);

    // Satyam sat2 = new Satyam();// This calls the constructor
    // sat2.inStr2 = "Vah Vah";
    // System.out.println(sat.inStr2 + " " + sat2.inStr2);
    // System.out.println(sat2.Sum(4, 3) + "  " + sat2.Multiply(4,20));


    // if (5 > 4) {
    //     System.out.println("null");
    // }
}




