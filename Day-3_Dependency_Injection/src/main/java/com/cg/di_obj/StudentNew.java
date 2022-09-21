package com.cg.di_obj;

//2. Dependency in terms of Object
//StudentNew class is dependent on Mathcheat class
public class StudentNew 
{
	Mathcheat math;
	
	//DI using setter methods
	public void cheating()
	{
		math.matchCheat();
	}

	public void setMath(Mathcheat math) {
		this.math = math;
	}

}
