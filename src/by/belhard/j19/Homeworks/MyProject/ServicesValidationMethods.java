package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicesValidationMethods {

    public static void checkPetName(String petname) {
        String getPetName = "Select Id from pets where Name = ?";
        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(getPetName);
            statement.setString(1, petname);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                System.out.println("The pet with such name found. Please continue");
            } else {
                System.out.println("The pet with such name doesn't exist in database");
            }

        } catch (SQLException e) {
            System.out.println("Something wrong with database " + e.getMessage());
        }
    }

    public static void checkPetType(String petType) {
        String getPetType = "Select Id from type where Name=?";
        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(getPetType);
            statement.setString(1, petType);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                System.out.println("Such type is found. Please continue");
            } else {
                System.out.println("Such type of pet doesn't exist in database");
            }
        } catch (SQLException e) {
            System.out.println("Something wrong with database " + e.getMessage());
        }


    }

    public static void checkExistingHost(String petName, String petType) {
        String getPetId = "Select HostId from pethost ph join pets p on ph.PetId= p.Id join type t on p.TypeId=t.Id  where p.Name=? and t.Name=?";

        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(getPetId);
            statement.setString(1, petName);
            statement.setString(2, petType);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                System.out.println("Chosen pet has already had the host. Are you sure to add another host to pet?");
            } else {
                System.out.println("Chosen pet doesn't have host. Please continue");

            }
        } catch (SQLException e) {
            System.out.println("Something wrong with database " + e.getMessage());
        }

    }}