import java.io.*;

public class Main {

    public static final String STATUS_SUCCESS = "successfully created";
    public static final String STATUS_EXISTS = "already exists";
    public static final String STATUS_FAIL = "fail";
    public static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {

        String[] dirGames = {"src", "res", "savegames", "temp"};
        String[] dirGamesSrc = {"main", "test"};
        String[] dirGamesSrcMain = {"Main.java", "Utils.java"};
        String[] dirGamesRes = {"drawables", "vectors", "icons"};
        String[] dirGamesTemp = {"temp.txt"};

        createDir(new File("Games"), dirGames);
        createDir(new File("Games/src"), dirGamesSrc);
        createFile(new File("Games/src/main"), dirGamesSrcMain);
        createDir(new File("Games/res"), dirGamesRes);
        createFile(new File("Games/temp"), dirGamesTemp);

        try (FileWriter writer = new FileWriter("Games/temp/temp.txt", false)) {
            writer.write(log.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createDir(File root, String[] subdir) {
        for (String subdirName : subdir) {
            File newDir = new File(root, subdirName);
            if (newDir.mkdir()) {
                buildString(root, subdirName, STATUS_SUCCESS);
            } else if (newDir.exists()) {
                buildString(root, subdirName, STATUS_EXISTS);
            } else {
                buildString(root, subdirName, STATUS_FAIL);
            }
        }
    }

    public static void createFile(File root, String[] files) {
        for (String fileName : files) {
            File newFile = new File(root, fileName);
            try {
                if (newFile.createNewFile()) {
                    buildString(root, fileName, STATUS_SUCCESS);
                } else if (newFile.exists()) {
                    buildString(root, fileName, STATUS_EXISTS);
                } else {
                    buildString(root, fileName, STATUS_FAIL);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void buildString(File root, String fileName, String status) {
        log.append(String.format("%-25s%25s\n", root + "\\" + fileName, status));
    }
}
