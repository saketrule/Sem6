package visitor;

public class PartsOperator implements Visitor{

    @Override
    public void visit(FuelTank fuelTank) {
        System.out.println( "Parts Operator: Operating on fuel tank\n");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println( "Parts Operator: Fixing the Engine\n");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("Parts Operator: Fixing the Bike\n");

    }
}
