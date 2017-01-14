package WuTangFinancial;

/**
 * Created by alfatihmukhtar on 1/13/17.
 */
public class WuTangFinancial {
    public static void main(String[] args) {

        ExchangeHandler exchangeHandler = new ExchangeHandler();

        System.out.println(exchangeHandler.makeExchange(5.0,"USD","GBP"));
    }
}
