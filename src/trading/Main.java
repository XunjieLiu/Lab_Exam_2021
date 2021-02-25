package trading;

public class Main {
    public static void main(String[] args){
        Trade t = new Trade(3, 3, Goods.BREAD);

        System.out.println(t);

        Citizen c = new Citizen(10);
        System.out.println(c);


        boolean result = c.executeTrade(t);

        System.out.println(result);
        System.out.println(c);

        Trader trader = new Trader();

        System.out.println(trader);
    }

}
