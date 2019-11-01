package Assignments;

public class TV {
	private int channel=1;
	 private int volumeLevel=1;
	 private boolean on;
	 private String brand = "undefined";
	 
	 public TV(){
	   System.out.println("Creating TV object using no Args- constructor");
	 }
	 public TV(String brand){
	   this.brand=brand;
	   System.out.println("Creating TV object using 1 arg - constructor");
	 }
	 
	 public int getVolumeLevel(){
	   return volumeLevel;
	 }
	  public void setVolumeLevel( int volumeLevel){
		  // if(on){
		   if(volumeLevel>0 && volumeLevel<8) {
		   this.volumeLevel=volumeLevel;}
	    // }
		   else 
		   System.out.println("ERROR: TV is either OFF or invalid Volume level");
		 }
	  public int getChannel(){
	   return channel;
	 }
	 public void setChannel( int channel){
	   if(on==true){
	   if(channel>0 && channel<=120){
	   this.channel=channel;}}
	   else
	   System.out.println("ERROR: TV is either OFF or invalid Channel");
	 }
	   public String getBrand(){
	   return brand;
	 }
	 public void setBrand( String brand){
	   this.brand=brand;
	 }

	public void channelUp(){
	   if (channel<120 && on)
	   channel++;
	   else 
	   System.out.println(
	     "ERROR: TV is either OFF or invalid Channel");
	}
	public void channelDown(){
	   if (channel>1 && on) channel--;
	   else System.out.println(
	     "ERROR: TV is either OFF or invalid Channel");
	}
	public void volumeUp(){
	    if (volumeLevel<7 && on) volumeLevel++;
	   else System.out.println(
	     "ERROR: TV is either OFF or invalid Volume level");
	}
	public void volumeDown(){
	     if (volumeLevel>1 && on) 
	     volumeLevel--;
	   else System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	public boolean isOn(){
	  return on;
	}
	 public void turnOn(){
	   if (on==true) {
	     System.out.println("TV is already ON");}
	   else on=true;
	 }
	public void turnOff(){
	    if (on==false) {
	     System.out.println("TV is already OFF");}
	   else on=false;
	}
}
