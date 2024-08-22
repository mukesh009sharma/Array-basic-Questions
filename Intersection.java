public class Intersection {
    public static void main(String[] args) {
        int a[]={7,8,6,4,2};
        int b[]={2,7,5,4,1};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                }
               
            }
        }
    }
}
