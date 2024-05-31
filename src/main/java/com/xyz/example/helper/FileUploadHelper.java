package com.xyz.example.helper;

import java.io.File;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
//	public final String UPLOAD_DIR="C:\\Users\\91990\\eclipse-workspace\\Incture_SpringBoot\\springboot_REST_Books\\src\\main\\resources\\static\\images";
	public final String UPLOAD_DIR= new ClassPathResource("static/images/").getFile().getAbsolutePath();
	
	public FileUploadHelper()throws IOException{}
	public boolean uploadFile(MultipartFile multipartFile) {
		boolean f = false;
		try {
			
//			InputStream is = multipartFile.getInputStream();
//			byte data[] = new byte[is.available()];
//			is.read();
//			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
//			fos.write(data);
//			fos.flush();
//			fos.close();
			
			Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			
			f=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}