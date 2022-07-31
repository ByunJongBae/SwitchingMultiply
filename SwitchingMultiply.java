import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class SwitchingMultiply
{
    public static void main(String[] args)
    {
        Scanner ScInputNum =new Scanner(System.in);
        System.out.println("구구단 콘솔 출력");
        int num_0;
        num_0=ScInputNum.nextInt();

        if(num_0<10)
        {
            switch (((char) num_0))
            {
                // 1차원 배열+switch ~ case + if 문을 이용한 구구단(2단)
                case 2:
                    System.out.println("2단 입니다");
                    int i_2dan=2;
                    int [] twoDan_2={0,1,2,3,4,5,6,7,8,9};
                    int result;
                    for (int j=1; j< twoDan_2.length; j++)
                    {
                        result=i_2dan*twoDan_2[j];
                        System.out.println(i_2dan+" * "+twoDan_2[j]+" = "+result);
                    }
                    break;

                case 3:
                    System.out.println("3단 입니다");
                    int i_3dan=3;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_3dan+" * "+j+" = "+i_3dan*j);
                    }
                    break;
                case 4:
                    System.out.println("4단 입니다");
                    int i_4dan=4;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_4dan+" * "+j+" = "+i_4dan*j);
                    }
                    break;
                case 5:
                    System.out.println("5단 입니다");
                    int i_5dan=5;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_5dan+" * "+j+" = "+i_5dan*j);
                    }
                    break;
                case 6:
                    System.out.println("6단 입니다");
                    int i_6dan=6;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_6dan+" * "+j+" = "+i_6dan*j);
                    }
                    break;
                case 7:
                    System.out.println("7단 입니다");
                    int i_7dan=7;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_7dan+" * "+j+" = "+i_7dan*j);
                    }
                    break;
                case 8:
                    System.out.println("8단 입니다");
                    int i_8dan=8;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_8dan+" * "+j+" = "+i_8dan*j);
                    }
                    break;
                case  9:
                    System.out.println("9단 입니다");
                    int i_9dan=9;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_9dan+" * "+j+" = "+i_9dan*j);
                    }
                    break;
            }
        }
        else
        {
            System.out.println("삐빅 범위밖입니다~");
        }

    }
}

    /*
    *
    * char grade ='E';
       switch (grade)
       {
           case 'A':
               System.out.println("니점수:A");
               break;
           case 'B':
               System.out.println("니점수:B");
               break;
           case 'C':
               System.out.println("니점수:C");
               break;
           case 'D':
               System.out.println("니점수:D");
               break;
           case 'E':
               System.out.println("니점수:E");
               break;
           case 'F':
               System.out.println("니점수:F");
               break;
           case 'G':
               System.out.println("니점수:G");
               break;
       }
    *
    *====================================================================
    *
    *  Scanner inputNum=new Scanner(System.in);
        int num;
        System.out.println("INPUT YOUR AGE");
        num=inputNum.nextInt();

        if (num<=5)
        {
            switch (num)
            {
                case 0:
                    System.out.println("0살입니다~");
                    break;
                case 1:
                    System.out.println("1살입니다~");
                    break;
                case 2:
                    System.out.println("2살입니다~");
                    break;
                case 3:
                    System.out.println("3살입니다~");
                    break;
                case 4:
                    System.out.println("4살입니다~");
                    break;
                case 5:
                    System.out.println("5살입니다~");
                    break;
            }
        }
        else
        {
            System.out.println("범위를 벗어남");
        }
    }
    *
    *
    * int num_0 = 10;
        //int num_1 = 8;
        num_0++;
        //++num_1;
        System.out.println("0번째 후치"+(num_0));
        //System.out.println("1번쨰 전치"+(num_1--));
    *
    * ===========================================================
    *
    *  int num_0=9;
        int num_1=10;
        int result=(num_0>num_1)?num_0:num_1;
        System.out.println(result); -> 3항연산자
        * 
        * 
        * ===========================================================
        *  반복문
        * 
        * int num_0=0;
        while (num_0<10)
        {
            ++num_0;
            System.out.println(num_0);
        }
        *
        for (int i=1; i<10; i++)
        {
            System.out.println("========"+i+"단=======");
          for (int j = 1; j < 10; j++)
          {
              System.out.println(i+" * "+j+" = "+i*j);
          }
        }
        * ============================================================
        *
        *
        *  Scanner ScInputNum =new Scanner(System.in);
        System.out.println("구구단 콘솔 출력");
        System.out.println("case 0 :2단, case 1:3단, case 2:4단, case 3:5단, case 4:6단, case 5:7단, case 6:8단, case 7:9단");
        int num_0;
        num_0=ScInputNum.nextInt();

        if(num_0<10)
        {

            switch (num_0)
            {
                case 0:
                    System.out.println("2단 입니다");
                        int i_2dan=2;
                        for (int j=1; j<10; j++)
                        {
                            System.out.println(i_2dan+" * "+j+" = "+i_2dan*j);
                        }
                    break;

                case 1:
                    System.out.println("3단 입니다");
                    int i_3dan=3;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_3dan+" * "+j+" = "+i_3dan*j);
                    }
                    break;
                case 2:
                    System.out.println("4단 입니다");
                    int i_4dan=4;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_4dan+" * "+j+" = "+i_4dan*j);
                    }
                    break;
                case 3:
                    System.out.println("5단 입니다");
                    int i_5dan=5;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_5dan+" * "+j+" = "+i_5dan*j);
                    }
                    break;
                case 4:
                    System.out.println("6단 입니다");
                    int i_6dan=6;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_6dan+" * "+j+" = "+i_6dan*j);
                    }
                    break;
                case 5:
                    System.out.println("7단 입니다");
                    int i_7dan=7;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_7dan+" * "+j+" = "+i_7dan*j);
                    }
                    break;
                case 6:
                    System.out.println("8단 입니다");
                    int i_8dan=8;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_8dan+" * "+j+" = "+i_8dan*j);
                    }
                    break;
                case  7:
                    System.out.println("9단 입니다");
                    int i_9dan=9;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_9dan+" * "+j+" = "+i_9dan*j);
                    }
                    break;
            }
        }

*               =============구구단 콘솔출력(배열없는)==========================
*
*       Scanner ScInputNum =new Scanner(System.in);
        System.out.println("구구단 콘솔 출력");
        int num_0;
        num_0=ScInputNum.nextInt();

        if(num_0<10)
        {
            switch (((char) num_0))
            {
                case 2:
                    System.out.println("2단 입니다");
                        int i_2dan=2;
                        for (int j=1; j<10; j++)
                        {
                            System.out.println(i_2dan+" * "+j+" = "+i_2dan*j);
                        }
                    break;

                case 3:
                    System.out.println("3단 입니다");
                    int i_3dan=3;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_3dan+" * "+j+" = "+i_3dan*j);
                    }
                    break;
                case 4:
                    System.out.println("4단 입니다");
                    int i_4dan=4;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_4dan+" * "+j+" = "+i_4dan*j);
                    }
                    break;
                case 5:
                    System.out.println("5단 입니다");
                    int i_5dan=5;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_5dan+" * "+j+" = "+i_5dan*j);
                    }
                    break;
                case 6:
                    System.out.println("6단 입니다");
                    int i_6dan=6;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_6dan+" * "+j+" = "+i_6dan*j);
                    }
                    break;
                case 7:
                    System.out.println("7단 입니다");
                    int i_7dan=7;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_7dan+" * "+j+" = "+i_7dan*j);
                    }
                    break;
                case 8:
                    System.out.println("8단 입니다");
                    int i_8dan=8;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_8dan+" * "+j+" = "+i_8dan*j);
                    }
                    break;
                case  9:
                    System.out.println("9단 입니다");
                    int i_9dan=9;
                    for (int j=1; j<10; j++)
                    {
                        System.out.println(i_9dan+" * "+j+" = "+i_9dan*j);
                    }
                    break;
            }
        }
        else
        {
            System.out.println("삐빅 범위밖입니다~");
        }


    }
    * */