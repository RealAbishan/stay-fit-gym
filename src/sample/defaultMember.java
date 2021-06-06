package sample;

public class defaultMember implements Comparable<defaultMember>
{
    private String membershipNumber;
    private String memberName;
    private String membershipStartDate;
    private char nicNumber;
    private int mobileNumber;


    public defaultMember(String membershipNumber, String memberName, String membershipStartDate, char nicNumber, int number, int mobileNumber)
    {
        super();
        this.membershipNumber = membershipNumber;
        this.memberName = memberName;
        this.membershipStartDate =  membershipStartDate;
        this.nicNumber = nicNumber;
        this.mobileNumber = mobileNumber;

    }

    public defaultMember(String membershipNumber, String memberName, int membershipStartDate, char nicNumber, int mobileNumber, int schoolName) {

    }
    // Get the membershipNumber

    public String getMembershipNumber()
    {
        return membershipNumber;
    }


// Set the membershipNumber

    public void setMembershipNumber(String membershipNumber)
    {
        this.membershipNumber = membershipNumber;
    }


//Get the memberName

    public String getMemberName()
    {
        return memberName;
    }

//Set the memberName

    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

//Get the membershipDate

    public String getMembershipStartDate()
    {
        return membershipStartDate;
    }

//Set the membershipDate

    public void setMembershipStartDate(String membershipStartDate)
    {
        this.membershipStartDate = membershipStartDate;
    }

// Get nicNumber

    public char getNicNumber()
    {
        return nicNumber;
    }

//set nicNumber

    public void setNicNumber(char nicNumber)
    {
        this.nicNumber = nicNumber;
    }


// Get mobile Number

    public int getMobileNumber()
    {
        return mobileNumber;
    }

//set mobile Number

    public void setMobileNumber(int mobileNumber)
    {
        this.mobileNumber = nicNumber;
    }


    @Override
    public int compareTo(defaultMember o) {
        return 0;
    }



}
