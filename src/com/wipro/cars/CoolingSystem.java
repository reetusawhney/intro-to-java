package com.wipro.cars;

public interface CoolingSystem {
    //public static final,public abstract are optional

    public static final int LOWEST_TEMP = 60;

    public abstract int getCurrentTemperature();

    // adding new requirement.helps backwards compatibility
    //here default  will not break existing code
    public default int getSomeValue() {
        return 2390;
    }

}
