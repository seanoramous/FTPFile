/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpfile;

import java.util.Scanner;

/**
 *
 * @author Sean
 */
public class FTPFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is a test");
        
        //create the Scanner
        Scanner terminalInput = new Scanner(System.in);

        //read input
        String s = terminalInput.nextLine();
        System.out.println(s);
    }
    
}
