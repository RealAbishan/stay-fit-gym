package sample;

public class over60Member extends defaultMember
{
    private int age;

    public over60Member(String membershipNumber, String memberName, String membershipStartDate, char nicNumber,int mobileNumber,int age)
    {
        super(membershipNumber, memberName, membershipStartDate, nicNumber, mobileNumber, mobileNumber);
        this.age = age;
    }

//Get the Age

    public int getAge()
    {
        return age;
    }

//Set the age

    public void setAge(int age)
    {

        // Validate the age

        if (age>=60)
        {
            this.age = age;
        }

        else
        {
            throw new IllegalArgumentException("You can't enter age less than 60 here");
        }

        }
    }

