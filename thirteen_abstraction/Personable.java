package thirteen_abstraction;

public interface Personable {


    public void setPersonDetails();
    public void displayPersonDetails();
    default void achievementStatus(){};

}
