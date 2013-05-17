package my.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import my.Column;
import my.Database;
import my.FKRelation;
import my.MyPackage;
import my.Table;
import my.diagram.edit.parts.ColumnEditPart;
import my.diagram.edit.parts.DatabaseEditPart;
import my.diagram.edit.parts.FKRelationEditPart;
import my.diagram.edit.parts.TableEditPart;
import my.diagram.providers.MyElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MyDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<MyNodeDescriptor> getSemanticChildren(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_1000SemanticChildren(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyNodeDescriptor> getDatabase_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Database modelElement = (Database) view.getElement();
		LinkedList<MyNodeDescriptor> result = new LinkedList<MyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTables().iterator(); it.hasNext();) {
			Table childElement = (Table) it.next();
			int visualID = MyVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TableEditPart.VISUAL_ID) {
				result.add(new MyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyNodeDescriptor> getTable_2001SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Table modelElement = (Table) view.getElement();
		LinkedList<MyNodeDescriptor> result = new LinkedList<MyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getColumns().iterator(); it
				.hasNext();) {
			Column childElement = (Column) it.next();
			int visualID = MyVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new MyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getContainedLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_1000ContainedLinks(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001ContainedLinks(view);
		case FKRelationEditPart.VISUAL_ID:
			return getFKRelation_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getIncomingLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001IncomingLinks(view);
		case FKRelationEditPart.VISUAL_ID:
			return getFKRelation_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getOutgoingLinks(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case TableEditPart.VISUAL_ID:
			return getTable_2001OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001OutgoingLinks(view);
		case FKRelationEditPart.VISUAL_ID:
			return getFKRelation_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getDatabase_1000ContainedLinks(
			View view) {
		Database modelElement = (Database) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_FKRelation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getTable_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getColumn_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFKRelation_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getTable_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getColumn_3001IncomingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_FKRelation_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFKRelation_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getTable_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getColumn_3001OutgoingLinks(View view) {
		Column modelElement = (Column) view.getElement();
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_FKRelation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MyLinkDescriptor> getFKRelation_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<MyLinkDescriptor> getContainedTypeModelFacetLinks_FKRelation_4001(
			Database container) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		for (Iterator<?> links = container.getFkrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FKRelation) {
				continue;
			}
			FKRelation link = (FKRelation) linkObject;
			if (FKRelationEditPart.VISUAL_ID != MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Column dst = link.getTarget();
			Column src = link.getSource();
			result.add(new MyLinkDescriptor(src, dst, link,
					MyElementTypes.FKRelation_4001,
					FKRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MyLinkDescriptor> getIncomingTypeModelFacetLinks_FKRelation_4001(
			Column target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MyPackage.eINSTANCE
					.getFKRelation_Target()
					|| false == setting.getEObject() instanceof FKRelation) {
				continue;
			}
			FKRelation link = (FKRelation) setting.getEObject();
			if (FKRelationEditPart.VISUAL_ID != MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Column src = link.getSource();
			result.add(new MyLinkDescriptor(src, target, link,
					MyElementTypes.FKRelation_4001,
					FKRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MyLinkDescriptor> getOutgoingTypeModelFacetLinks_FKRelation_4001(
			Column source) {
		Database container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Database) {
				container = (Database) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MyLinkDescriptor> result = new LinkedList<MyLinkDescriptor>();
		for (Iterator<?> links = container.getFkrelations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof FKRelation) {
				continue;
			}
			FKRelation link = (FKRelation) linkObject;
			if (FKRelationEditPart.VISUAL_ID != MyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Column dst = link.getTarget();
			Column src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MyLinkDescriptor(src, dst, link,
					MyElementTypes.FKRelation_4001,
					FKRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<MyNodeDescriptor> getSemanticChildren(View view) {
			return MyDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MyLinkDescriptor> getContainedLinks(View view) {
			return MyDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MyLinkDescriptor> getIncomingLinks(View view) {
			return MyDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<MyLinkDescriptor> getOutgoingLinks(View view) {
			return MyDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
