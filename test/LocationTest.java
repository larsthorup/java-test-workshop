package com.zealake.workshop;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class LocationTest {

    @Test
    public void toDisplayString_InsideUsa()
    {
        Location location = new Location();
        location.CountryCode = "US";
        location.Region = "California";
        location.City = "San Francisco";
        assertThat(location.toDisplayString(), equalTo("San Francisco, California"));
    }

    @Test
    public void toDisplayString_OutsideUsa()
    {
        Location location = new Location();
        location.CountryCode = "DK";
        location.Country = "Denmark";
        location.Region = "Hovedstaden";
        location.City = "Farum";
        assertThat(location.toDisplayString(), equalTo("Farum, Denmark"));
    }

    @Test
    public void toDisplayString_NoCity()
    {
        Location location = new Location();
        location.CountryCode = "PH";
        location.Country = "Philippines";
        assertThat(location.toDisplayString(), equalTo("Philippines"));
    }

}