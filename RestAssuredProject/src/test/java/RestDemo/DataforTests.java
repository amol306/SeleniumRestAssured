package RestDemo;

import org.testng.annotations.DataProvider;

public class DataforTests {
	@DataProvider(name = "DataPost")
	public Object[][] dataForPost() {
		// Object[][] data = new Object[2][4];
		// data[0][0] = "data00";
		// data[0][1] = "data01";
		// data[0][2] = "data02";
		// data[0][3] = "data03";
		//
		// data[1][0] = "data10";
		// data[1][1] = "data11";
		// data[1][2] = "data12";
		// data[1][3] = "data13";
		//
		// return data;

		return new Object[][] { { "data00", "data01", "data02", "data03" },
				{ "data10", "data11", "data12", "data13" } };
	}

	@DataProvider(name = "DataDelete")
	public Object[] dataForDelete() {
		return new Object[] { 1, 2 };
	}
}
