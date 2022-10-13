package com;

public class NestedExceptionDemo {
	
	public static void main(String[] args) {
		
		try {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				
			} finally {
				try {
					
				} catch (Exception e) {
					try {
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
			
		} catch (Exception e) {
			try {
				try {
					
				} catch (Exception e2) {
					try {
						
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			} catch (Exception e2) {
				try {
					
				} catch (Exception e3) {
					// TODO: handle exception
				}
			}
		}
		
		
	}

}
