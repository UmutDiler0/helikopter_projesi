
public class Helikopter {
	
	private int kuyrukNumarasi;
	private Motor motor;
	private Pervane pervane;
	private Depo depo;
	
	public Helikopter(int kuyrukNumarasi,Motor motor,Pervane pervane,Depo depo)
	{
		this.kuyrukNumarasi = kuyrukNumarasi;
		this.motor = motor;
		this.pervane = pervane;
		this.depo = depo;
		
	}
	public void setKuyrukNumarasi(int kuyrukNumarasi)
	{
		this.kuyrukNumarasi = kuyrukNumarasi;
		
	}
	public int getKuyrukNumarasi()
	{
		return kuyrukNumarasi;
		
	}
	public void setMotor(Motor motor)
	{
		this.motor = motor;
	}
	public Motor getMotor()
	{
		return motor;
	}
	public void setPervane(Pervane pervane)
	{
		this.pervane = pervane;
	}
	public Pervane getPervane()
	{
		return pervane;
	}
	public void setDepo(Depo depo)
	{
		this.depo = depo;
	}
	public Depo getDepo()
	{
		return depo;
	}

}
