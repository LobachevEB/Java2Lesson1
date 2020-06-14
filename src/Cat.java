public class Cat implements Competitor {
    private String Name;
    private int MaxRunDistance;
    private int MaxJumpHeight;
    private boolean OnDistance;

    public Cat(String name) {
        Name = name;
        OnDistance = true;
        MaxJumpHeight = 2;
        MaxRunDistance = 500;
    }

    public Cat(String name, int maxRunResource, int maxJumpHeight) {
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
            System.out.printf("Cat %s run the distance successfully\n",Name);
        }
        else {
            System.out.printf("Cat %s didn't run the distance\n",Name);
            OnDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= MaxJumpHeight){
            System.out.printf("Cat %s jumped successfully\n",Name);
        }
        else {
            System.out.printf("Cat %s didn't jump\n",Name);
            OnDistance = false;
        }
    }
}
