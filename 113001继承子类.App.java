package pac;

public class App  extends R{

	public static void main(String[] args) {

		System.out.println(boy_filePanth);
		System.out.println(girl_filePanth);
	
		for (int row = 0; row < array2d.length; row++) {
			for (int cloumn = 0; cloumn < array2d[0].length; cloumn++) {
				System.out.print(array2d[row][cloumn]+" ");
				
			}
			System.out.println();
		}
	}

}
