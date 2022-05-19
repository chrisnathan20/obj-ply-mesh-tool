package assignment;

public class Vertex extends GraphicalObject{
	
	double x;
	double y;
	double z;
	
	public Vertex() {
	}
	
	public Vertex(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void transform(double[][] t_matrix) {
		double temp_x = t_matrix[0][0]*x + t_matrix[0][1]*y + t_matrix[0][2]*z;
		double temp_y = t_matrix[1][0]*x + t_matrix[1][1]*y + t_matrix[1][2]*z;
		double temp_z = t_matrix[2][0]*x + t_matrix[2][1]*y + t_matrix[2][2]*z;
		
		x = (double)Math.round(temp_x*1000000)/1000000;
		y = (double)Math.round(temp_y*1000000)/1000000;
		z = (double)Math.round(temp_z*1000000)/1000000;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		
		double tempx = (double)Math.round(x*1000000)/1000000;
		double tempy = (double)Math.round(y*1000000)/1000000;
		double tempz = (double)Math.round(z*1000000)/1000000;
		
		double tempotherx = (double)Math.round(other.x*1000000)/1000000;
		double tempothery = (double)Math.round(other.y*1000000)/1000000;
		double tempotherz = (double)Math.round(other.z*1000000)/1000000;
		
		if (tempx == tempotherx && tempy == tempothery && tempz == tempotherz) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int)(11*x + 23*y + 31*z);
	}
	
	@Override
	public String toString() {
		return (Double.toString(x) + " " + Double.toString(y) + " " + Double.toString(z));
	}

}
