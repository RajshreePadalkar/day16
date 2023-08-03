package com.gurukul.Day16;

public class celebrity {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int mat[][] = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, { 0, 0, 0, 0 } };
	char s = findCelebrity(mat);
	System.out.print(s);

    }

    private static char findCelebrity(int[][] mat) {
	// TODO Auto-generated method stub

	int count[] = new int[4], res = -1;
	for (int i = 0; i < mat.length; i++) {
	    for (int j = 0; j < mat.length; j++) {
		if (mat[i][j] == 0) {
		    count[i] += 1;
		}
	    }
	}
	for (int i = 1; i < mat.length; i++) {
	    if (count[i - 1] > count[i])
		res = count[i - 1];
	    else
		res = count[i];
	}
	return (char) (res + 64);
    }

}
