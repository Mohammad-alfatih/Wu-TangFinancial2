package WuTangFinancialTest;

import WuTangFinancial.ExchangeHandler;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alfatihmukhtar on 1/13/17.
 */
public class exchangeHandlerTest {
    @Test
    public void dollarToEuoTest() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"USD", "EUR");
        assertEquals(expected, actual);
    }
    @Test
    public void euroToDollarTest() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"EUR", "USD");
        assertEquals(expected, actual);
    }
    @Test
    public void euroToBritishPoundTest() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"EUR", "GBP");
        assertEquals(expected, actual);
    }
    @Test
    public void britishPoundToRupeeTest() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"GBP", "RUP");
        assertEquals(expected, actual);
    }
    @Test
    public void rupeeToCanadian() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"RUP", "CAD");
        assertEquals(expected, actual);
    }
    @Test
    public void canadianToSingapore() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"CAD", "SID");
        assertEquals(expected, actual);
    }
    @Test
    public void singaporeToSwissFranc() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"SID", "SWF");
        assertEquals(expected, actual);
    }
    @Test
    public void swissFrancToRinggit() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"SWF", "MAR");
        assertEquals(expected, actual);
    }
    @Test
    public void ringgitToYen() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"MAR", "YEN");
        assertEquals(expected, actual);
    }
    @Test
    public void yenToYuan() {
        ExchangeHandler test = new ExchangeHandler();
        Double expected = 0.94;
        Double actual = test.makeExchange(1.0,"YEN", "YUA");
        assertEquals(expected, actual);
    }

}
