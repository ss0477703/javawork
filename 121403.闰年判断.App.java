package pac;

import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int i;
		        while(true){
		            System.out.println("请输入一个年份：");
		            Scanner scanner = new Scanner(System.in);
		            i = scanner.nextInt();
		            if(i<-3200 || i >3200){
		                System.out.println("请输入正确的年份！");
		                System.out.println();
		            }
		            else if(i>0 && i%4==0&&i%100!=0||i%400==0 ){
		                System.out.println("公元后"+i+"年是闰年");
		                System.out.println();
		            }
		            else if(i%4==-1 || i%400==1){
		                System.out.println("公元前"+i+"年是闰年");
		              
		            }else{
		                System.out.println(i+"年不是闰年");
		                System.out.println();
		            }
		        }

		    }
		}
	


