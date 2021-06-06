package sample;

public class studentMember extends defaultMember {

    private String schoolName;

    public studentMember(String membershipNumber, String memberName, String membershipStartDate, char nicNumber ,int mobileNumber,String schoolName)
    {
        super(membershipNumber, memberName, membershipStartDate, nicNumber , mobileNumber, mobileNumber );
        this.schoolName = schoolName;
    }

//Get schoolName

    public String getSchoolName()
    {
        return schoolName;
    }

//Set schoolName

    public void setSchoolName (String schoolName)
    {
        this.schoolName = schoolName;
    }

}
