package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeletePet { //class with method for deleting pet from database



    public static void deletePet (int id, String name){
        String findPetQuery = "Select * from pets where id=? and Name =?"; // query for finding pet
        String deletePetQuery = "Delete from pets where id=? and Name =?"; // query for deleting pet from database if such pet exists

        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement ppst1 = connection.prepareStatement(findPetQuery);
            ppst1.setInt(1,id);
            ppst1.setString(2, name );
            ResultSet rs = ppst1.executeQuery();

            if (rs.next()){
                PreparedStatement ppst2 = connection.prepareStatement(deletePetQuery);
                ppst2.setInt(1,id);
                ppst2.setString(2, name );
                ppst2.executeQuery();
            }
            else {
                System.out.println("There isn't such pet in database");
            }

        }
        catch (SQLException e){
            System.out.println("Something wrong with database " + e.getMessage());
        }
    }
}
