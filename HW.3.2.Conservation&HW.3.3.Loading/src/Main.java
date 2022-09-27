import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Main {
    public static final int NUM_OF_CONVERSATIONS = 3;
    public static final String PATH_ROOT = "../HW.3.1.Installation/Games/savegames/";
    public static final String NAME_ZIP = "progressZip.zip";
    public static final String NAME_FILE = "save-v";
    public static final String EXPANSION_FILE = ".dat";

    public static void main(String[] args) {

        /**
         * HW.3.2.Conversation
         */
        List<String> progressFiles = new ArrayList<>();

        for (int i = 0; i < NUM_OF_CONVERSATIONS; i++) {
            progressFiles.add(PATH_ROOT + NAME_FILE + (i + 1) + EXPANSION_FILE);
            saveGame(progressFiles.get(i));
        }
        zipFiles(PATH_ROOT + NAME_ZIP, progressFiles);

        /**
         * HW.3.3.Loading*
         */
        openZip(PATH_ROOT + NAME_ZIP);
    }

    public static GameProgress createGameProgress() {
        Random random = new Random();
        return new GameProgress(random.nextInt(100), random.nextInt(50_000),
                random.nextInt(100), random.nextInt(100_000));
    }

    public static void saveGame(String path) {
        GameProgress progress = createGameProgress();

        try (FileOutputStream fis = new FileOutputStream(path);
             ObjectOutputStream ois = new ObjectOutputStream(fis)) {
            ois.writeObject(progress);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void zipFiles(String pathToZip, List<String> filesPath) {
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(pathToZip))) {
            for (String fp : filesPath) {
                try (FileInputStream fis = new FileInputStream(fp)) {
                    ZipEntry entry = new ZipEntry(fp);
                    zout.putNextEntry(entry);
                    byte[] buf = new byte[fis.available()];
                    fis.read(buf);
                    zout.write(buf);
                    zout.closeEntry();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void openZip(String pathToZip) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(pathToZip))) {
            ZipEntry entry;
            String name;
            while ((entry = zis.getNextEntry()) != null) {
                name = entry.getName();
                FileOutputStream fot = new FileOutputStream(name);
                for (int i = zis.read(); i != -1; i = zis.read()) {
                    fot.write(i);
                }
                fot.flush();
                zis.closeEntry();
                fot.close();

                // Deserialization
                System.out.println(openProgress(name).toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameProgress openProgress(String pathToFile) {
        GameProgress gameProgress = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathToFile))) {
            gameProgress = (GameProgress) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return gameProgress;
    }
}
