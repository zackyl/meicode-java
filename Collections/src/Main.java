import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String[] names = new String[5];
//        String[] namesz = {"zack", "brad", "dad", "mom", "kap"};
//
//        String[] newnames = new String[6];
//        for (int i = 0; i < names.length; i++) {
//            newnames[i] = names[i];
//        }
//        newnames[5] = "jerry";
//        System.out.println(newnames[5]);

        ArrayList<String> names = new ArrayList<>();
//        List<String> students = new ArrayList<>();
        names.add("Meisam");
        names.add("Sarah");
//        System.out.println(names);
//        System.out.println(names.get(0));
//        System.out.println(names.size());
////        names.clear();
//        names.remove("Meisam");  // noop if not exist
//        System.out.println(names);
//        System.out.println(names.contains("Meisam"));
//        System.out.println(names.isEmpty());
//        names.remove("Sarah");
//        System.out.println(names.isEmpty());
//        System.out.println(names.indexOf("Meisam"));  // -1 when doesn't exist
////        names.sort();
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
        Map<String, String> emailList = new HashMap<>();
        emailList.put("Meisam", "Meisam@meicode.org");
        emailList.put("Brad", "Brad@gmail.com");
        System.out.println(emailList.get("Meisam"));
        System.out.println(emailList.get("Mei1sam"));  // returns null when doesn't exist
        emailList.remove("Brad");
        emailList.remove("Brad1");
        System.out.println(emailList.size());
        System.out.println(emailList.containsKey("Brad"));
        System.out.println(emailList.containsValue("Meisam@meicode.org"));
        emailList.values();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Meisam", 15));
        students.add(new Student("Sarah", 18));
        for (Student student: students) {
            System.out.println(student.getName());
        }
    }
}