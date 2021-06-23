/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.FileStorageSoapWebService.model;

/**
 *
 * @author macbookair
 */
public class FileUploadResponseDTO {

    private long filelength;
    private String fileName;
    private byte[] file;

    public FileUploadResponseDTO(long filelength, String fileName, byte[] file) {
        this.filelength = filelength;
        this.fileName = fileName;
        this.file = file;
    }

    public long getFilelength() {
        return filelength;
    }

    public void setFilelength(long filelength) {
        this.filelength = filelength;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

}
