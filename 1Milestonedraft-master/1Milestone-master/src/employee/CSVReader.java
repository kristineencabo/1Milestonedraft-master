/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.nio.Buffer;

/**
 *
 * @author jpaha
 */
class CSVReader {
    public static void main(String[] args) {
        String Path = "C:\\Users\\User\\Downloads\\1Milestone-master\\src\\Attendance Record.csv";

        try {
            BufferedReader br = new BufferedReader(new FileReader(Path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
