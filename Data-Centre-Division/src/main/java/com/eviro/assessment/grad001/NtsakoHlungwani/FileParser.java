package com.eviro.assessment.grad001.NtsakoHlungwani;

/*
import java.io.File;
import java.net.URI;
public interface FileParser {
void parseCSV(File csvFile);
File convertCSVDataToImage(String base64ImageData);
URI createImageLink(File fileImage);

}
*/



import org.springframework.stereotype.Service;
import java.io.File;
import java.net.URI;

@Service
public class FileParserImpl implements FileParser {

    @Override
    public void parseCSV(File csvFile) {
        // Implement CSV parsing logic here
    }

    @Override
    public File convertCSVDataToImage(String base64ImageData) {
        // Implement image conversion logic here
    }

    @Override
    public URI createImageLink(File fileImage) {
        // Implement image link creation logic here
    }
}
