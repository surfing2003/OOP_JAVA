package factory_method;

public class Main {
    public static void main(String[] args){
        new Console().withoutFactory();
        new Console().withFactory();
    }
}
