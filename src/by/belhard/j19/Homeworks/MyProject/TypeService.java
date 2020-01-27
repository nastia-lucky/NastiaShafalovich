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
        }
        else {
            return null;
        }

    }

}

