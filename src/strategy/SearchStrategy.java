package strategy;

interface SearchStrategy {
    public void search();
}

class SearchStrategyAll implements SearchStrategy{
    public void search(){
        System.out.println("Search ALL");
    }
}

class SearchStrategyImage implements SearchStrategy{
    public void search(){
        System.out.println("Search IMAGE");
    }
}

class SearchStrategyNews implements SearchStrategy{
    public void search(){
        System.out.println("Search NEWS");
    }
}

class SearchStrategyMap implements SearchStrategy{
    public void search(){
        System.out.println("Search MAP");
    }
}
