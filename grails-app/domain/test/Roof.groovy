package test


class Roof {

	String color
	//House house
	
	static belongsTo = [ house: House ]
	
    static constraints = {
		color editable: false
	}
	
	static mapping = {
		house index: true
    }
	
	static embedded = ['chimney']
}
