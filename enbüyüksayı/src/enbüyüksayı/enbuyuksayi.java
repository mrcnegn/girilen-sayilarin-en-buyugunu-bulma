package enb�y�ksay�;
import java.util.Scanner;
public class enbuyuksayi {

	public static void main(String[] args) {
		
		    Scanner input = new Scanner(System.in);
		    int a, b, c;

		    System.out.println("A say�s�n� giriniz : ");
		    a = input.nextInt();

		    System.out.println("B say�s�n� giriniz : ");
		    b = input.nextInt();

		    System.out.println("C say�s�n� giriniz : ");
		    c = input.nextInt();

		    if (a > b && a > c && b>c) {

		      System.out.println("a>b>c");
		      
		    } else if (b > a && b > c && a>c) {

		      System.out.println("b>a>c");
		    }
		    else if (c> b && b > a ) {

			      System.out.println("c>b>a");
			      }
			else

		    {
		      System.out.println("c>a>b");
		    }
		  }
		}
	


