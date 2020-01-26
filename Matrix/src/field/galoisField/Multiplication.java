package field.galoisField;

enum Multiplication {
	F4(new int[][]{
		
		{0,0,0,0},
		{0,1,2,3},
		{0,2,3,1},
		{0,3,1,2}
		
	} ),

	F8(new int[][]{

		{0,0,0,0,0,0,0,0},
		{0,1,2,3,4,5,6,7},
		{0,2,4,6,5,7,1,3},
		{0,3,6,5,1,2,7,4},
		{0,4,5,1,7,3,2,6},
		{0,5,7,2,3,6,4,1},
		{0,6,1,7,2,3,4,5},
		{0,7,3,4,6,1,5,2}

	} ),
	
	F9(new int[][]{

		{0,0,0,0,0,0,0,0,0},
		{0,1,2,3,4,5,6,7,8},
		{0,2,1,6,8,7,3,5,4},
		{0,3,6,2,5,8,1,4,7},
		{0,4,8,5,6,1,7,2,3},
		{0,5,7,8,1,3,4,6,2},
		{0,6,3,1,7,4,2,8,5},
		{0,7,5,4,2,6,8,3,1},
		{0,8,4,7,3,2,5,1,6}

	} );

	private final int[][] table;
	
	private Multiplication(final int[][] table) {
		this.table = table;
	}

	/**
	 * @return the table
	 */
	public int[][] getTable() {
		return table;
	}
}