package test

class Face {
	String name
	Nose nose
	static hasOne = [nose: Nose]

    static constraints = {
    }
}
