public class Donor{
    private String donorID;
    private String DonorName;
    private String phone;
    private String bloodGroup;
    //getter and setters
    public void setdonorID(String donorID){
        this.donorID=donorID;
    }
    public String getdonorID(){
        return this.donorID;
    }
    public void setDonorName(String DonorName){
        this.DonorName=DonorName;
    }
    public String getDonorName(){
        return this.DonorName;
    }
    public void setphone(String phone){
        this.phone=phone;
    }
    public String getphone(){
        return this.phone;
    }
    public void setbloodGroup(String bloodGroup){
        this.bloodGroup=bloodGroup;
    }
    public String getbloodGroup(){
        return this.bloodGroup;
    }
    public Donor(){}
    
    public Donor(String Id,String name,String phone, String bg){
        this.donorID=Id;
        this.DonorName=name;
        this.phone=phone;
        this.bloodGroup=bg;
    }   
    public String toString(){
        return "\nDonor Name:"+this.DonorName+"\nDonorID:"+this.donorID+"\nBlood Group:"+this.bloodGroup+"\nPhone:"+this.phone;
    }
}