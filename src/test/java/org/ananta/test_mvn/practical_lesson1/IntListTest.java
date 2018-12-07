package org.ananta.test_mvn.practical_lesson1;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntListTest {

    @Test
    public void testSize() throws Exception {
        IntList list = new IntList();
        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void testAddAll() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void testGet() {
    }

    @Test
    public void testPush() {
    }

    @Test
    public void testPeek() {
    }

    @Test
    public void testPop() {
    }
}