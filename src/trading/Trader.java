package trading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trader {
    List<Trade> trades;
    Random random;

    public Trader() {
        this.trades = new ArrayList<Trade>();
        this.random = new Random();
        addRandomTrade();
    }

    public List<Trade> getTrades() {
        return trades;
    }

    public void addRandomTrade(){
        int rand_gems = random.nextInt(5) + 1;
        int rand_amount = random.nextInt(5) + 1;
        Goods rand_goods = getRandomGoods();

        Trade rand_trade = new Trade(rand_gems, rand_amount, rand_goods);
        trades.add(rand_trade);
    }

    public Goods getRandomGoods(){
        Goods[] goods = Goods.values();

        random = new Random();

        int rand_int = random.nextInt(goods.length);

        return goods[rand_int];
    }

    @Override
    public String toString() {
        ArrayList<String> result = new ArrayList<String>();

        for(Trade t: this.trades){
            result.add(t.toString());
        }

        return result.toString();
    }
}
