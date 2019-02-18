
public class EjemploArray1 {

	public static void main(String[] args) {
		int[][][][][][][][][][][] numeros = new int[4][4][4][4][4][4][4][4][4][4][4];
		
		
		System.out.println(numeros);
		//long num = 0;
		int cont = 0;
		for (int a = 0; a<numeros.length;a++) {
			System.out.print(a);
			for (int b = 0; b<numeros.length;b++) {
				System.out.print(b);
				for (int c = 0; c<numeros.length;c++) {
					System.out.print(c);
					for (int d = 0; d<numeros.length;d++) {
						System.out.print(d);
						for (int e = 0; e<numeros.length;e++) {
							System.out.print(e);
							for (int f = 0; f<numeros.length;f++) {
								System.out.print(f);
								for (int g = 0; g<numeros.length;g++) {
									System.out.print(g);
									for (int h = 0; h<numeros.length;h++) {
										System.out.print(h);
										for (int i = 0; i<numeros.length;i++) {
											System.out.print(i);
											for (int j = 0; j<numeros.length;j++) {
												System.out.print(j);
												for (int k = 0; k<numeros.length;k++) {
													System.out.println(k);
													/*num = num + a + b + c + d + e + f + g + h + i +j + k;
													numeros[a][b][c][d][e][f][g][h][i][j][k] = num;*/
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("");
		for (int a = 0; a<numeros.length;a++) {
			
			for (int b = 0; b<numeros.length;b++) {
				
				for (int c = 0; c<numeros.length;c++) {
					
					for (int d = 0; d<numeros.length;d++) {
						
						for (int e = 0; e<numeros.length;e++) {
							
							for (int f = 0; f<numeros.length;f++) {
								
								for (int g = 0; g<numeros.length;g++) {
									
									for (int h = 0; h<numeros.length;h++) {
										
										for (int i = 0; i<numeros.length;i++) {
											
											for (int j = 0; j<numeros.length;j++) {
												
												for (int k = 0; k<numeros.length;k++) {
													cont++;
													System.out.println(cont);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
