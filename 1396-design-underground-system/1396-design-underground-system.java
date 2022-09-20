class UndergroundSystem {
    // Pair<>(stationName, Time)
    Map<Integer, Pair<String, Integer>> checkInMap = new HashMap();
    // Pair<>(totalTime, Count)
    Map<String, Pair<Double, Integer>> routeMap = new HashMap();

    public UndergroundSystem() {}
    
    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> checkIn = checkInMap.get(id);
        checkInMap.remove(id); // prevent overloading, reduce pressure
        
        String routeName = checkIn.getKey() + "->" + stationName;
        int totalTime = t - checkIn.getValue();
        
        Pair<Double, Integer> route = routeMap.getOrDefault(routeName, new Pair<>(0.0, 0));
        routeMap.put(routeName, new Pair<>(route.getKey() + totalTime, route.getValue() + 1));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String routeName = startStation + "->" + endStation;
        Pair<Double, Integer> route = routeMap.get(routeName);
        return route.getKey() / route.getValue();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */