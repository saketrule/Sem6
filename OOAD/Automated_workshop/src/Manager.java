public class Manager {
    Mechanic mechanic;
    public void addRequest(Command comm) {
        processRequests(comm);
    }

    protected void processRequests(Command comm){
        System.out.println("Called process Request by Manager\n");
        // Assigning request to mechanic
        comm.execute(mechanic);
    }
}
