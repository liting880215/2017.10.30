public class l {
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);

        System.out.println("請輸入成績");
        int a=sc.nextInt();

        if(a>=60){
            System.out.println("成績及格:"+ a);
        }
        else{
            System.out.println("成績不及格:"+ a);
        }
        System.out.println("End");
    }
}
