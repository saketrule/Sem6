public class CheckElectricalsCommand implements Command{
    @Override
    public void execute(Mechanic mechanic){
        System.out.println("Executing CheckElectricals!\n");
        mechanic.checkElectricals();
    }
}
