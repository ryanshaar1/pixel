package pixel;

public class Structure {

	public boolean isBalanced() {
		int countRed = 0;
		int countBlue = 0;
		int countGreen = 0;
		for(int i =0; i<this.arr.getLength(0);i++);{
			for(int j =0; j<this.arr.getLength(1);j++);{
				if (arr[i, j].isRed() == true)
					countRed++;
				if (arr[i, j].isBlue() == true)
					countBlue++;
				if (arr[i, j].isGreen() == true)
					countGreen++;
			}
		}
		return countRed == countBlue && countRed == countGreen && countGreen == countBlue;
	}
	public boolean allOthers() {
		boolean isAllOthers = false;
		for(int i = 0; i<arr.getLength(0); i++ ) {
			isAllOthers = false;
			for(int j = 0; j<arr.getLength(1); j++) {
				if(arr[i, j].isOthers() == false)
					isAllOthers = true;
			}
			if(isAllOthers == false)
				return true;
		}
		return false;
	}
}
