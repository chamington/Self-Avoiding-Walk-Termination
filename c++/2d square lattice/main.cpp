#include <iostream>
using namespace std;

int main(int argc, const char * argv[]) {
    
    srand (time(NULL));
    //for (int k=1;k<=1000000;k++){
            //used to loop the code many times, optional
    bool nomove = false;
    int porm;
    bool xory;
    int avr=0;
    for (int a=1; a<=1000;a++){
        int x=250;
        int y=250;
        int i=0;
        bool arr[500][500]={};
        while (nomove==false){
            xory = (rand() % 2 == 0) ? true : false;
            porm = (rand() % 2 == 0) ? 1 : -1;
            if (xory==true){
                if (arr[x+porm][y]==false){
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
                //cout << i << endl;
                avr=avr+i;
            }
        }
        nomove=false;
    }
    cout << avr << endl;
    //}
    return 0;
}
