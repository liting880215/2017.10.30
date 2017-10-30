public class c {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("請輸入成績");
        int a = sc.nextInt();

        if((a>100)||(a<0))
        {
            System.out.println("輸入錯誤");
        }
        else
        {
            if(a>=80)
            {
                System.out.println("a");
            }
            else
            {
                if(a>70)
                {
                    System.out.println("b");
                }
                else
                {
                    if(a>60)
                    System.out.println("c");
                    else
                    {
                        System.out.println("f");
                    }
                }
            }


        }
    }
}
