import java.util.*;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of threads you want in thread pool");
		int n = sc.nextInt();
		ThreadPoolExecutorService service = MyExecutor.methodThreadPool(n);
		int i=5;
		while(i>0)
		{
			Tasks task = new Tasks("Task "+i);
			System.out.println("Task created: "+task.getThName());
			service.myExecute(task);
			i--;
		}
		

	}

}
