package thirteen_abstraction;

public abstract class AbstractPerson {


    private int personID;
    private String personName;
    private int personAge;
    private long personMobileNumber;



    public int getPersonID() {
        return personID;
    }
    public void setPersonID(int personID) {
        this.personID = personID;
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public int getPersonAge() {
        return personAge;
    }
    public void setPersonAge(int personAge) {
        if(personAge>0){
            this.personAge = personAge;
        }else{
            System.out.println("Invalid Age");
        }
    }
    public long getPersonMobileNumber() {
        return personMobileNumber;
    }
    public void setPersonMobileNumber(long personMobileNumber) {
        this.personMobileNumber = personMobileNumber;
    }


    

    

}
