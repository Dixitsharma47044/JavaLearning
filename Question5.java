import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int marks[] = { 80, 85, 52, 65, 95, 92, 90, 75, 78, 99, 9 };
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int sum = 0;
        int count = 0;
                for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 90) {
                count1++;
            }

            else if (marks[i] >= 75) {
                count2++;

            } else if (marks[i] >= 60) {
                count3++;
            }
        }
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("A grade = " + count1 + " || B grade: " + count2 + " || C grade: " + count3);
        // System.out.println("B grade = "+count2);
        // System.out.println("c grade = "+count3);

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double avg = (double) sum / marks.length;
        System.out.println("Average =" + avg);

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > avg) {
                 count++;
            }
        }
           int aboveAvg[] = new int[count];
        int index = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > avg) {
                aboveAvg[index] = marks[i];
                index++;
            }
             
        }System.out.println("Above average = " + Arrays.toString(aboveAvg));
    }

}
