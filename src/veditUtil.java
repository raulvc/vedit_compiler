
import java.io.File;
import java.util.Arrays;

/*
 * Alguns utilitários para ajudar no parsing
 */

public class veditUtil {

    static boolean canWrite(File file) {
        if (file.exists()) {
            return file.canWrite();
        } else {
            try {
                file.createNewFile();
                file.delete();
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }
    
    static boolean isVideoFormat(String filename){
        String extension = filename.substring(filename.lastIndexOf('.')+1);    
        String[] accepted_video_formats = new String[] {"mp4","avi","mpg","mkv"};
        return Arrays.asList(accepted_video_formats).contains(extension);
    }
    
}
