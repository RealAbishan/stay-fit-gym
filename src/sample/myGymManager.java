package sample;

import java.util.ArrayList;
import java.util.List;

public class myGymManager implements gymManager {


    private List<defaultMember> membersList = new ArrayList<defaultMember>();

    @Override
    public void addMember(defaultMember member)
    {
        System.out.println("No of Used Slots in the DataBase" + " " + membersList.size());
        System.out.println("No of Free Slots in the DataBase" + " " +(100-membersList.size()));

        // Check the Available Slots and add member if slots available

        if (membersList.size() <100)
        {
            membersList.add(member);
            System.out.println("New Member has been added successfully to the DataBase!!!");

        }

        else
        {
            System.out.println("There are no free slots available in the DataBase!!!");
        }
    }

    @Override
    public boolean deleteMember(String membershipNumber)
    {
        boolean checkNum = false;

        for (defaultMember member: membersList)
        {
            if (member.getMembershipNumber().equals(membershipNumber))
            {
                checkNum =true;

                membersList.remove(member);

                System.out.println(membershipNumber + " " + " has been deleted successfully from the DataBase");

                System.out.println("No of Used Slots in the DataBase" + " " + membersList.size());
                System.out.println("No of Free Slots in the DataBase" + " " +(100-membersList.size()));

                break;
            }
        }

        if (!checkNum)
        {
            System.out.println("System Could not find the entered Number. Please check the number.");
        }

        return checkNum;

    }

    @Override
    public void printMemberList()
    {
        for (defaultMember member: membersList)

        {
            // Print the membershipNumber

            System.out.println("Membership Number - " + " " + member.getMembershipNumber()+ " ");

            //Print he MembershipType

            if (member instanceof studentMember)
            {
                System.out.println("Membership Type: Student Member");
            }

            else if (member instanceof over60Member)
            {
                System.out.println("Membership Type: Age over 60 Members");
            }

            else
            {
                System.out.println("Membership Type: Default Member");
            }

            //Print the member Name

            System.out.println("Name of the member is:" + " " + member.getMemberName());

            //Print the nicNumber

            System.out.println("Nic Number of the Member: " + " " + member.getNicNumber());

            //Print he Membership start date

            System.out.println("Membership start date:" + " " + member.getMembershipStartDate());
        }

        if (membersList.size() == 0)
        {
            System.out.println("There is nothing in the DataBase!!!");
        }
    }

    @Override
    public List<defaultMember> sort() {
        return null;
    }

    @Override
    public void saveMember() {

    }

    @Override
    public List<defaultMember> getMemberByList() {
        return this.membersList;
    }

    @Override
    public defaultMember getMemberMembershipNumber(String membershipNumber) {
        return null;
    }

    @Override
    public defaultMember[] getMemberName(String memberName) {
        return new defaultMember[0];
    }
}
