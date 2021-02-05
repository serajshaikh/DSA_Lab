
import java.io.*; 
import java.util.*;

public class DFSgraph {
    private int Vtx;

    private LinkedList<Integer> adjMatList[];

    DFSgraph(int v){
        Vtx = v;
        adjMatList = new LinkedList[Vtx];
        for (int i=0; i<Vtx; ++i) 
            adjMatList[i] = new LinkedList(); 
    }
    void addGraphEdge(int v, int w){ 
        adjMatList[v].add(w);  // Add w to v's list. 
    } 
    void printGraph(){
        for (int i=0; i<Vtx; ++i){
            System.out.println("At Vertex " + (i+1) + " Edges are "+ adjMatList[i]);
        }
    }

    void DFSparser(int v, boolean isVisited[]){
        
        isVisited[v] = true;
        System.out.println(v);

        Iterator<Integer> i = adjMatList[v].listIterator(); 
    

        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!isVisited[n]) 
                DFSparser(n,isVisited); 
        } 
    } 

    void DFS(){
        boolean visited[] = new boolean[Vtx]; 
        for (int i=0; i<Vtx; i++) 
            if (visited[i] == false) 
                DFSparser(i, visited); 
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of Vertex/Nodes:\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        DFSgraph graph = new DFSgraph(size);
        int choice =1;
        while(choice>0){
            System.out.println("Please Choose\n\t1.Add Edge in a Vertex\n\t2.Print Graph\n\t3.DFS Traversal\n\t4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Vertex/Nodes(1-"+size+"):\n");
                    int v = sc.nextInt();
                    if(v>size){
                        System.out.println("Invalid Vertex, Please enter correct vertex!");
                        break;
                    }
                    System.out.println("Enter Edge:\n");
                    int w = sc.nextInt();                    
                    graph.addGraphEdge(v-1, w);
                    break;
                case 2:
                    graph.printGraph();;
                    break;
                case 3:
                    graph.DFS();
                    break;
                case 4:
                    choice = -1;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }
        sc.close();
    }

    
}