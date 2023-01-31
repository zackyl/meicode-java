public class TestClassStatic {
    public static String name;
    public int age;
    public String skinColor;

    public TestClassStatic(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public static void printSomething() {
        System.out.println("Printing...");
    }

    public void print() {

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClassStatic.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
