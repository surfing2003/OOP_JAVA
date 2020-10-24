package abstract_factory;

interface CompFactory{
    public Component getComp(Console.Usage usage);
}

class LightCompFactory implements CompFactory {
    public Component getComp (Console.Usage usage){
        if (usage == Console.Usage.PRESS){
            return new LightButton();
        }
        else if (usage == Console.Usage.TOGGLE){
            return new LightButton();
        }
        else {
            return new LightDropdown();
        }
    }
}

class DarkCompFactory implements CompFactory {
    public Component getComp (Console.Usage usage){
        if (usage == Console.Usage.PRESS){
            return new DarkButton();
        }
        else if (usage == Console.Usage.TOGGLE){
            return new DarkButton();
        }
        else {
            return new DarkDropdown();
        }
    }
}