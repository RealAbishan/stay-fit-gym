package sample;

import java.util.List;

public interface gymManager
{
    public void addMember(defaultMember member);
    public boolean deleteMember(String membershipNumber);
    public void printMemberList();
    public List<defaultMember> sort();
    public void saveMember();
    public List<defaultMember> getMemberByList();
    public defaultMember getMemberMembershipNumber (String membershipNumber);
    public defaultMember[] getMemberName(String memberName);



}
