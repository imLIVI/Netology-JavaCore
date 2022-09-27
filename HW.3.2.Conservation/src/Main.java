import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static final int NUM_OF_CONVERSATIONS = 3;
    public static final String ROOT = "../HW.3.1.Installation/Games/savegames/";

    public static void main(String[] args) {

        List<String> progressFiles = new ArrayList<>();

        for (int i = 0; i < NUM_OF_CONVERSATIONS; i++) {
            progressFiles.add(ROOT + "save-v" + (i + 1) + ".dat");
            saveGame(progressFiles.get(i));
        }
        zipFiles(ROOT + "progressZip.zip", progressFiles);
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
}
