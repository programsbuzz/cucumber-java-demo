package com.pb.cucumbertest.util;

import com.pb.cucumbertest.helper.Constants;

public class ExtentUtil {
	public static String getReportConfigPath() {
		String reportConfigPath = Constants.EXTENT_CONFIG_PATH;
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException("Report Config Path not specified");
	}

//	private ExtentReports createReport() {
//		return null;
//     
//    }
//     
//    private void flushReports(ExtentReports extent, ExtentTest test){
//        extent.flush();
//    }
//     

}
