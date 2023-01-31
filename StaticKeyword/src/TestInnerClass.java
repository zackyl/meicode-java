public class TestInnerClass {
    private int age;
    private String color;
    private class TestInner {  // can be static
        private String name;

        public TestInner(String name) {
            this.name = name;
        }

        private void printAge() {
            System.out.println("Age: " + age);
        }
    }
}
