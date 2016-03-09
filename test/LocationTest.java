package com.zealake.workshop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LocationTest {

    @Test
    public void toDisplayString_InsideUsa()
    {
        Location location = new Location();
        location.CountryCode = "US";
        location.Region = "California";
        location.City = "San Francisco";
        assertThat(location.toDisplayString(), is("San Francisco, California"));
    }

    @Test
    public void toDisplayString_OutsideUsa()
    {
        Location location = new Location();
        location.CountryCode = "DK";
        location.Country = "Denmark";
        location.Region = "Hovedstaden";
        location.City = "Farum";
        assertThat(location.toDisplayString(), is("Farum, Denmark"));
    }

    @Test
    public void toDisplayString_NoCity()
    {
        Location location = new Location();
        location.CountryCode = "PH";
        location.Country = "Philippines";
        assertThat(location.toDisplayString(), is("Philippines"));
    }

}