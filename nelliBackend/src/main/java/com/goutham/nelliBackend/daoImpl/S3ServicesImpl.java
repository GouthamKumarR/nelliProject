package com.goutham.nelliBackend.daoImpl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.rekognition.model.S3Object;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.goutham.nelliBackend.dao.S3Services;

@Service
public class S3ServicesImpl implements S3Services {

	private Logger logger = LoggerFactory.getLogger(S3ServicesImpl.class);

	@Autowired
	private AmazonS3 s3client;

	private String bucketName = "gouthams3-bucket";

	@Override
	public String uploadFile(MultipartFile files,String name) {

		try {
			InputStream is = files.getInputStream();

			//File file = multipartToFile(files);
			//s3client.putObject(new PutObjectRequest(bucketName, files.getOriginalFilename(), file));
			s3client.putObject(new PutObjectRequest(bucketName, name+files.getOriginalFilename(), is, new ObjectMetadata()).withCannedAcl(CannedAccessControlList.PublicRead));
			com.amazonaws.services.s3.model.S3Object s3object = s3client.getObject(new GetObjectRequest(bucketName,name+files.getOriginalFilename()));
			String url = s3object.getObjectContent().getHttpRequest().getURI().toString();
			logger.info("===================== Upload File - Done! =====================");
			return url;

		} catch (AmazonServiceException ase) {
			logger.info("Caught an AmazonServiceException from PUT requests, rejected reasons:");
			logger.info("Error Message:    " + ase.getMessage());
			logger.info("HTTP Status Code: " + ase.getStatusCode());
			logger.info("AWS Error Code:   " + ase.getErrorCode());
			logger.info("Error Type:       " + ase.getErrorType());
			logger.info("Request ID:       " + ase.getRequestId());
			return null;
		} catch (AmazonClientException ace) {
			logger.info("Caught an AmazonClientException: ");
			logger.info("Error Message: " + ace.getMessage());
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}   
	
}
