public class emp {
    String name;
    int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}

class Employee {
    public static void main(String[] args) {
        emp e1 = new emp();
        emp e2 = new emp();
        e1.setName("MAnish");
        e2.setName("Bobby");
        
        e1.setAge(15);
        e2.setAge(18);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e2.getName());
        System.out.println(e2.getAge());



    }
}

