package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PetService {

    private static final String insertPet =
            "insert into pets(Name, Typeid, Color, Weight, RabbiesVaccination) values (?,?,?,?,?)";

    public static void addNewPet(String name, int typeId, String color, int weight, int rabbiesVaccination) throws SQLException {

        Connection connection = DBManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(insertPet);
        statement.setString(1, name);
        statement.setInt(2, typeId);
        statement.setString(3, color);
        statement.setInt(4, weight);
        statement.setInt(5, rabbiesVaccination);

        statement.execute();
    }


    public static void getVaccinationInfo(String typeName) {
        String query1 = "Select p.id, p.name  from pets p join type t on t.id=p.typeid where RabbiesVaccination=0 and t.name = ?"; // getting animals specified type without vaccination
        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement ppst1 = connection.prepareStatement(query1); // prepare statement for select
            ppst1.setString(1, typeName); // setting type of animal
            ResultSet resultSet1 = ppst1.executeQuery();

            if (!resultSet1.isBeforeFirst()) {
                System.out.println("All pets are vaccinated");
            }

            while (resultSet1.next()) {
                System.out.print("Id of the pet is " + resultSet1.getString(1) + " : ");
                System.out.println("The Name of the pet is " + resultSet1.getString(2));
            }

        } catch (SQLException ex) {
            System.out.println("Something is wrong with database");
            ex.printStackTrace();
        }
    }


    public static void deletePet(String name, String type) {
        String findPetQuery = "Select p.Id from pets p join type t on p.TypeId = t.Id where p.Name=? and t.Name =?"; // query for finding pet in "Pets" table
        String findPetHostRelation = "Select * from pethost where petId= ?"; // query for finding pet in "pethost" table
        String deletePetFropPetHost = "Delete from pethost where petId=?"; // query for deleting pet from "pethost" table
        String deletePetQuery = "Delete from pets where id=?"; // query for deleting pet from "Pets" table
        int petId = 0;

        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement ppst1 = connection.prepareStatement(findPetQuery);
            ppst1.setString(1, name);
            ppst1.setString(2, type);
            ResultSet rs = ppst1.executeQuery();


            if (rs.next()) {
                petId = rs.getInt(1);

                PreparedStatement ppst2 = connection.prepareStatement(findPetHostRelation);
                ppst2.setInt(1, petId);
                ResultSet rs1 = ppst2.executeQuery();

                if (rs1.next()) {
                    PreparedStatement ppst3 = connection.prepareStatement(deletePetFropPetHost);
                    ppst3.setInt(1, petId);
                    ppst3.executeUpdate();

                    PreparedStatement ppst4 = connection.prepareStatement(deletePetQuery);
                    ppst4.setInt(1, petId);
                    ppst4.executeUpdate();
                } else {
                    PreparedStatement ppst4 = connection.prepareStatement(deletePetQuery);
                    ppst4.setInt(1, petId);
                    ppst4.executeUpdate();
                }

            } else {
                System.out.println("There is no such pet in database");

            }

        } catch (SQLException e) {
            System.out.println("Something wrong with database ");
            e.printStackTrace();
        }
    }

    public static boolean isPetNameExist(String petname) throws SQLException {
        String getPetName = "Select Id from pets where Name = ?";
        Connection connection = DBManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(getPetName);
        statement.setString(1, petname);
        ResultSet rs = statement.executeQuery();

        return rs.next();


    }

    public static void getPetInfo(String petName) {
//        String petInfo = "Select * from pets where Name=?";
        String typeName = "Select p.*, t.Name from type t join pets p on t.Id=p.TypeId where p.Name=? ";
        try {
            Connection connection = DBManager.getConnection();
//            PreparedStatement st1 = connection.prepareStatement(petInfo);
//            st1.setString(1, petName);
//            ResultSet rs1 = st1.executeQuery();
            PreparedStatement st2 = connection.prepareStatement(typeName);
            st2.setString(1, petName);
            ResultSet rs2 = st2.executeQuery();


            if (rs2.next()) {
                int id = rs2.getInt(1);
                String nameOfPet = rs2.getString(2);
                String color = rs2.getString(4);
                int weight = rs2.getInt(5);
                boolean vaccination = rs2.getBoolean(6);
                String nameOfType = rs2.getString(7);
                System.out.print("Id of the pet is " + id + " : ");
                System.out.println("The Name of the pet is " + nameOfPet);
                System.out.println("The type of the pet is " + nameOfType);
                System.out.println("The color of the pet is " + color );
                System.out.println("The weight  of the pet is " + weight );
                System.out.println("The vaccination of the pet is " + vaccination);
            } else {
                System.out.println("There isn't such pet in databse");
            }
        } catch (SQLException e) {
            System.out.println("Something wrong with database " + e.getMessage());
            e.printStackTrace();
        }


    }
}

