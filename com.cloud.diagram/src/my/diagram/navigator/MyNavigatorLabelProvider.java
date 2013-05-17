package my.diagram.navigator;

import my.Database;
import my.diagram.edit.parts.ColumnEditPart;
import my.diagram.edit.parts.ColumnPrimarySizeTypeNameUniqEditPart;
import my.diagram.edit.parts.DatabaseEditPart;
import my.diagram.edit.parts.FKRelationEditPart;
import my.diagram.edit.parts.FKRelationLabelEditPart;
import my.diagram.edit.parts.TableEditPart;
import my.diagram.edit.parts.TableNameEditPart;
import my.diagram.part.MyDiagramEditorPlugin;
import my.diagram.part.MyVisualIDRegistry;
import my.diagram.providers.MyElementTypes;
import my.diagram.providers.MyParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MyNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MyDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MyDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MyNavigatorItem
				&& !isOwnView(((MyNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MyNavigatorGroup) {
			MyNavigatorGroup group = (MyNavigatorGroup) element;
			return MyDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MyNavigatorItem) {
			MyNavigatorItem navigatorItem = (MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FKRelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://my/1.0?FKRelation", MyElementTypes.FKRelation_4001); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://my/1.0?Column", MyElementTypes.Column_3001); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://my/1.0?Table", MyElementTypes.Table_2001); //$NON-NLS-1$
		case DatabaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://my/1.0?Database", MyElementTypes.Database_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MyDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MyElementTypes.isKnownElementType(elementType)) {
			image = MyElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MyNavigatorGroup) {
			MyNavigatorGroup group = (MyNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MyNavigatorItem) {
			MyNavigatorItem navigatorItem = (MyNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MyVisualIDRegistry.getVisualID(view)) {
		case FKRelationEditPart.VISUAL_ID:
			return getFKRelation_4001Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3001Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_2001Text(view);
		case DatabaseEditPart.VISUAL_ID:
			return getDatabase_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTable_2001Text(View view) {
		IParser parser = MyParserProvider.getParser(MyElementTypes.Table_2001,
				view.getElement() != null ? view.getElement() : view,
				MyVisualIDRegistry.getType(TableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MyDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDatabase_1000Text(View view) {
		Database domainModelElement = (Database) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MyDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getColumn_3001Text(View view) {
		IParser parser = MyParserProvider
				.getParser(
						MyElementTypes.Column_3001,
						view.getElement() != null ? view.getElement() : view,
						MyVisualIDRegistry
								.getType(ColumnPrimarySizeTypeNameUniqEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MyDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFKRelation_4001Text(View view) {
		IParser parser = MyParserProvider.getParser(
				MyElementTypes.FKRelation_4001,
				view.getElement() != null ? view.getElement() : view,
				MyVisualIDRegistry.getType(FKRelationLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MyDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DatabaseEditPart.MODEL_ID.equals(MyVisualIDRegistry
				.getModelID(view));
	}

}
