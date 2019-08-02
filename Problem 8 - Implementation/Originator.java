public class Originator {
    private float state;

    public void setState(float state){
        this.state = state;
    }

    public float getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
