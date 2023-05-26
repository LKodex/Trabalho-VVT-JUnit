package vvt.trabalho;

public class Singleton {
    private static Singleton instanceGood;
    private static Singleton instanceBad;
    
    private Singleton() { }

    public static Singleton getInstanceGoodImpl() {
        if (instanceGood == null) instanceGood = new Singleton();
        return instanceGood;
    }

    public static Singleton getInstanceBadImpl() {
        instanceBad = new Singleton();
        return instanceBad;
    }
}
