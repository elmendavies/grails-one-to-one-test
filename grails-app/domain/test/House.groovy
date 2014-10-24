package test

class House extends Building {
	
	Long number
	Integer inhabitants
	
	//Roof roof
	static hasOne = [ roof: Roof ]
	static hasMany = [ people: Person, doors: Door ]

    static constraints = {
		roof unique: true, nullable: true
    }
}
