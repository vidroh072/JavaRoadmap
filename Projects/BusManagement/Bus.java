package Projects.BusManagement;
// Data
public class Bus {
    private String busNumber;
    private String driverName;
    private String route;
    private int totalSeats;

    Bus(String busNumber, String driverName, String route, int totalSeats){
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.route = route;
        this.totalSeats = totalSeats;
    }
    // Getters
    public String getBusNumber() {
        return busNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getRoute() {
        return route;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
    // Setters
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setTotalSeats(int totalSeats) {
        if(totalSeats>0) {
            this.totalSeats = totalSeats;
        }
    }

    public void setRoute(String route) {
        this.route = route;
    }
    @Override
    public String toString(){
        return "Bus No: "+busNumber+", Driver: "+driverName+", Route: "+route+", Seats: "+totalSeats;
    }
}
