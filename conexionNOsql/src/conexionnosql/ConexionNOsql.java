/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionnosql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 54117
 */
public class ConexionNOsql {

    public static void main(String[] args) {
        FileInputStream serviceAccount;
        try {
            serviceAccount = new FileInputStream("path/to/serviceAccountKey.json");
        
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://miproyect-d6a44-default-rtdb.firebaseio.com")
                .build();
        FirebaseApp.initializeApp(options);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConexionNOsql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
