import java.util.ArrayList;
import java.util.Arrays;

public class MazeCount {
    public static void main(String[] args) {
       // System.out.println(count(3,3));
        //System.out.println(path("",3,3));
        boolean [][]board={
                { true,true,true},
                { true,true,true},
                { true,true,true}
        };
        //PathRes("",board,0,0);
        //Allpath("",board,0,0);
        int [][]path=new int[board.length][board[0].length];
        AllpathPrint("",board,0,0,path,1);
    }
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    // printing path
    static ArrayList<String> path(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> l=new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> ans=new ArrayList<>();

        if( r>1){
           ans.addAll(path(p+"R",r-1,c));

        }
        if( c>1){
             ans.addAll(path(p+"D",r,c-1));
        }
        if(r>1 && c>1){
            ans.addAll(path(p+"d",r-1,c-1));
        }


        return ans;
    }

    // if path restrictions
    static void PathRes(String p, boolean[][]maze, int r,int c){
        if(r==maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r< maze.length-1){
            PathRes(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            PathRes(p+"R",maze,r,c+1);
        }
    }

    static void Allpath(String p, boolean[][]maze, int r,int c){
        if(r==maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r< maze.length-1){
            Allpath(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            Allpath(p+"R",maze,r,c+1);
        }
        if(r>0){
            Allpath(p+"U",maze,r-1,c);
        }
        if(c> 0){
            Allpath(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }

    // print all path matrix and steps
    static void AllpathPrint(String p, boolean[][]maze, int r,int c,int [][]mat,int step){
        if(r==maze.length-1 && c== maze[0].length-1){
            mat[r][c]=step;
            for(int []arr: mat){
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        mat[r][c]=step;
        if(r< maze.length-1){
            AllpathPrint(p+"D",maze,r+1,c,mat,step+1);
        }
        if(c<maze[0].length-1){
            AllpathPrint(p+"R",maze,r,c+1,mat,step+1);
        }
        if(r>0){
            AllpathPrint(p+"U",maze,r-1,c,mat,step+1);
        }
        if(c> 0){
            AllpathPrint(p+"L",maze,r,c-1,mat,step+1);
        }
        maze[r][c]=true;
        mat[r][c]=0;
    }

}
