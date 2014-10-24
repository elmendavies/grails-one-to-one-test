package cloud.rest.core


import org.codehaus.groovy.grails.commons.DefaultGrailsDomainClass
import org.codehaus.groovy.grails.commons.GrailsDomainClass
import org.codehaus.groovy.grails.commons.GrailsDomainClassProperty
import org.grails.datastore.mapping.model.PersistentEntity
import org.grails.datastore.mapping.model.types.Association
import org.junit.Test

import spock.lang.*
import test.House

/**
 *
 */
class AssociationsSpec {

	@Test
    void "test bidirectional bug JIRA: GRAILS-11787 "() {
		PersistentEntity entity = House.gormPersistentEntity
		Association association = entity.getPropertyByName('roof')
		assert association.bidirectional
    }
	
	@Test 
	void "test again" () {
		GrailsDomainClass domainClass = new DefaultGrailsDomainClass(House)
		GrailsDomainClassProperty property = domainClass.getPersistentProperty('roof')
		assert property.isBidirectional()
	}
}


