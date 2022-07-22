Val listRamge = List.range(100,150,10)
Cal listRangeAsStr = listRange.mkString(“,”)
Println(s”Elements of list from 100 to 150, excluding the 150 number literal = $listRangeAsStr”)
Println(s”Sum for elements in the List = ${listRange.sum}”)
