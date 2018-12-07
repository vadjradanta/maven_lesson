package org.anatacreative.maven_lesson;

import org.testng.annotations.Test;
import org.testng.Assert;
    public class MainTest {
        @Test
        public void test1() {
            double result = Main.calculatePerimeter(3);
            Assert.assertTrue(result >= 18.5 );
        }
        @Test
        public void test2() {
            double result = Main.calculatePerimeter(-1);
            Assert.assertEquals(result , 0.0);
        }
    }