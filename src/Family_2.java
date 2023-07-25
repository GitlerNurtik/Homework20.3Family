public class Family_2 implements rent{
    private String name;
    private String FamilyMember1;
    private String FamilyMember2;
    private String FamilyMember3;
    private String FamilyMember4;

    public String getName() {
        return name;
    }

    public String getFamilyMember1() {
        return FamilyMember1;
    }

    public String getFamilyMember2() {
        return FamilyMember2;
    }

    public String getFamilyMember3() {
        return FamilyMember3;
    }

    public String getFamilyMember4() {
        return FamilyMember4;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyMember1(String familyMember1) {
        FamilyMember1 = familyMember1;
    }

    public void setFamilyMember2(String familyMember2) {
        FamilyMember2 = familyMember2;
    }

    public void setFamilyMember3(String familyMember3) {
        FamilyMember3 = familyMember3;
    }

    public void setFamilyMember4(String familyMember4) {
        FamilyMember4 = familyMember4;
    }

    public Family_2(String name, String familyMember1, String familyMember2, String familyMember3, String familyMember4) {
        this.name = name;
        FamilyMember1 = familyMember1;
        FamilyMember2 = familyMember2;
        FamilyMember3 = familyMember3;
        FamilyMember4 = familyMember4;
    }

    @Override
    public void pay() {
        System.out.println("""
                Семья живущая в гостинице, платит аренду в размере: 5000руб. за 1 ночь

                """);
    }

    @Override
    public String toString() {
        return "В семье, живущей в гостинице, проживают 4 члена семьи: \n " +
                getFamilyMember1() +"\n"+
                getFamilyMember2() +"\n"+
                getFamilyMember3() +"\n"+
                getFamilyMember4();
    }
}
