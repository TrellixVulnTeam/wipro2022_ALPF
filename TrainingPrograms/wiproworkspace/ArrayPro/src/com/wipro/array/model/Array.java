package com.wipro.array.model;

import java.util.Arrays;

public class Array 
{
	private int values[];
	private int size;
	private int indexValue;
	
	// Initialization block
	{
		this.indexValue = -1;
	}
	
	public Array() 
	{		
		this.size = 10;
		this.values = new int[this.size];
	}
	public Array(int size) 
	{		
		this.size = size;
		this.values = new int[this.size];
	}
	
	public int[] getValues() 
	{	
		return Arrays.copyOfRange(values, 0, indexValue+1);		
	}	
	public int getSize() {
		return size;
	}	
	
	private void regenerateArray(boolean isIncrease,int newSize) 
	{
		if(isIncrease) 
		{
			this.size = newSize;
			int arr[] = new int[this.size];
			for(int i=0; i<=this.indexValue;i++) 
			{
				arr[i] = this.values[i];
			}
			this.values = arr;
		}
	}
	
	public int linearSearch(int value) 
	{
		return 0;
	}
	
	
	// Add New Element in Array
	public void add(int value) 
	{
		if(this.indexValue==this.size-1) 
		{
			regenerateArray(true,this.size+10);
		}
		this.indexValue++;
		this.values[this.indexValue] = value;
	}
	
	// Remove One Element in Array
	public int remove() 
	{
		int value = this.values[this.indexValue];
		this.values[indexValue] = 0;
		this.indexValue--;
		return value;
	}	
	
	public int remove(int index) 
	{
		if(index<0 || index>indexValue)
			return -1;
		
		int value = this.values[index];
		
		for(int i=index; i<=indexValue; i++) 
		{
			this.values[i] = this.values[i+1];
		}
		
		this.indexValue--;		
		return value;
	}	
}











