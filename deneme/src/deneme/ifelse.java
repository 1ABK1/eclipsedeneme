package deneme;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {

        int b = 0;

        int[][] a = {

                {3,5,7},

                {6,5,3},

                {2,8,7}};

        

        for (int i = 0; i < a.length - 1; i++) {

            b += a[i+1][i];

            

        }

        System.out.println(b);


	}
}
