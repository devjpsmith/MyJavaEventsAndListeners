
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initiate Tekbot sequence");
		
		// create a new Tekbot and a new state listener
		TekbotObject myTekbot = new TekbotObject("Main");
		ConsoleStateListener listener = new ConsoleStateListener();
		myTekbot.addStateListener(listener);
		
		// manipulate the Tekbot and watch the results
		System.out.println("advancing the Tekbot");
		myTekbot.advanceMode();
		
		System.out.println("regressing the Tekbot");
		myTekbot.regressMode();
		
		System.out.println("advancing the Tekbot");
		myTekbot.advanceMode();
		System.out.println("advancing the Tekbot");
		myTekbot.advanceMode();
		System.out.println("advancing the Tekbot");
		myTekbot.advanceMode();

		System.out.println("regressing the Tekbot");
		myTekbot.regressMode();
		System.out.println("regressing the Tekbot");
		myTekbot.regressMode();
		System.out.println("regressing the Tekbot");
		myTekbot.regressMode();
	}

}
