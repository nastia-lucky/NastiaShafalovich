package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
