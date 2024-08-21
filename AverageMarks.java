public class AverageMarks {
    public static void main(String[] args) {
        int marks[]={85,34,45,99,79};
        int total=0;
        for(int mark:marks){
            total=total+mark;
        }
        double average =total/marks.length;
        System.out.println("the average marks are:"+average);
    }
}
