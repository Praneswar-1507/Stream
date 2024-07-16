package com.chainsys.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Teams {
	public static void main(String args[])
	{
		
		
List<String> names=new ArrayList<String>();
names.add("pranesh");
names.add("chandru");
names.add("vasanth");
names.stream().forEach(System.out::println);
Optional<String> asdf=names.stream()
.filter(items->items.equals("pranes"))
.findFirst();

		
System.out.println(asdf.isPresent()?asdf.get():"no element found");
names.stream().sorted().forEach(System.out::println);
System.out.println(names.stream().count());

}
}

