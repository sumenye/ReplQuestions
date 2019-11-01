package Assignments;

public class Repl210 {
	public class CameraPhone{
		 public int imageSize;
		 public int memorySize;

		 public CameraPhone(int imageSize, int memorySize){
		   this.imageSize = imageSize;
		   this.memorySize = memorySize;
		 }

		 public int numPictures(int memorySize, int imageSize){
		  return ( memorySize/imageSize)*1000;
		  
		 }
		}
}
