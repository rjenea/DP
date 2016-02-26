package displaytext;
class DisplayText {
    private DisplayState displayState;
    
    DisplayText() {
        setState(new LowerCaseState());
    }
 
    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     * @param newDisplayState the new state of this context
     */
    void setState(final DisplayState newDisplayState) {
    	displayState = newDisplayState;
    }
 
    public void display(final String name) {
    	displayState.display(this, name);
    }
}