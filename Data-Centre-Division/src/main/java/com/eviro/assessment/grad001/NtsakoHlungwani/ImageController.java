package com.eviro.assessment.grad001.NtsakoHlungwani;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/image")
public class ImageController {

@GetMapping(value = "/{name}/{surname}/{\\w\\.\\w}")
public FileSystemResource gethttpImageLink(@PathVariable String name, @PathVariable String surname, @PathVariable String fileName){
    //return the result
    // Build the path to the image file based on name, surname, and fileName
    String imagePath = "your_image_directory/" + name + "/" + surname + "/" + fileName;

    // Create a File object with the image path
    File imageFile = new File(imagePath);
// Check if the file exists
    if (imageFile.exists()) {
        return new FileSystemResource(imageFile);
    } else {
        // Handle the case where the image file does not exist
        // You can return an appropriate response or throw an exception
        // For example, you can return a 404 Not Found response
        return null; // Modify this part as per your needs
    }
}