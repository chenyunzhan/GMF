package my.diagram.edit.policies;

import my.diagram.providers.MyElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class FKRelationItemSemanticEditPolicy extends
		MyBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FKRelationItemSemanticEditPolicy() {
		super(MyElementTypes.FKRelation_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}