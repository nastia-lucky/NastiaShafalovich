package by.belhard.j19.Homeworks.MyProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetAnimalWithoutVaccination {

    public static void getVaccinationInfo(String typeName) {
        String query1 = "Select p.id, p.name  from pets p join type t on t.id=p.typeid where RabbiesVaccination=0 and t.name = ?"; // getting animals specified type without vaccination
        try {
            Connection connection = DBManager.getConnection();
            PreparedStatement ppst1 = connection.prepareStatement(query1); // prepare statement for select
            ppst1.setString(1, typeName); // setting type of animal
            ResultSet resultSet1 = ppst1.executeQuery();

            if (!resultSet1.isBeforeFirst() ) {
                System.out.println("Such animals don't exist");
            }

            while (resultSet1.next()){
                System.out.print("Id of the dog is " + resultSet1.getString(1)+" : ");
                System.out.println ("The Name of the dog is " + resultSet1.getString(2));
            }

        } catch (SQLException ex) {
            System.out.println("Something is wrong with database");
            ex.printStackTrace();
        }
    }

}
