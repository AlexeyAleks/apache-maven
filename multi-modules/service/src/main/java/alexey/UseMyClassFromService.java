package alexey;

public class UseMyClassFromService {
    void addTextFromMyClass() {
        System.out.println(new MyClass().addHello("Bob"));
    }
}
