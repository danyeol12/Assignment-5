package salesReport;



import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	// Variables
		private double[][] dataSet1 = { {5, 5, 8, 6, 7, 3},
										{7, 6, 2, 9, 8, 1},
										{1, 2, 3, 4, 6, 5},
										{6, 3, 9, 1, 5, 8}};
		private double[][] dataSet2 = {{7, 2, 9, 5, 4, 1},
									   {5, -8, 4, 2, 7, 6},
									   {8, 5, 3, 9, 1, 3},
									   {11, 7, 2, 4, 6, 5}};

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
			dataSet1 = null;
			dataSet2 = null;
		}

		/**
		 * Test getTotal method
		 * Returns the total of all the elements in the two dimensional array
		 */
		@Test
		public void testGetTotalSTUDENT() {
			assertEquals(120.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), .001);
		    assertEquals(108.0, TwoDimRaggedArrayUtility.getTotal(dataSet2), .001);
		}

		/**
		 * Test getAverage method
		 * Returns the average of all the elements in the two dimensional array
		 */
		@Test
		public void testGetAverageSTUDENT() {
			assertEquals(5.0, TwoDimRaggedArrayUtility.getAverage(dataSet1), .001);
		    assertEquals(4.5, TwoDimRaggedArrayUtility.getAverage(dataSet2), .001);
		}

		
		/**
		 * Test getRowTotal method
		 * Returns the total of all the elements of the row.
		 * Row 0 refers to the first row in the two dimensional array
		 */
		@Test
		public void testGetRowTotalSTUDENT() {
			assertEquals(33, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), .001);
			assertEquals(16, TwoDimRaggedArrayUtility.getRowTotal(dataSet2, 1), .001);
		}
		

		/**
		 * Test getColumnTotal method
		 * Returns the total of all the elements in the column. If a row in the two dimensional array
		 * doesn't have this column index, it is not an error, it doesn't participate in this method.
		 * Column 0 refers to the first column in the two dimensional array
		 */
		@Test
		public void testGetColumnTotalSTUDENT() {
			assertEquals(19.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0), .001);
			assertEquals(18.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet2, 2), .001);
		}
		

		/**
		 * Test getHighestInRow method
		 * Returns the largest of all the elements in the row.
		 * Row 0 refers to the first row in the two dimensional array
		 */
		@Test
		public void testGetHighestInRowSTUDENT() {
			assertEquals(8, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1,0), .001);
			assertEquals(9, TwoDimRaggedArrayUtility.getHighestInRow(dataSet2,2), .001);		
		}

		/**
		 * Test getHighestInRowIndex method
		 * Returns the index of the largest of all the elements in the row.
		 * Row 0 refers to the first row in the two dimensional array
		 */
		@Test
		public void testGetHighestInRowIndexSTUDENT() {
			assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1,0));
			assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet2,2));		
		}
		
		
		/**
		 * Test getLowestInColumn method
		 * Returns the smallest of all the elements in the column. If a row in the two dimensional array
		 * doesn't have this column index, it is not an error, it doesn't participate in this method.
		 * Column 0 refers to the first column in the two dimensional array
		 */

		@Test
		public void testGetLowestInColumnSTUDENT() {		
			assertEquals(1, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 0), .001);
		    assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet2, 2), .001);
		}

		/**
		 * Test getLowestInColumnIndex method
		 * Returns the index of the smallest of all the elements in the column. If a row in the two dimensional array
		 * doesn't have this column index, it is not an error, it doesn't participate in this method.
		 * Column 0 refers to the first column in the two dimensional array
		 */

		@Test
		public void testGetLowestInColumnIndexSTUDENT() {
			assertEquals(2, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 1));
		    assertEquals(3, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet2, 2));
		}
		

		/**
		 * Test getLowestInArray method
		 * Returns the smallest of all the elements in the two dimensional array.
		 */
		@Test
		public void testGetLowestInArraySTUDENT() {
		    assertEquals(1, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), .001);
		    assertEquals(-8, TwoDimRaggedArrayUtility.getLowestInArray(dataSet2), .001);	
		}
		
		
		
	}