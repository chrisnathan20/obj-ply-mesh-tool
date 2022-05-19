package assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PLYMeshWriter implements MeshWriter{
	
	public PLYMeshWriter() {
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
		
		int num_vert = allvertices.size();
		int num_poly = polygons.size();
		
		file_w.write("ply\n");
		file_w.write("format ascii 1.0\n");
		file_w.write("element vertex " + Integer.toString(num_vert) + "\n");
		file_w.write("property float32 x\n");
		file_w.write("property float32 y\n");
		file_w.write("property float32 z\n");
		file_w.write("element face " + Integer.toString(num_poly) + "\n");
		file_w.write("property list uint8 int32 vertex_indices\n");
		file_w.write("end_header\n");

		String line;
		
		for(Vertex vertex: allvertices) {
			line = vertex.toString() + "\n";
			file_w.write(line);
		}
		
		for(Polygon polygon: polygons) {
			line = "";
			for(Vertex vertex: polygon.vertices) {
				
				Integer i = 0;
				
				for(Vertex some_vertex: allvertices) {
					
					if(vertex.equals(some_vertex)) {
						
						
						line = line + " " + Integer.toString(i);
					}
					
					i = i + 1;
					
				}
			}
			
			file_w.write(Integer.toString(polygon.vertices.size()) + line + "\n");
		}
		
		
		file_w.close();
	}

}
