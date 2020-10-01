package codeSignal.Intro;

public class Ejercicio_7 {
	public static void main(String args[]) {
		int[] sequence = {1,2,1,2};
		System.out.print(AlmostIncreasingSequence(sequence));
	}
	
	static boolean AlmostIncreasingSequence (int[] sequence) {
		boolean estrict=true;
		int countFaults=0;
		//int aux=sequence[0];
		for (int i=1;i<sequence.length;i++) {
			if (sequence[i-1]>sequence[i]) {
				countFaults++;
			}
			System.out.print(sequence[i-1]+" ");
			System.out.println(sequence[i]);
		}
		if (countFaults>1) {
			estrict=false;
		}
		return estrict;
	}
}
