package factory_method;


public class CompFactory {
    public Component getComp (Console.Usage usage){
        if (usage == Console.Usage.PRESS){
            return new Button();
        }
        else if (usage == Console.Usage.TOGGLE){
            return new Switch();
        }
        else {
            return new Dropdown();
        }
    }
}
