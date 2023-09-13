package ru.netology;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public void shouldCashbackIfAmountLessBoundary() {

        int expected = 400;
        int actual = service.remain(600);

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCashbackIfAmountMoreBoundary() {

        int expected = 200;
        int actual = service.remain(2800);

        Assert.assertEquals(actual, expected);
    }

    @Test

    public void shouldCashbackIfAmountEqualsBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(actual, expected);
    }
}