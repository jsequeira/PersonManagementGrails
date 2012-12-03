package peoplemanagement

class Driver {
	Integer id
	String name
	
	static hasMany = [leaves: Leave]
	
    static constraints = {
		id blank: false
		name blank: false
    }
	
	String toString(){
		return name
	}
}
