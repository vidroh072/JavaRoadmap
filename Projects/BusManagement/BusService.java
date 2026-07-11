package Projects.BusManagement;

import java.util.ArrayList;

/* Business logic
    - Add bus  - View bus  - Update bus  - Delete bus  -Search bus
 */
public class BusService {
    private ArrayList<Bus> buses = new ArrayList<>();

    public void addBus(Bus bus){
        if (searchBus(bus.getBusNumber()) != null){  // code reusability
            System.out.println("Bus Already Exists ❌");
            return;
        }
            buses.add(bus);
            System.out.println("Bus Added Successfully! ✅");
    }
    public void viewAllBuses(){
        if(buses.isEmpty()){
            System.out.println("No buses Available ❗");
            return;
        }
        for(Bus bus :buses){
            System.out.println(bus);
        }
    }
    public Bus searchBus(String busNumber){
        for (Bus bus : buses){
            if (bus.getBusNumber().equalsIgnoreCase(busNumber)){
                return bus;
            }
        }
            return null;

    }
    public boolean updateDriver(String busNumber,String newDriver){
        Bus bus = searchBus(busNumber); // code reusability
        if (bus != null) {
            bus.setDriverName(newDriver);
            return true;
        }
        return false;
    }
    public boolean deleteBus(String busNumber){
        Bus bus = searchBus(busNumber); // code reusability
        if (bus != null){
            buses.remove(bus);
            return true;
        }
        return false;
    }
    // that's the structure of real CRUD application;
    // CRUD -> create, read, update, delete
}
