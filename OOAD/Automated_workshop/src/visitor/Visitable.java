package visitor;

public interface Visitable {
    public abstract void accept(Visitor visitor);
}