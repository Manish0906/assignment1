interface A {
    void show();
    void Config();
}
class B implements A{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("in show");
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

    @Override
    public void Config() {
        System.out.println("In config");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Config'");
    }
}

public class Interface {
    A obj;
    obj=new B();
    obj.show();
    obj.config();
}