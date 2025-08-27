class Pump {
    int petrol, distance;

    public Pump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class Q5_CircularTourProblem {
    public static int findStartPoint(Pump[] pumps) {
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        Pump[] pumps = {
            new Pump(4, 6),
            new Pump(6, 5),
            new Pump(7, 3),
            new Pump(4, 5)
        };
        System.out.println(findStartPoint(pumps));
    }
}
