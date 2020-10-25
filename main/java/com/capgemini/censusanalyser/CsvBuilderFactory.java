package com.capgemini.censusanalyser;

public class CsvBuilderFactory {
	public static ICsvBuilder createBuilder() {
		return (ICsvBuilder) new OpenCsvBuilder();
	}

}
