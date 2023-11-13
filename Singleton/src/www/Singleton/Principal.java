package www.Singleton;

public class Principal {

    public static void main(String[] args) {

        // Correção aqui: Use o método estático getInstance() para obter a instância do Singleton
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();

        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();
    }
}
