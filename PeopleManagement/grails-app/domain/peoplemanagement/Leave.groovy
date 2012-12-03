package peoplemanagement

class Leave {
	Integer id
	Date startDate
	Date endDate 
	String type
	
	Driver driver
	static belongsTo = Driver
	
	static mapping ={
		table "Leave"
		columns {
			id column: "id"
		}
	}
	
    static constraints = {
		startDate validator: {val, obj -> val < obj.endDate}
		endDate validator: {val, obj -> val > obj.startDate}
		type inList: ["Folga", "Ferias"]
		driver nullable: true
    }
	
	String toString(){
		return type + ": " + startDate + " ate " + endDate
	}
}
