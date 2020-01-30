package by.belhard.j19.Homeworks.MyProject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

import static by.belhard.j19.Homeworks.MyProject.HostService.addNewHost;
import static by.belhard.j19.Homeworks.MyProject.HostService.getGetHostByPet;
import static by.belhard.j19.Homeworks.MyProject.PetService.*;
import static by.belhard.j19.Homeworks.MyProject.TypeService.*;

public class MainMenu {
    public static void start() {
        String mainInput = "";
        IOService io = new IOService();

        do {
            try {
                io.printMainMenu();
                mainInput = io.getInputString();

                switch (mainInput) {
                    case "1":
                        System.out.println("Enter Pet Name");
                        String petName1 = io.getInputString();
                        String type1;
                        while (true) {
                            System.out.println("Enter Pet Type");
                            type1 = io.getInputString();
                            if (isPetTypeExist(type1)) {
                                System.out.println("Such type is found.");
                            } else {
                                System.out.println("Such type of pet doesn't exist in database. Do you want to add new type of pet?");
                                String answer = io.getInputString();
                                if ("yes".equals(answer)) {
                                    addNewType(type1);
                                } else {
                                    continue;
                                }
                            }
                            break;
                        }
                        System.out.println("Enter Pet Color");
                        String color = io.getInputString();
                        System.out.println("Enter Pet Weight");
                        int weight = io.getInputInt();
                        System.out.println("Enter RabbiesVaccination: Please input 1 if a pet is vaccinated and 0 - if not");
                        int vaccination = io.getInputInt();
                        int typeId = getTypeId(type1);
                        addNewPet(petName1, typeId, color, weight, vaccination);
                        break;

                    case "2":
                        System.out.println("Enter Host Name");
                        String hostName1 = io.getInputString();
                        System.out.println("Enter Host Phone");
                        String phone = io.getInputString();
                        System.out.println("Enter Host address");
                        String address = io.getInputString();
                        System.out.println("Enter Pet Name");
                        String petNameForHost = io.getInputString();
                        if (isPetNameExist(petNameForHost)) {
                            System.out.println("Enter Type Name");
                            String typename = io.getInputString();
                            if (isPetTypeExist(typename)) {
                                addNewHost(hostName1, phone, address, petNameForHost, typename);
                                System.out.println("Pet is added to Host");
                                break;
                            } else {
                                System.out.println(petNameForHost + "has another type");
                                break;
                            }
                        } else {
                            System.out.println("Such pet name doesn't exist");
                            break;
                        }
                    case "3":
                        System.out.println("Enter Pet Type");
                        String typename2 = io.getInputString();
                        if (isPetTypeExist(typename2)) {
                            getVaccinationInfo(typename2);
                            break;
                        } else {
                            System.out.println("Such type doesn't exist in database");
                        }
                    case "4":
                        System.out.println("Enter Pet Name");
                        String petName2 = io.getInputString();
                        if (isPetNameExist(petName2)) {
                            System.out.println("Enter Pet Type");
                            String petType = io.getInputString();
                            if (isPetTypeExist(petType)) {
                                deletePet(petName2, petType);
                                break;
                            } else {
                                System.out.println("Such type doesn't exist in database");
                            }
                        } else {
                            System.out.println("Such pet name doesn't exist");
                            break;
                        }
                    case "5":
                        System.out.println("Enter Pet Name");
                        String petName3 = io.getInputString();
                        if (isPetNameExist(petName3)) {
                            System.out.println("Enter Pet Type");
                            String petType2 = io.getInputString();
                            if (isPetTypeExist(petType2)) {
                                getGetHostByPet(petName3, petType2);
                                break;
                            } else {
                                System.out.println("Such type doesn't exist in database");
                            }
                        } else {
                            System.out.println("Such pet name doesn't exist");
                            break;
                        }
                    case "6":
                        System.out.println("Enter Pet Name");
                        String petName4 = io.getInputString();
                        if (isPetNameExist(petName4)) {
                            getPetInfo(petName4);
                            break;
                        } else {
                            System.out.println("Such pet name doesn't exist");
                            break;
                        }
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
    }
}
