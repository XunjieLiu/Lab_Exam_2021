package trading;

import java.util.HashMap;

public class Citizen {
    Integer gems;
    HashMap<Goods, Integer> inventory;

    public Citizen(Integer gems) {
        this.gems = gems;
        this.inventory = new HashMap<Goods, Integer>();
    }

    public int getAmount(Goods goods){
        if(inventory.isEmpty()){
            return 0;
        }else{
            return inventory.get(goods);
        }
    }

    public boolean executeTrade (Trade trade){
        if(this.gems < trade.getGems()){
            return false;
        }

        this.gems -= trade.getGems();
        Goods good_from_trade = trade.getGoods();

        if(inventory.containsKey(good_from_trade)){
            Integer current_amount = inventory.get(good_from_trade);
            Integer new_amount = current_amount + trade.getAmount();

            inventory.put(good_from_trade, new_amount);
        }else{
            inventory.put(good_from_trade, trade.getAmount());
        }

        return true;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "gems=" + gems +
                ", inventory=" + inventory +
                '}';
    }
}
