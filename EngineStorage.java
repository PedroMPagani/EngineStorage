import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class EngineStorage {

    public static final Gson gson = new Gson();
    
    /**
     * Description: Overlays the readFile and converts the bytes to a string.
     * @param file File we want to convert to string.
     * @return The entire to string.
     * @throws IOException
     */

    public static String read(File file) {
        if (readFile(file) == null) return "";
        return readFile(file);
    }

    /**
     * Description: Overlays the writeFile.
     * @param file File we want to convert to string.
     * @param text Text we want to write.
     */

    public static void write(String file, String text) {
        writeFile(new File(file), text.getBytes(StandardCharsets.UTF_8), false);
    }

    /**
     * Description: Overlays the writeFile.
     * @param file File we want to convert to string.
     * @param text Text we want to write.
     */

    public static void write(File file, String text) throws IOException {
        writeFile(file, text.getBytes(StandardCharsets.UTF_8), false);
    }

    /**
     * Description: Writes data to a file using the FileOutPutStream.
     * @param file          The file we want to to write out data to.
     * @param bytes         What is being added into the file.
     * @param addLineToFile I can't recall what it's called when you add somthing to the end of the file people correct
     * @throws IOException
     */

    private static void writeFile(File file, byte[] bytes, boolean addLineToFile) {
        try {
            if (!file.exists())
                file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file, addLineToFile);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Description: Reads a file using the FileInputStream then loop through the file
     * @param file File we want to read.
     * @return The returned bytes of the file.
     * @throws IOException
     * @throws FileNotFoundException
     */

    public static String readFile(File file) {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream(file));
            byte[] bytes = new byte[(int) file.length()];
            in.readFully(bytes);
            in.close();
            return new String(bytes, 0); // ASCII text only.
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            System.out.println("Error:\n" + e.getMessage());
            return null;
        }
    }
}
