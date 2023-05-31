import java.util.IntSummaryStatistics;

public class UndergroundSystem {

    final HashMap<Integer, CheckIn> passengerCheckIns;
    final HashMap<String, HashMap<String, IntSummaryStatistics>> statistics;

    public UndergroundSystem() {
        this.passengerCheckIns = new HashMap<>();
        this.statistics = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        this.passengerCheckIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn checkIn = this.passengerCheckIns.remove(id);
        this.statistics.putIfAbsent(checkIn.stationFrom, new HashMap<>());
        this.statistics.get(checkIn.stationFrom).putIfAbsent(stationName, new IntSummaryStatistics());
        this.statistics.get(checkIn.stationFrom).get(stationName).accept(t - checkIn.time);
    }

    public double getAverageTime(String startStation, String endStation) {
        return this.statistics.get(startStation).get(endStation).getAverage();
    }

    record CheckIn(String stationFrom, int time) { }

}