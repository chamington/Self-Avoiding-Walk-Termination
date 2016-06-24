import java.util.Random;
public class avoidingWalk {
	public static void main(String[] args){
		boolean nomove = false;
		int porm;
		boolean xory;
		int avr=0;
		for (int a=1; a<=1000;a++){
			int x=250;
			int y=250;
			int i=0;
			boolean arr[][] = new boolean [500][500];
			while (nomove==false) {
				Random rand = new Random();
				xory = (rand.nextInt() % 2 == 0) ? true : false;
				porm = (rand.nextInt() % 2 == 0) ? 1 : -1;
				if (xory==true)
				{
					if (arr[x+porm][y]==false)
					{
						x=x+porm;
						arr[x][y]=true;
						i++;
					}
				}
				if (xory==false)
				{
					if (arr[x][y+porm]==false)
					{
						y=y+porm;
						arr[x][y]=true;
						i++;
					}
				}
				if (arr[x][y++]==true&&arr[x][y--]==true&&arr[x++][y]==true&&arr[x--][y]==true)
				{
					nomove=true;
					System.out.println(i);
					avr=avr+i;
				}
			}
			nomove=false;
		}
		System.out.println(avr);
	}
}