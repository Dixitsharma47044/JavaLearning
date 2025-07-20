public static void main(String[] args) {
    String a = "hello world";
    for (int i = 0; i < a.length(); i++)
     {
        if (i % 2 != 0) 
        {
            System.out.println(a.charAt(i));
        }
    }
    System.out.println(a.length());
}