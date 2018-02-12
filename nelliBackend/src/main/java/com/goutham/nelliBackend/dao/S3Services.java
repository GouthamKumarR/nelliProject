package com.goutham.nelliBackend.dao;

import org.springframework.web.multipart.MultipartFile;

public interface S3Services {
	//public void uploadFile(String keyName, String uploadFilePath);

	public String uploadFile(MultipartFile file,String name);
}
