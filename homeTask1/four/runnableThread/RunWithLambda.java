package four.runnableThread;

public class RunWithLambda {

	public static void main(String[] args) {
		Runnable run = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Running thread from child: " + i);
			}
		};
		Thread t = new Thread(run);
		t.start();
		System.out.println("From Main thread");

	}

}
