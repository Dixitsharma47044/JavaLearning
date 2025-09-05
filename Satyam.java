static int dixit = 10;

public static int Recursion(int a, int depth)
{
    int newA = a + 1;
    int newA2 = 0;
    System.out.println("First Print: " + newA + " Depth: " + depth);

    depth --;
    if(depth >= 0)
    {
        // newA = 2
        // depth = 0
        newA2 = Recursion(newA, depth);

        // int _newA = newA + 1;
        // int _newA2 = 0;
        // depth -- ; // -1
        // if(depth >= 0){} // depth is already -1
        // newA2 = _newA;
    }

    System.out.println("Second Print: newA2: " + newA2 + " || A: " + newA);
    return newA;
}

public static void main(String args[]) {

    System.out.println(dixit);

    Recursion(1, 1);
}




