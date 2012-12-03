package peoplemanagement

class BusLine {
	String lineId
	Date startDate
    static constraints = {
		lineId blank: false, unique:true
    }
}
