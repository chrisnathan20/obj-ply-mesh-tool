package assignment;

abstract class GraphicalObject {
	
	abstract void transform(double[][] t_matrix);
	
	public void rotateXAxis(double teta) {
		double[][] t_matrix = {{1, 0, 0}, {0, Math.cos(teta), -Math.sin(teta)}, {0, Math.sin(teta), Math.cos(teta)}};
		transform(t_matrix);
	}
	
	public void rotateYAxis(double teta) {
		double[][] t_matrix = {{Math.cos(teta), 0, Math.sin(teta)}, {0, 1, 0}, {-Math.sin(teta), 0, Math.cos(teta)}};
		transform(t_matrix);
	}
	
	public void rotateZAxis(double teta) {
		double[][] t_matrix = {{Math.cos(teta), -Math.sin(teta), 0}, {Math.sin(teta), Math.cos(teta), 0}, {0, 0, 1}};
		transform(t_matrix);
	}
}
