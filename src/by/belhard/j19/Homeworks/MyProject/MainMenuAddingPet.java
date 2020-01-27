package by.belhard.j19.Homeworks.MyProject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.NoSuchElementException;

import static by.belhard.j19.Homeworks.MyProject.PetService.addNewPet;
import static by.belhard.j19.Homeworks.MyProject.TypeService.getTypeId;

public class MainMenuAddingPet {
    public static void startPet() {
        String mainInput = "";
        IOService io = new IOService();

        do {
            try {
                io.printMainMenu();
                mainInput = io.getInputString();

                switch (mainInput) {
                    case "1":
                        System.out.println("Enter name");
                        String name = io.getInputString();
                        System.out.println("Enter type");
                        String type = io.getInputString();
                        System.out.println("Enter Color");
                        String color = io.getInputString();
                        System.out.println("Enter Weight");
                        int weight = io.getInputInt();
                        System.out.println("Enter RabbiesVaccination");
                        int vaccination = io.getInputInt();
                        int typeId = getTypeId(type);
                        addNewPet(name, typeId, color, weight,vaccination);
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "e":
                        break;
                    default:
                        System.out.println("Wrong input");
                }

            } catch (NoSuchElementException e) {
                System.err.println("There is no such entity: " + e.getMessage());
                e.printStackTrace();
            } catch (IOException | NumberFormatException | SQLException e) {
                System.err.println("Error: " + e.getMessage());
                e.printStackTrace();
            }


        }
        while (!mainInput.equals("e"));
    }}
