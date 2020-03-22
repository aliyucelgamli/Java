import java.util.Random;
import java.util.Scanner;

public class SnW {
	
	static void oklar() throws InterruptedException {
		Thread.sleep(200);
		System.out.print("     -");
		Thread.sleep(200);
		System.out.print("-");
		Thread.sleep(200);
		System.out.print("-");
		Thread.sleep(200);
		System.out.print("-");
		Thread.sleep(200);
		System.out.print("-");
		Thread.sleep(200);
		System.out.print("-");
		Thread.sleep(200);
		System.out.print(">                  ");
		Thread.sleep(700);
	}
	
	
	public static void main(String args[]){
			
		System.out.println("Stop and Wait Simülasyonu");		
		//Random r = new Random();
			
		try {
			System.out.println("Bağlantı için bekleniyor....");
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		System.out.println("Göndermek istediğiniz veriyi giriniz:");
		Scanner scan = new Scanner(System.in);	
		String data = scan.nextLine();
		System.out.println("");
		System.out.println("Gönderici (Sender)   Verinin Yeri                          Alıcı (Receiver)");
		System.out.println("");
		
		int hata = 2;
		
		int i = 0;		
		int rand;
		do {
			  rand = (int)(Math.random() * 10); 

			
		}while(rand>=data.length() && rand > 0 && rand < 100);
		
	
		do {
			
				System.out.print(data.charAt(i));
				System.out.print("                        ( "+ i +" ) ");
				i++;
				
		try {
			oklar();
			//eğer hata yoksa veri yolla varsa, tekrardan yolla	
			if(i==rand) {
				System.out.println("Veri gelmedi");
				Thread.sleep(2000);	
				System.out.print("Gelmeyen veri tekrar yollanacak");				
				Thread.sleep(700);
				System.out.print(".");
				Thread.sleep(700);
				System.out.print(".");
				Thread.sleep(700);
				System.out.println(".");
				System.out.print(data.charAt(i-1));
				System.out.print("                        ( "+ (i-1) +" ) ");
				oklar();
				System.out.println(data.charAt(i-1));
				Thread.sleep(700);
				System.out.println("ACK için bekleniyor...");
				Thread.sleep(700);
				System.out.println("Veri alındı.");
				System.out.println("");
				System.out.println("");
				Thread.sleep(700);
				
			}else {
			System.out.println(data.charAt(i-1));
			Thread.sleep(700);
			System.out.println("ACK için bekleniyor...");
			Thread.sleep(700);
			System.out.println("Veri alındı.");
			System.out.println("");
			System.out.println("");
			Thread.sleep(700);
			}
				
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}while(i<data.length());	//veri uzunluğı kadar işlemi yap
		
	
		System.out.println("");
		System.out.println("Alınan veri:");
		System.out.println(data);
		System.out.println("");
		System.out.println("Hatalı verinin yeri:");
		System.out.println(hata);
		}
	
}
