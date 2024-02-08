
public class Motor {
	private int tork;
	private int beygirGucu;
	
	public Motor(int tork , int beygirGucu)
	{
		this.tork = tork;
		this.beygirGucu = beygirGucu;
	}
	public void setTork(int tork)
	{
		this.tork = tork;
	}
	public int getTork()
	{
		return tork;
	}
	public void setBeygirGucu(int beygirGucu)
	{
		this.beygirGucu = beygirGucu;
	}
	public int getBeygirGucu()
	{
		return beygirGucu;
	}
	
	public void motorCalistir()
	{
		System.out.println("Motor Calisti");
	}
	public void motorKapat()
	{
		System.out.println("Motor Durdu");
	}
}
