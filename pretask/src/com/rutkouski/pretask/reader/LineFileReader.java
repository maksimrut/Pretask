package com.rutkouski.pretask.reader;

import java.util.List;

import com.rutkouski.pretask.exception.ReaderException;

public interface LineFileReader {
	
	public List<String> readFileLines(String filePath) throws ReaderException;
}
