package visitor;

import java.util.ArrayList;

public class Bike implements Visitable {
    ArrayList<Visitable> bikeParts = new ArrayList<Visitable>(0);;
    @Override
    public void accept(Visitor visitor) {
        for(Visitable part: bikeParts){
            part.accept(visitor);
        }
    }

    public void addBikePart(Visitable visitor){
        bikeParts.add(visitor);
    }

}