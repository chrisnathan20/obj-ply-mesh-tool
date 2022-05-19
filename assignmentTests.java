package assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class assignmentTests {

	@Test
	void VertexConstructorX() {
		Vertex vert = new Vertex(1, 2, 3);
		assertEquals(vert.x, 1);
	}
	
	@Test
	void VertexConstructorY() {
		Vertex vert = new Vertex(1, 2, 3);
		assertEquals(vert.y, 2);
	}
	
	@Test
	void VertexConstructorZ() {
		Vertex vert = new Vertex(1, 2, 3);
		assertEquals(vert.z, 3);
	}
	
	@Test
	void VertexNoArgumentConstructor() {
		Vertex vert = new Vertex();
		assertNotEquals(vert, null);
	}
	
	@Test
	void VertexEqualsTestOne() {
		Vertex vert = new Vertex(1, 2, 3);
		assertTrue(vert.equals(vert));
	}
	
	@Test
	void VertexEqualsTestTwo() {
		Vertex vert = new Vertex(1, 2, 3);
		assertFalse(vert.equals(null));
	}
	
	@Test
	void VertexEqualsTestThree() {
		Vertex vert = new Vertex(1, 2, 3);
		assertFalse(vert.equals("vert"));
	}
	
	@Test
	void VertexEqualsTestFour() {
		Vertex vert = new Vertex(1, 2, 3);
		Vertex vertx = new Vertex(2, 2, 3);
		assertFalse(vert.equals(vertx));
	}
	
	@Test
	void VertexEqualsTestFive() {
		Vertex vert = new Vertex(1, 2, 3);
		Vertex vertx = new Vertex(1, 3, 3);
		assertFalse(vert.equals(vertx));
	}
	
	@Test
	void VertexEqualsTestSix() {
		Vertex vert = new Vertex(1, 2, 3);
		Vertex vertx = new Vertex(1, 2, 4);
		assertFalse(vert.equals(vertx));
	}
	
	@Test
	void VertexEqualsTestSeven() {
		Vertex vert = new Vertex(1, 2, 3);
		Vertex vertx = new Vertex(1, 2, 3);
		assertTrue(vert.equals(vertx));
	}
	
	@Test
	void VertexEqualsTestEight() {
		Vertex vert = new Vertex(1, 2, 3);
		Vertex vertx = new Vertex(3, 2, 1);
		assertFalse(vert.equals(vertx));
	}
	
	@Test
	void VertexRotateXaxis() {
		Vertex vert = new Vertex(0, 1, 0);
		vert.rotateXAxis(Math.PI/2);
		Vertex result = new Vertex(0, 0, 1);
		assertTrue(vert.equals(result));
	}
	
	@Test
	void VertexRotateYaxis() {
		Vertex vert = new Vertex(1, 0, 0);
		vert.rotateYAxis(Math.PI/2);
		Vertex result = new Vertex(0, 0, -1);
		assertTrue(vert.equals(result));
	}
	
	@Test
	void VertexRotateZaxis() {
		Vertex vert = new Vertex(1, 0, 0);
		vert.rotateZAxis(Math.PI/2);
		Vertex result = new Vertex(0, 1, 0);
		assertTrue(vert.equals(result));
	}
	
	@Test
	void VertexHashCode() {
		Vertex vert = new Vertex(1, 2, 3);
		assertEquals(vert.hashCode(), 150);
	}
	
	@Test
	void VertexToString() {
		Vertex vert = new Vertex(1.2, 3, 4.5);
		assertEquals(vert.toString(),"1.2 3.0 4.5");
	}
	
	@Test
	void PolygonNoArgumentConstructor() {
		Polygon poly = new Polygon();
		assertNotEquals(poly, null);
	}
	
	@Test
	void PolygonEqualsTestOne() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		assertTrue(p_one.equals(p_one));
	}
	
	@Test
	void PolygonEqualsTestTwo() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		assertFalse(p_one.equals(null));
	}
	
	@Test
	void PolygonEqualsTestThree() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		assertFalse(p_one.equals("p_one"));
	}
	
	@Test
	void PolygonEqualsTestFour() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		Vertex v_three = new Vertex(3,4,5);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		LinkedHashSet<Vertex> vs_two = new LinkedHashSet<Vertex>();
		vs_two.add(v_one);
		vs_two.add(v_two);
		vs_two.add(v_three);
		Polygon p_two = new Polygon(vs_two);
		assertFalse(p_one.equals(p_two));
	}
	
	@Test
	void PolygonEqualsTestFive() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		Vertex v_three = new Vertex(3,4,5);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		LinkedHashSet<Vertex> vs_two = new LinkedHashSet<Vertex>();
		vs_two.add(v_one);
		vs_two.add(v_three);
		Polygon p_two = new Polygon(vs_two);
		assertFalse(p_one.equals(p_two));
	}
	
	@Test
	void PolygonEqualsTestSix() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex vert_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		LinkedHashSet<Vertex> vs_two = new LinkedHashSet<Vertex>();
		vs_two.add(v_two);
		vs_two.add(vert_one);
		Polygon p_two = new Polygon(vs_two);
		assertTrue(p_one.equals(p_two));
	}
	
	@Test
	void PolygonHashCode() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		assertEquals(p_one.hashCode(), 365);
	}
	
	@Test
	void PolygonTransform() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		p_one.rotateZAxis(Math.PI/2);
		Vertex vres_one = new Vertex(-2,1,3);
		Vertex vres_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vsres_one = new LinkedHashSet<Vertex>();
		vsres_one.add(vres_one);
		vsres_one.add(vres_two);
		Polygon pres_one = new Polygon(vsres_one);
		assertTrue(p_one.equals(pres_one));
	}
	
	@Test
	void MeshNoArgumentConstructor() {
		Mesh mesh = new Mesh();
		assertNotEquals(mesh, null);
	}
	
	@Test
	void MeshSetReaderOne() {
		Mesh mesh = new Mesh();
		PLYMeshReader ply =  new PLYMeshReader();
		mesh.setReader(ply);
		assertEquals(mesh.reader, ply);
	}
	
	@Test
	void MeshSetReaderTwo() {
		Mesh mesh = new Mesh();
		OBJMeshReader obj =  new OBJMeshReader();
		mesh.setReader(obj);
		assertEquals(mesh.reader, obj);
	}
	
	@Test
	void MeshSetWriterOne() {
		Mesh mesh = new Mesh();
		OBJMeshWriter obj =  new OBJMeshWriter();
		mesh.setWriter(obj);
		assertEquals(mesh.writer, obj);
	}
	
	@Test
	void MeshSetWriterTwo() {
		Mesh mesh = new Mesh();
		PLYMeshWriter ply =  new PLYMeshWriter();
		mesh.setWriter(ply);
		assertEquals(mesh.writer, ply);
	}
	
	@Test
	void MeshEqualsTestOne() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		assertTrue(mesh.equals(mesh));
	}
	
	@Test
	void MeshEqualsTestTwo() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		assertFalse(mesh.equals(null));
	}
	
	@Test
	void MeshEqualsTestThree() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		assertFalse(mesh.equals("mesh"));
	}
	
	@Test
	void MeshEqualsTestFour() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		
		Vertex v2_one = new Vertex(1,2,3);
		Vertex v2_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs2_one = new LinkedHashSet<Vertex>();
		vs2_one.add(v2_one);
		vs2_one.add(v2_two);
		Polygon p2_one = new Polygon(vs_one);
		Vertex v12_one = new Vertex(-2,1,3);
		Vertex v12_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs12_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v12_one);
		vs1_one.add(v12_two);
		Polygon p12_one = new Polygon(vs12_one);
		Vertex vr12_one = new Vertex(-2,1,5);
		Vertex vr12_two = new Vertex(-3,2,7);
		LinkedHashSet<Vertex> vrs12_one = new LinkedHashSet<Vertex>();
		vrs12_one.add(vr12_one);
		vrs12_one.add(vr12_two);
		Polygon pr12_one = new Polygon(vrs12_one);
		Mesh mesh2 = new Mesh();
		mesh2.polygons.add(p2_one);
		mesh2.polygons.add(p12_one);
		mesh2.polygons.add(pr12_one);
		assertFalse(mesh.equals(mesh2));
	}
	
	@Test
	void MeshEqualsTestFive() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		
		Vertex v2_one = new Vertex(1,2,3);
		Vertex v2_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs2_one = new LinkedHashSet<Vertex>();
		vs2_one.add(v2_one);
		vs2_one.add(v2_two);
		Polygon p2_one = new Polygon(vs2_one);
		Vertex vr12_one = new Vertex(-2,1,5);
		Vertex vr12_two = new Vertex(-3,2,7);
		LinkedHashSet<Vertex> vrs12_one = new LinkedHashSet<Vertex>();
		vrs12_one.add(vr12_one);
		vrs12_one.add(vr12_two);
		Polygon pr12_one = new Polygon(vrs12_one);
		Mesh mesh2 = new Mesh();
		mesh2.polygons.add(p2_one);
		mesh2.polygons.add(pr12_one);
		assertFalse(mesh.equals(mesh2));
	}
	
	@Test
	void MeshEqualsTestSix() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		
		Vertex v2_one = new Vertex(1,2,3);
		Vertex v2_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs2_one = new LinkedHashSet<Vertex>();
		vs2_one.add(v2_one);
		vs2_one.add(v2_two);
		Polygon p2_one = new Polygon(vs_one);
		Vertex v12_one = new Vertex(-2,1,3);
		Vertex v12_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs12_one = new LinkedHashSet<Vertex>();
		vs12_one.add(v12_one);
		vs12_one.add(v12_two);
		Polygon p12_one = new Polygon(vs12_one);
		Mesh mesh2 = new Mesh();
		mesh2.polygons.add(p2_one);
		mesh2.polygons.add(p12_one);
		assertTrue(mesh.equals(mesh2));
	}
	
	@Test
	void MeshHashCode() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		assertEquals(mesh.hashCode(), 596);
	}
	
	@Test
	void MeshTransform() {
		Vertex v_one = new Vertex(1,2,3);
		Vertex v_two = new Vertex(2,3,4);
		LinkedHashSet<Vertex> vs_one = new LinkedHashSet<Vertex>();
		vs_one.add(v_one);
		vs_one.add(v_two);
		Polygon p_one = new Polygon(vs_one);
		Vertex v1_one = new Vertex(-2,1,3);
		Vertex v1_two = new Vertex(-3,2,4);
		LinkedHashSet<Vertex> vs1_one = new LinkedHashSet<Vertex>();
		vs1_one.add(v1_one);
		vs1_one.add(v1_two);
		Polygon p1_one = new Polygon(vs1_one);
		Mesh mesh = new Mesh();
		mesh.polygons.add(p_one);
		mesh.polygons.add(p1_one);
		mesh.rotateXAxis(Math.PI/2);
		
		Vertex resv_one = new Vertex(1,-3,2);
		Vertex resv_two = new Vertex(2,-4,3);
		LinkedHashSet<Vertex> resvs_one = new LinkedHashSet<Vertex>();
		resvs_one.add(resv_one);
		resvs_one.add(resv_two);
		Polygon resp_one = new Polygon(resvs_one);
		Vertex resv1_one = new Vertex(-2,-3,1);
		Vertex resv1_two = new Vertex(-3,-4,2);
		LinkedHashSet<Vertex> resvs1_one = new LinkedHashSet<Vertex>();
		resvs1_one.add(resv1_one);
		resvs1_one.add(resv1_two);
		Polygon resp1_one = new Polygon(resvs1_one);
		Mesh meshresult = new Mesh();
		meshresult.polygons.add(resp_one);
		meshresult.polygons.add(resp1_one);
		
		assertTrue(mesh.equals(meshresult));
	}
	
	@Test
	void MeshOBJReaderPass() {
		Mesh meshread = new Mesh();
		meshread.setReader(new OBJMeshReader());
		meshread.readFromFile("\\Users\\Nathanael\\eclipse-workspace\\assignment\\src\\assignment\\objfile.obj");
		
		Vertex v1 = new Vertex(5.2, 1.2, 0.3);
		Vertex v2 = new Vertex(4.9, 1.5, 0.4);
		Vertex v3 = new Vertex(3.8, 1.5, 0.5);
		Vertex v4 = new Vertex(4.2, 1.6, 0.6);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices1.add(v1);
		vertices1.add(v2);
		vertices1.add(v3);
		
		vertices2.add(v2);
		vertices2.add(v3);
		vertices2.add(v4);
		
		Polygon poly1 = new Polygon(vertices1);
		Polygon poly2 = new Polygon(vertices2);
		
		Mesh meshresult = new Mesh();
		meshresult.polygons.add(poly1);
		meshresult.polygons.add(poly2);
		
		assertTrue(meshread.equals(meshresult));
	}
	
	@Test
	void MeshPLYReaderPass() {
		Mesh meshread = new Mesh();
		meshread.setReader(new PLYMeshReader());
		meshread.readFromFile("\\Users\\Nathanael\\eclipse-workspace\\assignment\\src\\assignment\\plyfile.ply");
		
		Vertex v1 = new Vertex(5.2, 1.2, 0.3);
		Vertex v2 = new Vertex(4.9, 1.5, 0.4);
		Vertex v3 = new Vertex(3.8, 1.5, 0.5);
		Vertex v4 = new Vertex(4.2, 1.6, 0.6);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices1.add(v1);
		vertices1.add(v2);
		vertices1.add(v3);
		
		vertices2.add(v2);
		vertices2.add(v3);
		vertices2.add(v4);
		
		Polygon poly1 = new Polygon(vertices1);
		Polygon poly2 = new Polygon(vertices2);
		
		Mesh meshresult = new Mesh();
		meshresult.polygons.add(poly1);
		meshresult.polygons.add(poly2);
		
		assertTrue(meshread.equals(meshresult));
	}
	
	@Test
	void MeshPLYReaderZero() {
		Mesh meshread = new Mesh();
		meshread.setReader(new PLYMeshReader());
		meshread.readFromFile("\\Users\\Nathanael\\eclipse-workspace\\assignment\\src\\assignment\\emptyplyfile.ply");
		
		Mesh meshresult = new Mesh();
		
		assertTrue(meshread.equals(meshresult));
	}
	
	@Test
	void MeshOBJWriterPass() {
		Mesh meshwrite = new Mesh();
		
		Vertex v1 = new Vertex(5.2, 1.2, 0.3);
		Vertex v2 = new Vertex(4.9, 1.5, 0.4);
		Vertex v3 = new Vertex(3.8, 1.5, 0.5);
		Vertex v4 = new Vertex(4.2, 1.6, 0.6);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices1.add(v1);
		vertices1.add(v2);
		vertices1.add(v3);
		
		vertices2.add(v2);
		vertices2.add(v3);
		vertices2.add(v4);
		
		Polygon poly1 = new Polygon(vertices1);
		Polygon poly2 = new Polygon(vertices2);
		
		meshwrite.polygons.add(poly1);
		meshwrite.polygons.add(poly2);
		
		meshwrite.setWriter(new OBJMeshWriter());
		meshwrite.writeToFile("\\Users\\Nathanael\\eclipse-workspace\\assignment\\src\\assignment\\objfilewrite.obj");
		
		Mesh meshread = new Mesh();
		meshread.setReader(new OBJMeshReader());
		meshread.readFromFile("\\Users\\Nathanael\\eclipse-workspace\\assignment\\src\\assignment\\objfilewrite.obj");
		
		assertTrue(meshread.equals(meshwrite));
	}
	
	@Test
	void MeshPLYWriterPass() {
		Mesh meshwrite = new Mesh();
		
		Vertex v1 = new Vertex(5.2, 1.2, 0.3);
		Vertex v2 = new Vertex(4.9, 1.5, 0.4);
		Vertex v3 = new Vertex(3.8, 1.5, 0.5);
		Vertex v4 = new Vertex(4.2, 1.6, 0.6);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices1.add(v1);
		vertices1.add(v2);
		vertices1.add(v3);
		
		vertices2.add(v2);
		vertices2.add(v3);
		vertices2.add(v4);
		
		Polygon poly1 = new Polygon(vertices1);
		Polygon poly2 = new Polygon(vertices2);
		
		meshwrite.polygons.add(poly1);
		meshwrite.polygons.add(poly2);
		
		meshwrite.setWriter(new PLYMeshWriter());
		meshwrite.writeToFile("\\Users\\Nathanael\\eclipse-workspace\\assignment\\src\\assignment\\plyfilewrite.ply");
		
		Mesh meshread = new Mesh();
		meshread.setReader(new PLYMeshReader());
		meshread.readFromFile("\\Users\\Nathanael\\eclipse-workspace\\assignment\\src\\assignment\\plyfilewrite.ply");
		
		assertTrue(meshread.equals(meshwrite));
	}
	
	@Test
	void MeshOBJWriterFail() {
		Mesh meshwrite = new Mesh();
		
		Vertex v1 = new Vertex(5.2, 1.2, 0.3);
		Vertex v2 = new Vertex(4.9, 1.5, 0.4);
		Vertex v3 = new Vertex(3.8, 1.5, 0.5);
		Vertex v4 = new Vertex(4.2, 1.6, 0.6);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices1.add(v1);
		vertices1.add(v2);
		vertices1.add(v3);
		
		vertices2.add(v2);
		vertices2.add(v3);
		vertices2.add(v4);
		
		Polygon poly1 = new Polygon(vertices1);
		Polygon poly2 = new Polygon(vertices2);
		
		meshwrite.polygons.add(poly1);
		meshwrite.polygons.add(poly2);
		
		meshwrite.setWriter(new OBJMeshWriter());
		meshwrite.writeToFile(null);
		
		Mesh meshread = new Mesh();
		meshread.setReader(new OBJMeshReader());
		meshread.readFromFile(null);
		
		assertFalse(meshread.equals(meshwrite));
	}
	
	@Test
	void MeshPLYWriterFail() {
		Mesh meshwrite = new Mesh();
		
		Vertex v1 = new Vertex(5.2, 1.2, 0.3);
		Vertex v2 = new Vertex(4.9, 1.5, 0.4);
		Vertex v3 = new Vertex(3.8, 1.5, 0.5);
		Vertex v4 = new Vertex(4.2, 1.6, 0.6);
		
		LinkedHashSet<Vertex> vertices1 = new LinkedHashSet<Vertex>();
		LinkedHashSet<Vertex> vertices2 = new LinkedHashSet<Vertex>();
		
		vertices1.add(v1);
		vertices1.add(v2);
		vertices1.add(v3);
		
		vertices2.add(v2);
		vertices2.add(v3);
		vertices2.add(v4);
		
		Polygon poly1 = new Polygon(vertices1);
		Polygon poly2 = new Polygon(vertices2);
		
		meshwrite.polygons.add(poly1);
		meshwrite.polygons.add(poly2);
		
		meshwrite.setWriter(new PLYMeshWriter());
		meshwrite.writeToFile(null);
		
		Mesh meshread = new Mesh();
		meshread.setReader(new PLYMeshReader());
		meshread.readFromFile(null);
		
		assertFalse(meshread.equals(meshwrite));
	}
}
