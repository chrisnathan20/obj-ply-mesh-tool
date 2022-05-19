package assignment;

import java.util.*;

public class Polygon extends GraphicalObject{

	LinkedHashSet<Vertex> vertices;
	
	public Polygon() {
	}
	
	public Polygon(LinkedHashSet<Vertex> new_vertices) {
		
		vertices = new LinkedHashSet<Vertex>();
		
		for (Vertex v: new_vertices) {
			vertices.add(v);
		}
	}
	
	public void transform(double[][] t_matrix) {

		for (Vertex v: vertices) {
			v.transform(t_matrix);
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Polygon other = (Polygon) obj;
		
		if(vertices.size() != other.vertices.size())
			return false;
					
		for (Vertex v: vertices) {

			if(other.vertices.contains(v) == false) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash;
		hash = 0;
		for (Vertex v: vertices) {
			hash = hash + v.hashCode();
		}
		return hash;
	}
}
