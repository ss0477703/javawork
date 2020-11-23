package pac;

public class App {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int arr[][]={
				{5,6},
				{200,300},
				{45,12},
				{55,120},
		};
		while (true) {
			Thread.sleep(1000);
			int rdm=(int)(Math.random()*10%4);
			System.out.println("一秒已经过去啦：R("+arr[rdm][0]+","+arr[rdm][1]+")");
		}
	}

}
