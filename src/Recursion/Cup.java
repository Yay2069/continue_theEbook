package Recursion;

public class Cup {

    private String cupFilling;
    private final int SIP_MAX_LVL = 3; //you can sip 3 time unless is empty
    private int sipActualLvl;
    private boolean isEmpty;

    public Cup() {
        cupFilling = "";
        sipActualLvl = 0;
        isEmpty = true;
    }
    public Cup(String filling) {
        this.cupFilling = filling;
        sipActualLvl = 0;
        isEmpty = true;
    }


    public void sip() {
        if(cupFilling.isEmpty()) System.out.println("The cup got no filingggg");
        else if(sipActualLvl == 0) System.out.println("The cup is empty..");
        else {
            sipActualLvl--;
            System.out.println("Sippingg... (" + sipActualLvl + "/" + SIP_MAX_LVL + ")");
        }

    }

    public void pourInsideCup(String value) {
        cupFilling = value;
        isEmpty = false;
        sipActualLvl = SIP_MAX_LVL;

        System.out.println("cup filled with (" + value + sipActualLvl + "/" + SIP_MAX_LVL + ")" );
    }

}
