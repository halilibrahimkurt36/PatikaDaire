import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final float pi=3.14f;//pi sayısını daha sonra değiştirilemeyecek şekilde tanımlıyoruz
		float r,angle,area;//angle=açı  area=alan
		
		try (Scanner giris = new Scanner(System.in)) {
			System.out.print("Lütfen Dairenin yarıçap uzunuluğunu giriniz : ");
			r=(float) giris.nextDouble();
			
			System.out.print("Lütfen Dairenin merkez açısını giriniz : ");
			angle=(float) giris.nextDouble();
			
			area=(float) ((pi*(Math.pow(r, 2)*angle))/360);
			
			System.out.print("Yarıçapını girdiğiniz dairenin Alanı "+area);
		}
		
		
		

	}

}
