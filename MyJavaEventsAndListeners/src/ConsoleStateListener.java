
public class ConsoleStateListener implements StateListener {

	@Override
	public void receiveState(int state) {
		// create a message from the Tekbot
		// the message contents will depend on what state our Tekbot is in
		String msg = "";
		
		switch(state){
			case TekbotObject.MODE_BASIC: msg = "TEKBOT AT MINIMUM POWER - ALL SYSTEMS WAITING..."; break;
			case TekbotObject.MODE_ADVANCED: msg = "TEKBOT DEPLOYED - ALL SYSTEMS READY..."; break;
			case TekbotObject.MODE_ULTIMATE: msg = "TEKBOT AT MAXIMUM POWER - ALL SYSTEMS RUNNING..."; break;
			default: break; // do nothing
		}
		
		// send the message to the console output window
		System.out.println(String.format("Tekbot: \"%s\"", msg));
	}

}
