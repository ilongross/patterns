package jav.decorator_pattern.training;

public class ConcreteObject extends Component{

    private long id = getId();

    @Override
    public void setTitle() {
        this.title = "Concrete Object";
    }

    @Override
    public String toString() {
        return "[" + id + "]" + " Kernel";
    }
}
