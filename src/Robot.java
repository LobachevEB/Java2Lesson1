public class Robot implements Competitor {
    private String SerialNo;
    private int MaxRunResource;
    private int MaxJumpHeight;
    private boolean OnDistance;

    public Robot(String serialNo) {
        SerialNo = serialNo;
        MaxJumpHeight = 0;
        MaxRunResource = 20000;
        OnDistance = true;
    }

    public Robot(String serialNo, int maxRunResource, int maxJumpHeight) {
        SerialNo = serialNo;
        MaxRunResource = maxRunResource;
        MaxJumpHeight = maxJumpHeight;
        OnDistance = true;
    }

    @Override
    public boolean isOnDistance() {
        return OnDistance;
    }

    @Override
    public void run(int distance) {
        if(distance <= MaxRunResource){
            System.out.printf("Robot %s run the distance successfully\n",SerialNo);
        }
        else {
            System.out.printf("Robot %s didn't run the distance\n",SerialNo);
            OnDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= MaxJumpHeight){
            System.out.printf("Robot %s jumped successfully\n",SerialNo);
        }
        else {
            System.out.printf("Robot %s didn't jump\n",SerialNo);
            OnDistance = false;
        }
    }
}
