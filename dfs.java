public class DFS_B{
	
	public static int[] array = new int[10];
	
	public static void main(String[] args){
		for(int i = 0;i < array.length; i++){
			array[i] = i;
		}
		DFS(array[1]);
	}

	private static void DFS(int i) {
		if(2*i+1 > array.length)
			System.out.println(i);
		else{	
			DFS(array[2*i]);
			DFS(array[2*i+1]);
			System.out.println(i);
		}
	}
}