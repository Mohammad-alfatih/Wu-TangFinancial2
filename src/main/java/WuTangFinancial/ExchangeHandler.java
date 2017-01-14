package WuTangFinancial;

/**
 * Created by alfatihmukhtar on 1/13/17.
 */
public class ExchangeHandler {

    public Double makeExchange(Double amt, String from, String to) {
        Double result = 0.0;

        result = toUSD(amt, from);
        if(to != "USD") {
            result = fromUSD(amt, to);
        }

        return result;
    }

    public Double toUSD(Double amt, String from) {
        // take value of "amt" & perform operation
        // decide on operation based on value of "from"
        // amt * exchangeRate = amtUSD;
        switch (from) {
            case "USD":
                amt /= 1.00;
                break;
            case "EUR":
                amt /= 0.94;
                break;
            case "GBP":
                amt /= 0.82;
                break;
            case "RUP":
                amt /= 68.32;
                break;
            case "AUD":
                amt /= 1.35;
                break;
            case "CAD":
                amt /= 1.32;
                break;
            case "SID":
                amt /= 1.43;
                break;
            case "SWF":
                amt /= 1.01;
                break;
            case "MAR":
                amt /= 4.47;
                break;
            case "YEN":
                amt /= 115.84;
                break;
            case "YUA":
                amt /= 6.92;
                break;
            default:
                amt = 0.0;
        }

        return amt;
    }
    // end toUSD Method

    public Double fromUSD(Double amt, String to) {
        // take value of "amt" & perform operation
        // decide on operation based on value of "from"
        // amt * exchangeRate = amtUSD;
        switch (to) {
            case "USD":
                amt *= 1.00;
                break;
            case "EUR":
                amt *= 0.94;
                break;
            case "GBP":
                amt *= 0.82;
                break;
            case "RUP":
                amt *= 68.32;
                break;
            case "AUD":
                amt *= 1.35;
                break;
            case "CAD":
                amt *= 1.32;
                break;
            case "SID":
                amt *= 1.43;
                break;
            case "SWF":
                amt *= 1.01;
                break;
            case "MAR":
                amt *= 4.47;
                break;
            case "YEN":
                amt *= 115.84;
                break;
            case "YUA":
                amt *= 6.92;
                break;
            default:
                amt = 0.0;
        }

        return amt;

    }
}
