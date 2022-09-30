import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class pyramid {
    public static void upleftsidepyramid() {
        int i, j, k, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void downleftsidepyramid() {
        int i, j, k, n = 5;
        for (i = 1; i <= n; i++) {
            for (j =1; j <i; j++) {
                System.out.print("  ");
            }
            for (k = i; k <=n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void  uprightsidepyramid(){
        int i,j,n=5;
        for( i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void downrighttsidepyramid() {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            for (j =i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void uptsidepyramid(){
        int i, j, k, n = 5;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print(' ');
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void upsidepyramid3()
    {
        for(int i=1;i<=4;i++)
        {
            for (int j=i;j<4;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int m=1;m<i;m++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}