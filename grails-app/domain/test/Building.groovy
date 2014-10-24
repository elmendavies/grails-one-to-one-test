package test

class Building {

	String category = 'default'
	
    static constraints = {
		category blank: false
    }
}
