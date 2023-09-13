package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public void shouldCashbackIfAmountLessBoundary() {

        int expected = 400;
        int actual = service.remain(600);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCashbackIfAmountMoreBoundary() {

        int expected = 200;
        int actual = service.remain(2800);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void shouldCashbackIfAmountEqualsBoundary() {

        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}