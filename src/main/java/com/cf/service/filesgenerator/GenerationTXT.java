package com.cf.service.filesgenerator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerationTXT {

    public static void creationTXT(String text) {
        // ruta de archivo 
        File archivo = new File("pepepep");

        try (FileWriter writere = new FileWriter(archivo)) {
            writere.write(text);
            System.out.println("Si");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No");
        }

    }
}
