package organ;


public class Eye extends Organ {
    private String color;

    private boolean isOpened;

    public Eye(String name, String condition, String color, boolean isOpened) {
        super(name, condition);
        this.color = color;
        this.isOpened = isOpened;
    }

    public void open() {
        setOpened(true);
        System.out.println(this.getName() + " Opened");
    }

    public void close() {
        setOpened(false);
        System.out.println(this.getName() + " Closed");
    }

    @Override
    public void action() {
        if (isOpened()) {
            System.out.println("\t 1. Close the eye");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                setOpened(false);
            }
        } else {
            System.out.println("\t 1. Open the eye");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                setOpened(true);
            }
        }
    }

    @Override
    protected void additionalCondition() {
        System.out.println("Color: " + getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

}
