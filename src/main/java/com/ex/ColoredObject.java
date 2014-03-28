package com.ex;

import java.util.HashMap;
import java.util.Map;

public class ColoredObject {

	/*Each colored object has attributes id and color*/
	private Integer id;
	private String color;
	
	public ColoredObject(Integer id, String color){
		this.id =  id;
		this.color = color;
	}
	
	/*Map is maintained in order to retrieve objects as per Id. We can also maintain hashmap as treating object id as key and 
	 * color as value. But in order to maintain extensibility it's better idea to key has map as (key:id,value:object), 
	 * so that even if the new attribute is added to object, code would not be disturbed. * 
	 * */
	
	public static final Map<Integer, ColoredObject> myMap;
    static
    {
        myMap = new HashMap<Integer, ColoredObject>();
        myMap.put(1, new ColoredObject(1,"Green"));
        myMap.put(2, new ColoredObject(2,"Green"));
        myMap.put(3, new ColoredObject(3,"Blue"));
        myMap.put(4, new ColoredObject(4,"Blue"));
        myMap.put(5, new ColoredObject(5,"Blue"));
        myMap.put(6, new ColoredObject(6,"Red"));
        myMap.put(7, new ColoredObject(7,"Red"));
        myMap.put(8, new ColoredObject(8,"Red"));
        myMap.put(9, new ColoredObject(9,"Blue"));
        myMap.put(10, new ColoredObject(10,"Green"));
        myMap.put(11, new ColoredObject(11,"Red"));
    }
	
	
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
