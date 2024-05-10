import java.io.*;
class Create {
    public static void main(String[] args) {
        try {
            File f = new File(args[0]);
            File g = new File(args[0] + "/" + args[1]);
            File h = new File(args[0] + "/" + args[1] + ".txt");
            f.mkdir(); // Verzeichnis anlegen
            g.createNewFile(); // Datei anlegen
            h.createNewFile(); // Datei anlegen
            String[] dateien = f.list(); // Verzeichniseintraege aufzaehlen
            System.out.println("Dateien im Verzeichnis " + args[0] + ":");
            for (int i=0; i<dateien.length; i++)
                System.out.println(dateien[i]);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}