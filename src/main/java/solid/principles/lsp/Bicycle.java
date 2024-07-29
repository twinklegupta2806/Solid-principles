package solid.principles.lsp;

public class Bicycle extends Vehicle
{
    @Override
    void startEngine()
    {
        //this does not make sense
    }

    @Override
    void start()
    {
        System.out.println("pedalling");
    }

}
