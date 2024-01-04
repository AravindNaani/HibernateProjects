package com.Hnate;

import com.EmbeddedIdExp.StudentUtil;

public class Application {

	public static void main(String[] args) {
		
//		CURD_Operations.getRecord(1);
//		CURD_Operations.updateFirstname(1, "Aravi");
//		CURD_Operations.updateRecord(2, "Prabha", "Golla");
//		CURD_Operations.updateRecord(2, "Aravind", "Nimmala");
//		CURD_Operations.deleteRecord(1);
//		CURD_Operations.getAllRecords();
//		CURD_Operations.searchReacordByFirstname("Aravind");
//		CURD_Operations.searchReacordByLastname("Surineni");
//		NativeQueryExp.deleteRecordWithNativeQuery(3);
//		NativeQueryExp.searchRecordByFirstTwoCharacters("Pr");
//		NamedQueryExp.getRecords();
//		NamedQueryExp.updateRecord(1, "Aravind");
//	    StudentUtil.insertEmbeddedRecord();
		StudentUtil.readEmbeddedRecords(2);
	}

}
