package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static by.belhard.j19.Homeworks.MyProject.TypeService.getTypeId;

public class HostService {   // service for adding host for chosen pet
    private static final String insertHost =
            "insert into hosts (Name, Phone, Address) values (?,?,?)"; //query for adding host
    private static final String insertHostPet =  "Insert into pethost values (?,?)"; // query for insert the relation host- pet
    private static final String getAddedHost = "Select id from hosts where name=? and phone =?"; // query for getting id of added host
    private static final String getPetId = "Select id from pets where name=? and TypeId=?";
    private static int hostId=0; //id of inserted host
    private static int typeId =0; // typeId of pet
    private static int petId =0; // id of pet

    public static void addNewHost(String hostName, String hostPhone, String hostAddress, String petName, String petType  ) throws SQLException { // "String name, String phone, String address" - data for new host ,  int id, String name2- data for chosen pet for

        Connection connection = DBManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(insertHost);
        statement.setString(1, hostName);
        statement.setString(2, hostPhone);
        statement.setString(3, hostAddress);
        statement.execute();

        PreparedStatement statement2 = connection.prepareStatement(getAddedHost);
        statement2.setString(1, hostName);
        statement2.setString(2, hostPhone);
        ResultSet rs=statement2.executeQuery();

        if (rs.next()){
            hostId= rs.getInt(1);
        }
        else{
            System.out.println("There isn't such host in database");
        }

        typeId= getTypeId (petType);

        PreparedStatement statement3 = connection.prepareStatement(getPetId);
        statement3.setString(1, petName );
        statement3.setInt(2, typeId );
        ResultSet rs2 = statement3.executeQuery();

        if (rs2.next()){
            petId= rs2.getInt(1);
            PreparedStatement statement4 = connection.prepareStatement(insertHostPet);
            statement4.setInt(1, petId);
            statement4.setInt(2, hostId);
            statement4.execute();

        }
        else {
            System.out.println("There isn't such pet in database");
        }



    }
}
