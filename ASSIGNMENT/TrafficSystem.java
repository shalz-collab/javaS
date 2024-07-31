import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// TrafficSignal class
class TrafficSignal {
    String location;
    int greenTime;
    int yellowTime;
    int redTime;
    int pedestrianGreenTime;
    boolean isPedestrianPhaseEnabled;

    public TrafficSignal(String location, int greenTime, int yellowTime, int redTime, int pedestrianGreenTime, boolean isPedestrianPhaseEnabled) {
        this.location = location;
        this.greenTime = greenTime;
        this.yellowTime = yellowTime;
        this.redTime = redTime;
        this.pedestrianGreenTime = pedestrianGreenTime;
        this.isPedestrianPhaseEnabled = isPedestrianPhaseEnabled;
    }

    @Override
    public String toString() {
        return "TrafficSignal{" +
                "location='" + location + '\'' +
                ", greenTime=" + greenTime +
                ", yellowTime=" + yellowTime +
                ", redTime=" + redTime +
                ", pedestrianGreenTime=" + pedestrianGreenTime +
                ", isPedestrianPhaseEnabled=" + isPedestrianPhaseEnabled +
                '}';
    }
}

// TrafficManager class
class TrafficManager {
    public void addTrafficSignals(List<TrafficSignal> trafficSignals) {
        // Add logic to handle the traffic signals
        System.out.println("Traffic signals added: " + trafficSignals.size());
        for (TrafficSignal signal : trafficSignals) {
            System.out.println(signal);
        }
    }
}

// TrafficSystem class
public class TrafficSystem {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\sushm\\Downloads\\archive (2).zip"; // Corrected path
        List<TrafficSignal> trafficSignals = readTrafficSignalsFromCSV(csvFile);

        TrafficManager trafficManager = new TrafficManager();
        trafficManager.addTrafficSignals(trafficSignals);
    }

    public static List<TrafficSignal> readTrafficSignalsFromCSV(String csvFile) {
        List<TrafficSignal> trafficSignals = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                // Assuming columns: location, greenTime, yellowTime, redTime, pedestrianGreenTime, isPedestrianPhaseEnabled
                TrafficSignal signal = new TrafficSignal(
                        values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]),
                        Integer.parseInt(values[4]), Boolean.parseBoolean(values[5])
                );
                trafficSignals.add(signal);
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return trafficSignals;
    }
}

