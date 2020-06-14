public class Main {
    public static void main(String[] args){
        Obstacle RunPath = new Obstacle() {
            int distance = 1000;
            @Override
            public void overcome(Competitor c) {
                c.run(distance);
            }
        };
        Obstacle Wall = new Obstacle() {
            int height = 1;
            @Override
            public void overcome(Competitor c) {
                c.jump(height);
            }
        };
        Obstacle[] Obstacles = {RunPath,Wall};
        Competitor[] Competitors = {new Robot("T-800"),new Human("John Dow"),new Cat("Alfons")};

        for (Competitor cmp: Competitors) {
            for (Obstacle obs: Obstacles) {
                obs.overcome(cmp);
                if(!cmp.isOnDistance()){
                    break;
                }
            }
        }

        System.out.printf("\n");

        printDayOfWeek(DayOfWeek.MONDAY);
        printDayOfWeek(DayOfWeek.TUESDAY);
        printDayOfWeek(DayOfWeek.WEDNESDAY);
        printDayOfWeek(DayOfWeek.THURSDAY);
        printDayOfWeek(DayOfWeek.FRIDAY);
        printDayOfWeek(DayOfWeek.SATURDAY);
        printDayOfWeek(DayOfWeek.SUNDAY);
    }

    private static void printDayOfWeek(DayOfWeek d){
        int h = d.getHours();
        if (h > 0){
            System.out.printf("%s: Weekend will start after %d hours\n",d,h);
        }
        else {
            System.out.printf("%s: There is weekend\n",d);
        }
    }
}
