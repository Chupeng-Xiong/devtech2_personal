import java.sql.*;
Class DevTech2Part1{
  public static void main(String args[]){
    try{
      connection dbCxn=DriverManager.getConnection(
        "jbdc:mysql://localhost:53396/BoatsAndSailors","root","flappy_fish"  
      );

      String boatQuery = "select * from Boat";
      System.out.println(boatQuery);
      Statement selectFromBoat=dbCxn.createStatement();
      ResultsSet rsBoat=selectFromBoat.executeQuery(boatQuery);
      while(rsBoat.next()) {
        System.out.println(rsBoat.getInt(1)
                + " " + rsBoat.getString(2)                  
                + " " + rsBoat.getString(3)
                + " " + rsBoat.getString(4)
        );
      }
      dbCxn.close();
    }catch(Exception e) {System.out.println(e);}
  }
}
