package thirteen_abstraction;

public class UserAbs {

    public static void main(String[] args) {
        
        // Lenovo lenovo = new Lenovo(); --> No Abstraction

        // With Abstraction
        Laptop lenovo = new Lenovo();
        System.out.println("Buying Lenovo Laptop");
        lenovo.usbSlot();
        lenovo.hdmiSlot();
        lenovo.cPort();
        lenovo.microsdSlot();

        System.out.println("Buying Dell Laptop");
        Laptop dell = new Dell();
        dell.usbSlot();
        dell.hdmiSlot();
        dell.cPort();

        Dell dell1= new Dell();
        dell1.audioJack();
        dell1.microsdSlot();
        dell1.ethernetSlot();
      
    }

}