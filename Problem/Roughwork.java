import java.util.ArrayList;

public class Roughwork {
    public static void main(String[] args){
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0,2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);

        graph.printGraph();
    }
}

class Graph {
    private int vertices;
    private ArrayList<ArrayList<Integer>>adjlist;

    //constructor
    Graph(int vertices){
        this.vertices = vertices;
        adjlist = new ArrayList<>();

        for(int i=0; i<vertices;i++){
            adjlist.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination){
        adjlist.get(source).add(destination);

        //For undirected graphs
        //adjlist.get(destination).add(source);
    }

    void printGraph(){
        int i=0;
        for(i=0;i<vertices;i++){
            System.out.print(i+ "->");

            for(Integer node: adjlist.get(i)){
                System.out.print(node+ " ");
            }
            
             System.out.println();
        }
    }
}

