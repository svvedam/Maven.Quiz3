package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 10/12/2018.
 */
public enum LabStatus {
    //ADD_ENUMERATIONS_HERE;
    COMPLETED(1),
    INCOMPLETE(2),
    PENDING(3);



    private int defaultEnum;

    LabStatus(int defaultEnum){
        this.defaultEnum = defaultEnum;
    }
    public int getDefaultEnum(){
        return this.defaultEnum;
    }
}
