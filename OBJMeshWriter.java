package assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OBJMeshWriter implements MeshWriter{

	public OBJMeshWriter() {
	}
	
	public void write(String fileName, HashSet<Polygon> polygons) throws Exception{
		
		File filetowrite = new File(fileName);
		
		filetowrite.createNewFile();
		
		BufferedWriter file_w = new BufferedWriter(new FileWriter(filetowrite, false));

		List<Vertex> allvertices = new ArrayList<Vertex>();
		
		for(Polygon polygon: polygons) {
			
			for(Vertex vertex: polygon.vertices) {
				
				if(allvertices.contains(vertex) == false) {
					allvertices.add(vertex);
				}
			}
		}
		
		String line;
		
		for(Vertex vertex: allvertices) {
			line = "v " + vertex.toString() + "\n";
			file_w.write(line);
		}
		
		
		for(Polygon polygon: polygons) {
			line = "f";
			for(Vertex vertex: polygon.vertices) {
				
				int i = 1;
				
				for(Vertex some_vertex: allvertices) {
					
					if(vertex.equals(some_vertex)) {
						line = line + " " + Integer.toString(i);
					}
					
					i = i + 1;
					
				}
			}
			
			file_w.write(line + "\n");
		}
		
		
		file_w.close();
	}
}
