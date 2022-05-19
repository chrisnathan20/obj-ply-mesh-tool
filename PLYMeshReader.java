package assignment;

import java.io.FileReader;
import java.io.BufferedReader;

import java.util.*;

public class PLYMeshReader implements MeshReader{
	
	public PLYMeshReader() {
	}
	
	public HashSet<Polygon> read(String fileName) throws Exception{
		HashSet<Polygon> polygons = new HashSet<Polygon>();
		
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		
		List<String> obj_lines = new ArrayList<String>();
		
		String line = reader.readLine();
		
		while(line != null){
			obj_lines.add(line);
			line = reader.readLine();
		}
		
		reader.close();
		
		String [] tokens = obj_lines.get(2).split(" ");
		int num_vertex = (int)Double.parseDouble(tokens[2]);
		
		tokens = obj_lines.get(6).split(" ");
		int num_face = (int)Double.parseDouble(tokens[2]);
		
		
		if(num_vertex == 0 | num_face == 0) {
			return polygons;
		}
		
		List<Vertex> allvertices = new ArrayList<Vertex>();
		
		for(int i = 9; i < 9 + num_vertex; i++) {
			tokens = obj_lines.get(i).split(" ");
			Vertex vertex = new Vertex(Double.parseDouble(tokens[0]), Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
			allvertices.add(vertex);
		}
		
		
		for(int i = 9 + num_vertex; i < 9 + num_vertex + num_face; i++) {
			tokens = obj_lines.get(i).split(" ");
			
			LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
			
			for (int j = 1; j < tokens.length; j++) {
				int vertex_index =  (int)Double.parseDouble(tokens[j]);
				
				vertices.add(allvertices.get(vertex_index));
			}
			
			Polygon polygon = new Polygon(vertices);
			
			polygons.add(polygon);
		}
		return polygons;
		
	}
	
}