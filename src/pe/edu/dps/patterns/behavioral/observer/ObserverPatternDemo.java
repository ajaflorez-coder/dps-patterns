package pe.edu.dps.patterns.behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String args[]) {
        // create objects for testing
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
        MyScoreDisplay myScoreDisplay = new MyScoreDisplay();

        // pass the displays to Cricket data
        CricketData cricketData = new CricketData();
        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
        cricketData.registerObserver(myScoreDisplay);
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
        cricketData.registerObserver(myScoreDisplay);
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
        cricketData.registerObserver(myScoreDisplay);
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
        cricketData.registerObserver(myScoreDisplay);

        // in real app you would have some logic to
        // call this function when data changes
        cricketData.dataChanged();
        //remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);
        // now only currentScoreDisplay gets the
        // notification
        cricketData.dataChanged();
    }
}
