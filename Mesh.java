package assignment;

import java.util.*;

public class Mesh extends GraphicalObject{
	
	HashSet<Polygon> polygons;
	MeshReader reader;
	MeshWriter writer;
	
	public Mesh() {
		polygons = new HashSet<Polygon>();
	}
	
	public void setReader(MeshReader reader) {
		this.reader = reader;
	}
	
	public void setWriter(MeshWriter writer) {
		this.writer = writer;
	}
	
	public void readFromFile(String fileName){
		try {
			polygons = reader.read(fileName);
		} catch(Exception e) {
			System.out.println("readFromFile fails");
		}
	}
	
	public void writeToFile(String fileName){
		try {
			writer.write(fileName, polygons);
		} catch(Exception e) {
			System.out.println("writeToFile fails");
		}
	}
	
	public void transform(double[][] t_matrix) {

		for (Polygon polygon: polygons) {
			polygon.transform(t_matrix);
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
		
		Mesh other = (Mesh) obj;
		
		if(polygons.size() != other.polygons.size())
			return false;
		
			
		for (Polygon polygon: polygons) {

			if(other.polygons.contains(polygon) == false) 
				return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash;
		hash = 0;
		for (Polygon poly: polygons) {
			hash = hash + poly.hashCode();
		}
		return hash;
	}
}
