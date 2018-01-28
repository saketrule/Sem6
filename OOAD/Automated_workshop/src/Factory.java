
// This is the main Factory class. Contains main
public class Factory {
    static public Manager myMan;
    static public Mechanic myMech;
    static public Client myCli;
    public static void main(String[] args){
        // Create new Manager and mechanic
        myMan = new Manager();
        myMech = new Mechanic();

        // Assign mechanic to manager
        myMan.mechanic = myMech;

        // Create new client
        myCli = new Client();
        // Assign manager to client
        myCli.assignManager(myMan);
        // Client requests
        myCli.request();
    }

}
