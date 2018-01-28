
public class ChangeOilCommand implements Command{
    @Override
    public void execute(Mechanic mechanic){
        System.out.println("Executing Change Oil Command!\n");
        mechanic.changeOil();
    }
}
