
import java.io.*; 
import java.util.*;

public class BFSgraph {
    private int Vtx;

    private LinkedList<Integer> adjMatList[];

    BFSgraph(int v){
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

    void BFS(int s){
        boolean visited[] = new boolean[Vtx]; 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        visited[s]=true; 
        queue.add(s); 
        while (queue.size() != 0) 
        { 
            s = queue.poll(); 
            System.out.print(s+" "); 
            Iterator<Integer> i = adjMatList[s].listIterator(); 
            while (i.hasNext()){ 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the number of Vertex/Nodes:\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        BFSgraph graph = new BFSgraph(size);
        int choice =1;
        while(choice>0){
            System.out.println("\nPlease Choose\n\t1.Add Edge in a Vertex\n\t2.Print Graph\n\t3.BFS Traversal\n\t4.Exit");
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
                    graph.BFS(0);
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