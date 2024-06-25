package one.digitalinnovation.gof;

public class Test {
    public static void main(String[] args) {
        // Testes de Singleton
        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = Singletonholder.getInstancia();
        System.out.println(holder);
        holder = Singletonholder.getInstancia();
        System.out.println(holder);
    }

}
