package test

class Nose {
	boolean hasFreckles
	Face face
	static belongsTo = [face: Face]
	static mapping = {
		face index:true
	}

    static constraints = {
    }
}
