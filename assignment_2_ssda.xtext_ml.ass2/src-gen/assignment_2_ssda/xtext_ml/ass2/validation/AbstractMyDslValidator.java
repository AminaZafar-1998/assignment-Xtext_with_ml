/*
 * generated by Xtext 2.26.0
 */
package assignment_2_ssda.xtext_ml.ass2.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMyDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage.eINSTANCE);
		return result;
	}
}
