package DecoratorPatterm;

public class NewCoffeeMaker extends CoffeeMaker{
    private final Staff staff;

    public NewCoffeeMaker(Staff staff){
        this.staff = staff;
    }

    @Override
    public void makeCoffee(){
        super.makeCoffee();
        addOperation();
    }

    public void addOperation(){
        System.out.println("收银");
    }
}
