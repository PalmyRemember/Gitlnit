import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 String helloname = in.next();
		 Hello hello = new Hello();
		 hello.setHelloname(helloname);
		 System.out.println("Hell" +hello.getHelloname());

	}

}
