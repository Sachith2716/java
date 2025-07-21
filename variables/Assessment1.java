package variables;

public class Assessment1 {
    //String EngineType, Displacement, MaxPower, MaxTorque, FSS, TarboCharger, TransmissionType, GearBox, DriveType;
    //int Cylinders, VPC;
    public static void main(String[] args){
        String EngineType = "mHAWK 4 Cylinder";
        String Displacement = "2184 cc";
        String MaxPower = "130bhp@3750rpm";
        String MaxTorque = "300Nm@1600-2800rpm";
        byte Cylinders = 4;
        int VPC = 4;
        String FSS = "CRDi";
        Boolean TarboCharger= true;
        String TransmissionType = "Manual";
        String GearBox = "6-speed";
        String DriveType = "RWD";
        System.out.println("Engine Type: " + EngineType);
        System.out.println("Displacement: " + Displacement);
        System.out.println("Max Power: " + MaxPower);
        System.out.println("Max Torque: "+ MaxTorque);
        System.out.println("No.of Cylinders: " + Cylinders);
        System.out.println("Valves Per Cylinders: "+ VPC);
        System.out.println("Fuel Supply System: " + FSS);
        System.out.println("Tarbo Charger: " + TarboCharger);
        System.out.println("Transmission Type: "+ TransmissionType);
        System.out.println("GearBox: "+ GearBox);
        System.out.println("Drive Type: " + DriveType);
        


    }


}
