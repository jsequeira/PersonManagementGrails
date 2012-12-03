package peoplemanagement

class Bus {

	String plate
	String name
	String type
	Integer places
	
    static constraints = {
		plate blank: false, unique:true
		places min: 0, max: 100
		type inList: ["Type1", "Type2", "Type3"]
    }
}
