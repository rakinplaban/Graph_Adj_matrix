package com.graph.Main;

public class GetLocation {
	char vertics[];
	
	public GetLocation(char vertics[]) {
		this.vertics = vertics;
	}
	
	public int get_idx(char item) {
		for(int i=0;i<vertics.length;i++) {
			if(item == vertics[i]) {
				return i;
			}
		}
		return -1;
	}
}
