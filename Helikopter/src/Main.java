
public class Main {

	public static void main(String[] args) {
		
		Motor myMotor = new Motor(700,1000);
		Depo myDepo = new Depo(150);
		Pervane myPervane = new Pervane(4,750);
		Helikopter helikopter1 = new Helikopter(178,myMotor,myPervane,myDepo);
		helikopter1.getMotor().motorCalistir();
		helikopter1.getMotor().motorKapat();
		
		System.out.println("Helikopterin depo kapasitesi: " + myDepo.getHacim());
		System.out.println(myPervane.getUzunluk());
		
		
	}

}
