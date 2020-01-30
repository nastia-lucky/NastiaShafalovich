package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeService {

    public static Integer getTypeId(String s) throws SQLException {
        String getId = "Select id from type where name=?";


        Connection con = DBManager.getConnection();
        PreparedStatement statement = con.prepareStatement(getId);
        statement.setString(1, s);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            int typeId = rs.getInt(1);
            return typeId;
        } else {
            return null;
        }

    }

    public static void addNewType(String type) {

        String newType = "Insert into type(Name) value (?)";


        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement statement = connection.prepareStatement(newType);
            statement.setString(1, type);
            statement.execute();
        } catch (SQLException e) {
            System.out.println("Something wrong with database " + e.getMessage());
        }
    }

    public static boolean isPetTypeExist(String petType) throws SQLException {
        String getPetType = "Select Id from type where Name=?";

        Connection connection = DBManager.getConnection();
        PreparedStatement statement = connection.prepareStatement(getPetType);
        statement.setString(1, petType);
        ResultSet rs = statement.executeQuery();

        return rs.next();

    }
}

