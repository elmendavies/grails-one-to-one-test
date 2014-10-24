package test

class Door {

	String code
	
	static belongsTo = [ house: House ]
	
    static constraints = {
    }
}
