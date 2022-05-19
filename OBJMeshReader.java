package assignment;

import java.io.FileReader;
import java.io.BufferedReader;

import java.util.*;

public class OBJMeshReader implements MeshReader{
	
	public OBJMeshReader() {
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
		
		for(String obj_line: obj_lines) {
			
			String[] tokens = obj_line.split(" ");
			if(tokens[0].equals("f")) {
				LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();
				
				for (int i = 1; i < tokens.length; i++) {
					int vertex_line = (int)Double.parseDouble(tokens[i])- 1;
					
					String[] vertex_tokens = obj_lines.get(vertex_line).split(" ");
					
					Vertex vertex = new Vertex(Double.parseDouble(vertex_tokens[1]), Double.parseDouble(vertex_tokens[2]), Double.parseDouble(vertex_tokens[3]));
					
					vertices.add(vertex);
				}
				
				Polygon polygon = new Polygon(vertices);
				
				polygons.add(polygon);
			}
			
		}
		
		
		return polygons;
		
	}
	
}