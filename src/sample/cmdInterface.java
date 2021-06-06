package sample;

import javafx.application.Application;

import java.util.Scanner;

public class cmdInterface
{
    private final static myGymManager membersList = new myGymManager();
    private static int count = 0 ;

    public static void main(String[] args)
    {
        Scanner insert =  new Scanner(System.in);

        System.out.println("---------------------Stay Fit GYM--------------------");

        System.out.println("------------Enter 1 for Insert Members---------------");
        System.out.println("------------Enter 2 for Delete Member----------------");
        System.out.println("------------Enter 3 for Print Member Details---------");
        System.out.println("------------Enter 4 for Sort Members-----------------");
        System.out.println("------------Enter 5 GraphicalUseInterFace------------");

        int chooseNum =  insert.nextInt();

        switch (chooseNum)
        {
            case 1:
            insertNewMember();
            break;

            case 2:
            deleteMember();
            break;

            case 3:
            membersList.printMemberList();
            break;

            case 4:
            sortMember();
            break;


            case 5:
                Application.launch(Main.class,args);
                break;

            default:
                System.out.println("You have entered an Invalid Number");





        }


    }




//Add the New Member to the database

    private static void insertNewMember()
    {
        Scanner inputNum = new Scanner(System.in);

        if (count < 100)
        {

            //Add the membership Number

            System.out.println("Please Enter Membership Number");
            String membershipNumber = inputNum.next();

            //Add Name

            System.out.println("Please Enter Name");
            String memberName = inputNum.next();
            while (!memberName.matches("[A-Z]"))
            {
                System.out.println("Please Enter String Only Don't Use Other Characters");

                System.out.println("Please Enter Name Again");
                memberName = inputNum.next();
            }

            //Add date in the YYYY/MM/DD format


            System.out.println("Please Enter Member Membership Start Date with the Following Format YYYY/MM/DD");


            //Validate the membership Start Year
            System.out.println("Please Enter Member Membership Start Year ");
            int membershipStartYear  =Integer.parseInt(inputNum.next());

            while (!(membershipStartYear>=2000 && membershipStartYear<=2020))
            {
                System.out.println("You have entered an Invalid Year ");
                System.out.println("Please Enter Member Membership Start Year Again ");
                membershipStartYear = Integer.parseInt(inputNum.next());
            }

            //Validate the membership Start Month
            System.out.println("Please Enter Member Membership Start Month ");
            int membershipStartMonth  =Integer.parseInt(inputNum.next());

            while (!(membershipStartMonth>1 && membershipStartMonth<12))
            {
                System.out.println("You have entered an Invalid Month ");
                System.out.println("Please Enter Member Membership Start Month Again ");
                membershipStartMonth = Integer.parseInt(inputNum.next());
            }

            //Validate the membership Start Date
            System.out.println("Please Enter Member Membership Start Date ");
            int membershipStartDate  =Integer.parseInt(inputNum.next());

            while (!(membershipStartDate>1 && membershipStartDate<31))
            {
                System.out.println("You have entered an Invalid Date ");
                System.out.println("Please Enter Member Membership Start Date Again ");
                membershipStartDate = Integer.parseInt(inputNum.next());
            }

            //Add Nic Number

            System.out.println("Please Enter your NIC Number");
            char nicNumber = inputNum.next().charAt(0);

            String nicString = Character.toString(nicNumber);

            while ((nicString.length()>12))
            {
                System.out.println("You Have entered an invalid NIC Number");


            }


            //Add Mobile Number

            System.out.println("Please Enter Your Mobile Number");
            int mobileNumber  = inputNum.nextInt();

            //Add membershipType

            System.out.println("Enter D - Default Member---->");
            System.out.println("Enter S - Student Member---->");
            System.out.println("Enter O - Over 60 Member---->");

            System.out.println("Please Enter Membership Type");
            String membershipType = inputNum.next();
            defaultMember member = null;



            switch (membershipType)
            {
                case "D":
                case "d":
                    member = new defaultMember(membershipNumber, memberName,membershipStartDate,nicNumber, mobileNumber, mobileNumber);

                    break;

                case "S":
                case "s":
                    System.out.println("Please Enter School Name");
                    String schoolName = inputNum.next();
                    member =  new defaultMember(membershipNumber, memberName, schoolName,nicNumber,mobileNumber, membershipStartDate);


                case "O":
                case "o":

                    System.out.println("Please Enter Age");
                    int age = inputNum.nextInt();
                    member = new defaultMember(membershipNumber, memberName, age,nicNumber,mobileNumber, membershipStartDate);
                    break;

                default:
                    System.out.println("It is not an Invalid Input");
            }

            membersList.addMember(member);
            count ++;

        }

        else
        {
            System.out.println("There is no free slots in te DataBase");
        }
    }

//Delete a particular member from the dataBase
    private static void deleteMember()
    {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Please Enter the Membership Number -");

        String membershipNumber = inputNum.next();
        boolean resultDataBase = membersList.deleteMember(membershipNumber);

        //
        if (resultDataBase)
        {
            count --;
        }

        else
        {
            System.out.println("You have entered an Invalid Membership Number");
        }

    }


// Sort The Members
    private static void sortMember()
    {
    }
}
