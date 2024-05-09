class Mobile {
    String name;
    String color;
    int price;

    public void setValue(String n, String c, int p) {
        name = n;
        color = c;
        price = p;
    }

    public void setDetails() {
        System.out.println("Name of the phone is:" + name);
        System.out.println("Color pf the phone is:" + color);
        System.out.println("Price of the phone is:" + price);
    }

}

class mobileDriver {
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.setValue("APPLE", "BLACK", 2000);a
        m1.setDetails();
    }
}


