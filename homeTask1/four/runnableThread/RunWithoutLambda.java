package four.runnableThread;

public class RunWithoutLambda implements Runnable {

	public static void main(String[] args) {
		
		RunWithoutLambda rwl = new RunWithoutLambda();
		Thread th = new Thread(rwl);
		th.start();
		System.out.println("From Main");

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Running thread from child: " + i);
		}

	}

}
