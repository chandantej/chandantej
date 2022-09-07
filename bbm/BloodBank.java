import java.util.*;
class InvalidDonorBloodGroupException extends Exception{
    public InvalidDonorBloodGroupException(){
        System.out.println("Blood Group Error");
    }
}
class InvalidDonorIDException extends Exception{
    public InvalidDonorIDException(){
        System.out.println("Donor ID Error!!!");
    }
}
class BloodBank{
    private String bloodBankID;
    private String bloodBankName;
    private static Set<Donor> Donors=new HashSet<Donor>();
    //Constructor
    public  BloodBank(String bid,String bn){
        this.bloodBankID=bid;
        this.bloodBankName=bn;
    }
    //Methods
    public static boolean addNewDonor(Donor newDonor){
        boolean flag =false;
        try {
            Donors.add(newDonor);
            flag=true;
        }
        catch(Exception e){
            System.out.println("Donor not added");
        }
        return flag;
    }
    public static Donor getDonorDetails(String donorID) {
        boolean flag=false;
        Donor x=new Donor(); 
        for(Donor D:Donors){
            if (D.getdonorID().equals(donorID)){
                x=D;
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println("No Donor exists with given details");
        }
        return x;
    }
    public static boolean updateDonor(Donor updatedDonor){
        boolean flag=false;
        Donor x=updatedDonor;
        for(Donor D:Donors){
            if (D.getdonorID().equals(updatedDonor.getdonorID())){
                D=updatedDonor;
                flag=true;
                System.out.println("Donor detials updated successfully");
                break;
            }
        }
        return flag;
    }
    public boolean deleteDonor(String donorID){
        Donor x=new Donor();
        boolean flag=false;
        for(Donor D:Donors){
            if (D.getdonorID().equals(donorID)){
                x=D;
                System.out.println("Donor deleted successfully");
                break;
            }
        }
        try{
            Donors.remove(x);
            flag=true;
        }
        catch(Exception e){
            System.out.println("Donor details deletion failed");
        }
        return flag;
    }
    public static Set<Donor> getDonors(String bloodGroup){
        Set<Donor> x=new HashSet<Donor>();
        for(Donor D:Donors){
            if (D.getbloodGroup().equals(bloodGroup)){
                
                x.add(D);
                
            }
        }
        return x;
    } 
    public static void lsd(){
        System.out.println("\nThe List of Donors:\n");
        for(Donor D:Donors){
            System.out.println(D.toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b,c,bg;
        System.out.println("Enterd Donor id:");
        a=sc.nextLine();
        System.out.println("Enter Donor Name:");
        b=sc.nextLine();
        System.out.println("Enter Donor BloodGroup:");
        bg=sc.nextLine();
        System.out.println("Enter Donor Phone:");
        c=sc.nextLine();
        Donor d=new Donor(a,b,c,bg);
        System.out.println(d.toString());
        addNewDonor(d);

        d=new Donor("202","Vinci","9848032919","a+");
        addNewDonor(d);
        d=new Donor("204","Desmond","9848032929","b+");
        addNewDonor(d);
        d=new Donor("203","klaus","9848032669","b+");
        addNewDonor(d);
        d=new Donor("205","elijah","9848032659","ab+");
        addNewDonor(d);
        
        lsd();
        
        
        System.out.println("\n\n\nDonors with b+ blood");
        Set<Donor> x=getDonors("b+");
        for(Donor D:x){
              System.out.println(D.toString());
        }

        System.out.println("Enter donor id to change mobile number: ");
        String mb=sc.nextLine();
        Donor mc=getDonorDetails(mb);
        System.out.println("Update contact number\nNew Number:");
        mc.setphone(sc.nextLine());
        updateDonor(mc);
        
        lsd();


        
    }

}