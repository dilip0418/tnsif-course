package com.dilip.dayFiveCodes.abstractDemo.markerInterface;

import java.util.ArrayList;
import java.util.List;

//Marker interface for high-priority data elements
interface HighPriority {
	// No methods are declared in this marker interface
}

//Base class for all data elements
abstract class DataElement {
	private String name;

	public DataElement(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

//Regular data element
class RegularDataElement extends DataElement {
	public RegularDataElement(String name) {
		super(name);
	}
}

//High-priority data element
class HighPriorityDataElement extends DataElement implements HighPriority {
	public HighPriorityDataElement(String name) {
		super(name);
	}
}

public class UserDefinedMarkerInterfaceDemo2 {

	public static void main(String[] args) {
		List<DataElement> dataElements = new ArrayList<>();
		dataElements.add(new RegularDataElement("Social Media"));
		dataElements.add(new HighPriorityDataElement("Self Development"));
		dataElements.add(new RegularDataElement("Over Entertainment"));
		dataElements.add(new HighPriorityDataElement("Coding & Programming"));

		for (DataElement element : dataElements) {
			System.out.println("Processing: " + element.getName());
			if (element instanceof HighPriority) {
				System.out.println(" - High Priority: Handle with special care.");
				// Perform high-priority specific operations
			} else {
				System.out.println(" - Regular Priority: Normal processing.");
				// Perform regular processing
			}
		}

	}

}
