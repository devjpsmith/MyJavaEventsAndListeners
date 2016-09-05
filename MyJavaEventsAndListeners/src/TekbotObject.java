import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;

/**
 * 
 * @author James
 *	a fun class for experimenting with events and listeners
 *	Tekbot will be able to cycle through 3 different modes, or 'states'
 *	Tekbot will notify any listeners of state-changes
 */
public class TekbotObject extends EventObject {

	private int _state = 0;
	private ArrayList<StateListener> _listeners = new ArrayList<StateListener>();
	
	public final static int MODE_BASIC = 0;
	public final static int MODE_ADVANCED = 1;
	public final static int MODE_ULTIMATE= 2;
	
	public TekbotObject(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public void regressMode(){
		if(_state > MODE_BASIC){
			_state--;
			// call listener
			invokeStateChange();
		}
	}
		
	public void advanceMode(){
		if(_state < MODE_ULTIMATE){
			_state++;
			// call listener
			invokeStateChange();
		}
	}
	
	public void addStateListener(StateListener l){
		if(!_listeners.contains(l))
			_listeners.add(l);
	}
	
	public void removeStateListener(StateListener l){
		if(_listeners.contains(l))
			_listeners.remove(l);
	}
	
	private void invokeStateChange(){
		for(Iterator<StateListener> i = _listeners.iterator(); i.hasNext();){
			i.next().receiveState(_state);
		}
	}
	

}
