package pac;

public class App {
public static void main(String[] args) {
	long i=0;

	for (long j =1; j <=2147483647;) {
		
		i+=j;
		j+=2;
		
	}
	System.out.println("奇数和为："+i);
}	
}
