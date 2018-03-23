package sizeyunsuan;

import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class yunsuan {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int x, y, i, a1;
		int d1 = 0;
		String d = null;
		System.out.println("请输入题目的数量");
		 BufferedWriter BufferedWriterbw = new BufferedWriter(new FileWriter("result.txt"));
         BufferedWriterbw.write("201571030116\r\n");
		Scanner scan2 = new Scanner(System.in);
		x = scan2.nextInt();
		int daan[] = new int[x];
		y=100;
		
		for (i = 0; i < x; i++) {
			int a = (int) (Math.random() * y);// 随机生成一个1-10的整数
			int b = (int) (Math.random() * y);// 随机生成一个1-10的整数
			int e = (int) (Math.random() * y);// 随机生成一个1-10的整数
			int c = (int) (Math.random() * 4);// 随机生成一个1-4的整数，0表示加法，1表示减法，2表示乘法，3表示除法
			if (c == 0) {
				d1 = a + b+ e;
				System.out.print(a + "+" + b + "+" + e + "= \n"   );
				BufferedWriterbw.write( a + "+" + b + "+" + e + "=" +d1+"\r\n"   );
			}
			if (c == 1) {
				d1 = a -b +e;
				int f = a - b;
				if(f<0){
					i--;
				}
				else{
				System.out.print(a + "-" + b + "+" + e + "= \n" );
				BufferedWriterbw.write( a + "-" + b + "+" + e + "=" +d1+"\r\n"  );
				}
			}
			if (c == 2) {
				d1 = a * b + e;
				System.out.print(a + "*" + b + "+" + e + "= \n" );
				BufferedWriterbw.write(a + "*" + b + "+" + e + "=" +d1+"\r\n"  );
			}
			if (c == 3) {
				d1 = a / b * e;
				int f = a%b;
                if(f!=0){
                    i--;
                   }
                else{
				System.out.print(a + "/" + b + "*" + e + "= \n" );
				BufferedWriterbw.write(a + "/" + b + "*" + e + "=" +d1+"\r\n"  );
                }
			}
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}

		}
		 BufferedWriterbw.flush();
		
		}
	

	}
