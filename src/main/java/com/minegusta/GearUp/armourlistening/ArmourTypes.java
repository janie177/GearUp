package com.minegusta.gearup.armourlistening;


public enum ArmourTypes {

    SHADOW("Shadow"),
    NATURE("Nature"),
    RAINBOW("Rainbow"),
    MOLTEN("Molten"),
    ICE("Ice");

    private String type;

    private ArmourTypes(String type)
    {
        this.type = type;
    }

    public String get()
    {
        return type;
    }
}
