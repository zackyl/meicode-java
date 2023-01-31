package organ;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String condition, int heartRate) {
        super(name, condition);
        this.heartRate = heartRate;
    }

//    @Override
//    public void printCondition() {
//        super.printCondition();
//        System.out.println("Heart rate: " + heartRate);
//    }

    @Override
    protected void additionalCondition() {
        System.out.println("Heart rate: " + getHeartRate());
    }

    @Override
    public void action() {
        System.out.println("\t 1. Change heart rate");
        if (!scanner.nextLine().equals("1")) {
            return;
        }
//        Stomach.what
        System.out.println("Enter the new heart rate:");
        heartRate = scanner.nextInt();
        System.out.println("Heart rate changed to: " + getHeartRate());
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
