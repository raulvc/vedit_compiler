
import java.io.File;
import java.util.Arrays;

/*
 * Alguns utilitários para ajudar no parsing
 */

public class veditUtil {
    static Long stringToMs(String ext_duration){
        String[] time = ext_duration.split(":");
        Long seconds_to_ms = Long.parseLong(time[2])*1000;
        Long minutes_to_ms = Long.parseLong(time[1])*60000;
        Long hours_to_ms = Long.parseLong(time[0])*3600000;
        return seconds_to_ms + minutes_to_ms + hours_to_ms;
    }
    static Long durationInMs(File file){
        MediaInfo info = new MediaInfo();
        info.open(file);
        Long duration_in_ms = Long.parseLong(info.get(MediaInfo.StreamKind.Video, 0, "Duration", 
                MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name));        
        info.close();
        return duration_in_ms;
    }
    
    static Integer width(File file){
        MediaInfo info = new MediaInfo();
        info.open(file);
        Integer width = Integer.parseInt(info.get(MediaInfo.StreamKind.Video, 0, "Width", 
                MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name));        
        info.close();
        return width;
    }
    
    static Integer height(File file){
        MediaInfo info = new MediaInfo();
        info.open(file);
        Integer height = Integer.parseInt(info.get(MediaInfo.StreamKind.Video, 0, "Height", 
                MediaInfo.InfoKind.Text, MediaInfo.InfoKind.Name));        
        info.close();
        return height;
    }       
    
    static String removeQuotes(String quoted_str){
        return quoted_str.substring(1, quoted_str.length()-1);                 
    }
    
    static boolean canRead(File file) {
        return (file.exists() && file.canRead());
    }

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
    
    static boolean isImageFormat(String filename){
        String extension = filename.substring(filename.lastIndexOf('.')+1);    
        String[] accepted_video_formats = new String[] {"jpg","png"};
        return Arrays.asList(accepted_video_formats).contains(extension);
    }
    
    static String renameFile(String filename, String suffix){        
        String[] aux = filename.split("\\.");                
        String name = aux[0];
        String extension = aux[1];        
        return name + suffix + '.' + extension;
    }
    
}
