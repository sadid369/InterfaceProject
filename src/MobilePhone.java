public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
     
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone power up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){

            System.out.println("Now ringing "+phoneNumber+"on Mobile Phone");
        }else{
            System.out.println("Phone switch off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answer the Mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody Ring Tone");
        }else{
            isRinging = false;
            System.out.println("Mobile Phone not on or number different ");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
