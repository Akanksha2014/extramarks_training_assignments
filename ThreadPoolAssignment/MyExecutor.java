
public class MyExecutor{

	public static ThreadPoolExecutorService methodThreadPool(int n) {
		// TODO Auto-generated method stub
		ThreadPoolExecutorService tpes = new MyThreadPool(n);
		return tpes;
	}
}
