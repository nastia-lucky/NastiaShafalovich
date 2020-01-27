package by.belhard.j19.Homeworks.MyProject;

import java.sql.*;

public class SetName {
    public static void SetNameForAnimalsWithoutNames (String s, String s2) {    // method inputs 2 parametrs  (where s- name for selected pet, s2- type of animal) )

        String query1 = "Select MIN(p.Id) from pets p join type t on t.id=p.typeId  where p.name  is null and t.name = ?"; // Finding Id of the first animal ( by specified type)  without name
        String query2 = "Update pets set Name=? where Id=?"; // setting the name for found animal
        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement ppst1 = connection.prepareStatement(query1); // prepare statement for select
            ppst1.setString(1, s2 ); // setting type of animal
            ResultSet resultSet1 = ppst1.executeQuery();
            PreparedStatement ppst = connection.prepareStatement(query2); //prepare statement for updating Name

            if (resultSet1.next()) {
                int id = resultSet1.getInt(1);
                ppst.setString(1, s);
                ppst.setInt(2, id);
                ppst.executeUpdate();
                System.out.println("The changes are applied");
            } else {
                System.out.println("Pet with such type and name doesn't exist");
            }

        } catch (SQLException ex) {
            System.out.println("Something is wrong with database");
            ex.printStackTrace();
        }

    }
}
