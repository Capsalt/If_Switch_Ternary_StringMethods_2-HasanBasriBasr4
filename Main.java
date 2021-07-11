import java.util.Scanner;
class Main {
  public static void main(String[] args) {

 	Scanner scan = new Scanner(System.in);

		//System.out.println("Lütfen adınızı giriniz");

		String ad = scan.nextLine().toUpperCase();

		//System.out.println("Lütfen soyadınızı giriniz");

		String soyAd = scan.nextLine().toUpperCase();

		//System.out.println("Lütfen Kredi kartı numaranızı giriniz");

		String kkNo = scan.nextLine();

		System.out.println("Name :" + ad.substring(0, 1) + ad.substring(1).replaceAll("\\w", "*") + " "
				+ soyAd.substring(0, 1) + soyAd.substring(1).replaceAll("\\w", "*") + "\nCCN  :" + "**** **** **** "
				+ kkNo.substring(12));

		scan.close();


  }
  
}