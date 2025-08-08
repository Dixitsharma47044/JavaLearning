public class test {
    public static void main (String[]args){
        int a []= {5,6,2,4,3,1};
        for(int i = 0; i <a.length; i++){
            for(int j = 0; j < a.length-i-1;j++){
                if(a[j] > a[j+1]){
                    int tem = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tem;
                }
            }

        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    
}
