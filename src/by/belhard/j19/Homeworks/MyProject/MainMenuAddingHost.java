package by.belhard.j19.Homeworks.MyProject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

import static by.belhard.j19.Homeworks.MyProject.HostService.addNewHost;
import static by.belhard.j19.Homeworks.MyProject.ServicesValidationMethods.*;

public class MainMenuAddingHost {
    public static void startHost() {
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
                        System.out.println("Enter phone");
                        String phone = io.getInputString();
                        System.out.println("Enter address");
                        String address = io.getInputString();
                        System.out.println("Enter Pet Name");
                        String petName = io.getInputString();
                        checkPetName(petName);
                        System.out.println("Enter Type Name");
                        String typename = io.getInputString();
                        checkPetType(typename);
                        checkExistingHost(petName, typename);
                        addNewHost(name, phone, address, petName , typename);
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
