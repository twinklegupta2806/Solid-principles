package dry.principle;

public class Calculation{
    double calculate_tax_on_food(int price){
        return (double) price /7;
    }

    double calculate_tax_on_cloth(int price){
        return (double) price /15;
    }

    double calculate_tax_on_electronics(int price){
        return (double) price /20;
    }
}