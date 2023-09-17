class shellsort {
	public static void main(String[]args) {
		int E = 4;
		ShellShort(E);
	}
	public static void ShellShort (int nElemen) {
		int h, in, out, temp;
		int arr[] = new int[4];
		h = nElemen / 2;
			
		while (h > 0) {
			for (out = h; out < nElemen; out++) {
				temp = arr[out];
				in = out;
				while (in > h - 1 && arr[in - h] >= temp) {
					arr[in] = arr[in - h];
					in -= h;
				}
				System.out.print(" " + in);
				arr[in] = temp;
			}
			h /= 2;
		}
	}
}