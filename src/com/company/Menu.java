package com.company;

import Model.Naixement;
import com.opencsv.bean.CsvToBean;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    void start(CsvToBean<Naixement> naixementCsvToBean) {

        String menu = "";

        while (!(menu.equals("0"))){
            System.out.println("1.  Nacimientos del barrio el Raval");
            System.out.println("2.  Numero de nacimientos en Pakistan ");
            System.out.println("3.  Nacimientos en los distritos con la palabra \"Ciutat\" ");
            System.out.println("4.  Nacimientos en los paises que empiecen por 'P'");
            System.out.println("0. Sortir");

            menu = input.nextLine();
            CsvToBean<Naixement> llista = naixementCsvToBean;

            switch(menu){
                case "1":
                    llista.stream()
                            .filter(naixement -> naixement.getNom_Barri().equals("el Raval"))
                            .forEach(System.out::println);
                    break;

                case "2":
                    System.out.printf(llista.stream()
                            .filter(naixement -> naixement.getLloc_de_naixement().contains("Pakistan"))
                            .count());
                    break;

                case "3":
                    llista.stream()
                            .filter(naixement -> naixement.getNom_Districte().contains("Ciutat"))
                            .forEach(System.out::println);
                    break;

                case "4":
                    llista.stream()
                            .filter(naixement -> naixement.getLloc_de_naixement().equals("P"))
                            .forEach(System.out::println);
                    break;



            }
        }
    }
}