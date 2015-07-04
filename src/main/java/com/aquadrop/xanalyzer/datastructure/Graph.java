package com.aquadrop.xanalyzer.datastructure;

import java.util.List;

import scala.Tuple2;

// directed acyclic graph
public class Graph<T> {
	List<T> vertices;
	List<List<Tuple2<Integer, Float>>> edges;
	
	public void addVertex(T vertex) {
		vertices.add(vertex);
	}
}
