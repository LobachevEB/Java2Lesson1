public class Human implements Competitor {
    private String Name;
    private int MaxRunDistance;
    private int MaxJumpHeight;
    private boolean OnDistance;

    public Human(String name) {
        Name = name;
        OnDistance = true;
        MaxJumpHeight = 1;
        MaxRunDistance = 1000;
    }

    public Human(String name, int maxRunResource, int maxJumpHeight) {
        Name = name;
        MaxRunDistance = maxRunResource;
        MaxJumpHeight = maxJumpHeight;
        OnDistance = true;
    }

    @Override
    public boolean isOnDistance() {
        return OnDistance;
    }

    @Override
    public void run(int distance) {
        if(distance <= MaxRunDistance){
            System.out.printf("Human %s run the distance successfully\n",Name);
        }
        else {
            System.out.printf("Human %s didn't run the distance\n",Name);
            OnDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= MaxJumpHeight){
            System.out.printf("Human %s jumped successfully\n",Name);
        }
        else {
            System.out.printf("Human %s didn't jump\n",Name);
            OnDistance = false;
        }
    }
}
