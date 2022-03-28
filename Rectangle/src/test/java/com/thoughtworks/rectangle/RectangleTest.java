package com.thoughtworks.rectangle;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {
   
    @Test
    void shouldReturnAreaAsThirtyWhenLengthIsSixAndBreadthIsFive() 
    {
        Rectangle rectangle = new Rectangle(6.0, 5.0);

        double result = rectangle.area();

        assertThat(result, is(closeTo(30.0,0.001)));

    }

    @Test
    void shouldReturnPerimeterAsTwentyTwoWhenLengthIsSixAndBreadthIsFive()
    {
       Rectangle rectangle = new Rectangle(6.0, 5.0);

       double peri = rectangle.perimeter();

       assertThat(peri, is(closeTo(22.0,.001)));
    }
}