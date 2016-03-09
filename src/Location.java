package com.zealake.workshop;

public class Location {
    public String CountryCode;
    public String Country;
    public String Region;
    public String City;

    public String toDisplayString() {
        if (CountryCode == "US")
        {
            return City + ", " + Region;
        }
        else
        {
            if (City == null || City == "")
            {
                return Country;
            }
            else
            {
                return City + ", " + Country;
            }
        }

    }
}
