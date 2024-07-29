package solid.principles.lsp;

public class Car extends Vehicle
{

    @Override
    void startEngine()
    {
        //make sense
    }

    void start(){
        System.out.println("driving");
    }
}
