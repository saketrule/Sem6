public class Client {
    Manager myman;
    public void assignManager(Manager manager){
        myman = manager;
    }
    public void request(){
        // Requests conveyed to manager
        myman.addRequest(new ChangeOilCommand());
        myman.addRequest(new CheckElectricalsCommand());
    }
}
