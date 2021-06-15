
public class Tasks implements Runnable{
	private String thName;
	public Tasks(String name)
	{
		this.thName = name;
	}
	public String getThName()
	{
		return thName;
	}

	@Override
	public void run() {
		try{
		System.out.println("Running:"+thName);
		}catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

}
