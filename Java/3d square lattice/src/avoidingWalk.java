import java.util.Random;
public class avoidingWalk {
	public static void main(String[] args){
		boolean nomove = false;
		int porm;
		int xyorz;
		int avr=0;
		for (int a=1; a<=10000;a++){
			int x=250;
			int y=250;
			int z=250;
			int i=0;
			boolean arr[][][] = new boolean [500][500][500];
			while (nomove==false) {
				Random rand = new Random();
				xyorz = rand.nextInt() % 3;
				porm = (rand.nextInt() % 2 == 0) ? 1 : -1;
				if (xyorz==0)
				{
					if (arr[x+porm][y][z]==false)
					{
						x=x+porm;
						arr[x][y][z]=true;
						i++;
					}
				}
				if (xyorz==1)
				{
					if (arr[x][y+porm][z]==false)
					{
						y=y+porm;
						arr[x][y][z]=true;
						i++;
					}
				}
				if (xyorz==2)
				{
					if (arr[x][y][z+porm]==false)
					{
						z=z+porm;
						arr[x][y][z]=true;
						i++;
					}
				}
				if (arr[x][y++][z]==true&&arr[x][y--][z]==true&&arr[x++][y][z]==true&&arr[x--][y][z]==true&&arr[x][y][z++]==true&&arr[x][y][z--]==true)
				{
					nomove=true;
					//System.out.println(i);
					avr=avr+i;
				}
			}
			nomove=false;
		}
		System.out.println(avr);
	}
}