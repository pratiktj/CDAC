package QuestionFourPointFive;

public class TollBoothRevenueManager {
   
	private double carRate;
    private double truckRate;
    private double motorcycleRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    public TollBoothRevenueManager(double carRate, double truckRate, double motorcycleRate) {
        this.carRate = carRate;
        this.truckRate = truckRate;
        this.motorcycleRate = motorcycleRate;
    }

    public double getCarRate() {
        return carRate;
    }

    public void setCarRate(double carRate) {
        this.carRate = carRate;
    }

    public double getTruckRate() {
        return truckRate;
    }

    public void setTruckRate(double truckRate) {
        this.truckRate = truckRate;
    }

    public double getMotorcycleRate() {
        return motorcycleRate;
    }

    public void setMotorcycleRate(double motorcycleRate) {
        this.motorcycleRate = motorcycleRate;
    }

    public int getCarCount() {
        return carCount;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public int getTruckCount() {
        return truckCount;
    }

    public void setTruckCount(int truckCount) {
        this.truckCount = truckCount;
    }

    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void setMotorcycleCount(int motorcycleCount) {
        this.motorcycleCount = motorcycleCount;
    }

    public double calculateTotalRevenue() {
        return (carRate * carCount) + (truckRate * truckCount) + (motorcycleRate * motorcycleCount);
    }

    public int calculateTotalVehicles() {
        return carCount + truckCount + motorcycleCount;
    }

    @Override
    public String toString() {
        return "TollBoothRevenueManager{" +
                "carRate=" + carRate +
                ", truckRate=" + truckRate +
                ", motorcycleRate=" + motorcycleRate +
                ", carCount=" + carCount +
                ", truckCount=" + truckCount +
                ", motorcycleCount=" + motorcycleCount +
                '}';
    }
}

