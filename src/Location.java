package com.zealake.workshop;

public class Location {
    public String CountryCode;
    public String Country;
    public String Region;
    public String City;

    public String toDisplayString() {
        if (CountryCode.equals("US")) {
            return City + ", " + Region;
        } else {
            if (City == null || City.equals("")) {
                return Country;
            } else {
                return City + ", " + Country;
            }
        }

    }
}
