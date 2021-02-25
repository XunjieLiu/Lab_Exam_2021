package trading;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

public class Trade{
    Integer gems;
    Integer amount;
    Goods goods;

    public Trade(Integer gems, Integer amount, Goods goods) {
        this.gems = gems;
        this.amount = amount;
        this.goods = goods;
    }

    public Integer getAmount() {
        return amount;
    }

    public Goods getGoods() {
        return goods;
    }

    public Integer getGems() {
        return gems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return gems.equals(trade.gems) && amount.equals(trade.amount) && goods == trade.goods;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gems, amount, goods);
    }

    @Override
    public String toString() {
        return gems +
                " gems for " + amount +
                " " + goods +
                '.';
    }

    public void execute(Trader trader, Citizen citizen) throws IllegalArgumentException{
        List<Trade> trades_from_trader = trader.getTrades();

        for(Trade t: trades_from_trader){
            if(!t.equals(this)){
                throw new IllegalArgumentException();
            }
        }

        citizen.executeTrade(this);
    }
}
