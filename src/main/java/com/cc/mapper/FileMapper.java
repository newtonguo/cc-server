package com.cc.mapper;

import java.util.List;

import com.cc.entity.File;

public abstract interface FileMapper {
	public abstract List<File> listPageFile(File paramFile);

	public abstract Integer getFileCount();

	public abstract void insertFile(File paramFile);

	public abstract File getFileById(Integer paramInteger);

	public abstract File getFile(File paramFile);

	public abstract void updateFile(File paramFile);

	public abstract void deleteFile(File paramFile);

	public abstract void deleteFileByIds(String[] paramArrayOfString);
}