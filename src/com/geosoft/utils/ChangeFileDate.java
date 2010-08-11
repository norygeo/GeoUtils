import java.io.*;
import java.util.*;

import java.text.*;

public class ChangeFileDate{

  public static void main(String[] args) {
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter file name with extension:");

      String str = bf.readLine();
      System.out.println("Enter last modified date in 'dd-mm-yyyy' format:");
      String strDate = bf.readLine();

      SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");

      Date date = sdf.parse(strDate);

      File file = new File(str);

      if (file.exists()){
         file.setLastModified(date.getTime());
  	     System.out.println("Modification is successfully!");
      }
      else{
        System.out.println("File does not exists!");
      }
  }
    catch(Exception e){
    e.printStackTrace();
  }
 }
}
