//강상님 문제풀이
public class Multifor04_01 {
	public static void main(String[] args) {
		int dan, i;
		
		for(int w=2; w<=8; w+=3) {
			
			for(i=1; i<=9; i++) {
				for(dan=w; dan<=w+2; dan++) {					
					if(dan == 10) break;
					System.out.print(dan+ "*" + i + "=" + dan*i + "\t");				
				}
				System.out.println();		
			}
			System.out.println();
		}
		
	}

}
/*
2*1=2	3*1=3	4*1=4	
2*2=4	3*2=6	4*2=8	
2*3=6	3*3=9	4*3=12	
2*4=8	3*4=12	4*4=16	
2*5=10	3*5=15	4*5=20	
2*6=12	3*6=18	4*6=24	
2*7=14	3*7=21	4*7=28	
2*8=16	3*8=24	4*8=32	

5*1=5	6*1=6	7*1=7	
5*2=10	6*2=12	7*2=14	
5*3=15	6*3=18	7*3=21	
5*4=20	6*4=24	7*4=28	
5*5=25	6*5=30	7*5=35	
5*6=30	6*6=36	7*6=42	
5*7=35	6*7=42	7*7=49	
5*8=40	6*8=48	7*8=56	

8*1=8	9*1=9	
8*2=16	9*2=18	
8*3=24	9*3=27	
8*4=32	9*4=36	
8*5=40	9*5=45	
8*6=48	9*6=54	
8*7=56	9*7=63	
8*8=64	9*8=72	

*/