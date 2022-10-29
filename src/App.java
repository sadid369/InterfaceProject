public class App {
    public static void main(String[] args) throws Exception {
      ITelephone sadidPhone ;
      sadidPhone =new DeskPhone(01710);
      sadidPhone.powerOn();
      sadidPhone.callPhone(01710);
      sadidPhone = new MobilePhone(502797);
      sadidPhone.powerOn();
      sadidPhone.callPhone(502797);
      
    }
}
