import java.util.Random;
public class avoidingWalk {
	public static void main(String[] args){
		boolean nomove = false;
		int porm;
		int xyorz;
		int avr=0;
		for (int a=1; a<=1;a++){
			int v=250;
			int w=250;
			int x=250;
			int y=250;
			int z=250;
			int i=0;
			boolean arr[][][][][] = new boolean [500][500][500][500][500];
			//I need 7.9 terabytes of ram.  That would cost $10900. 
			//If anyone who wants to run this program who has that much ram, that is just fine by me
			//There is no way I can run this
			//I'm not going to make a program for the 6th dimension because that would take 1.953125 petabytes of ram
			//Not even large servers have that
			while (nomove==false) {
				Random rand = new Random();
				xyorz = rand.nextInt() % 5;
				porm = (rand.nextInt() % 2 == 0) ? 1 : -1;
				if (xyorz==0)
				{
					if (arr[v][w][x+porm][y][z]==false)
					{
						x=x+porm;
						arr[v][w][x][y][z]=true;
						i++;
					}
				}
				if (xyorz==1)
				{
					if (arr[v][w][x][y+porm][z]==false)
					{
						y=y+porm;
						arr[v][w][x][y][z]=true;
						i++;
					}
				}
				if (xyorz==2)
				{
					if (arr[v][w][x][y][z+porm]==false)
					{
						z=z+porm;
						arr[v][w][x][y][z]=true;
						i++;
					}
				}
				if (xyorz==3)
				{
					if (arr[v][w+porm][x][y][z]==false)
					{
						w=w+porm;
						arr[v][w][x][y][z]=true;
						i++;
					}
				}
				if (xyorz==4)
				{
					if (arr[v+porm][w][x][y][z]==false)
					{
						w=w+porm;
						arr[v][w][x][y][z]=true;
						i++;
					}
				}
				if (arr[v][w][x][y++][z]==true&&arr[v][w][x][y--][z]==true&&arr[v][w][x++][y][z]==true&&arr[v][w][x--][y][z]==true&&arr[v][w][x][y][z++]==true&&arr[v][w][x][y][z--]==true&&arr[v][w++][x][y][z]==true&&arr[v][w--][x][y][z]==true&&arr[v++][w][x][y][z]==true&&arr[v--][w][x][y][z]==true)
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