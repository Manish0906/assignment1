public class encapsulation {
   private int roll = 10;
   private String name = "Manish";
public int getRoll() {
    return roll;
}
public void setRoll(int roll) {
    this.roll = roll;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

   



}

class access {
    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setRoll(30);
        obj.setName("Manish");
        
        System.out.println(obj.getRoll());
        System.out.println(obj.getName());
    }
}
