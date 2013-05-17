package my.diagram.providers;

import my.MyPackage;
import my.diagram.edit.parts.ColumnPrimarySizeTypeNameUniqEditPart;
import my.diagram.edit.parts.FKRelationLabelEditPart;
import my.diagram.edit.parts.TableNameEditPart;
import my.diagram.parsers.MessageFormatParser;
import my.diagram.part.MyVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MyParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser tableName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getTableName_5002Parser() {
		if (tableName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { MyPackage.eINSTANCE
					.getNamedElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableName_5002Parser = parser;
		}
		return tableName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser columnNamePrimarySizeTypeUnique_5001Parser;

	/**
	 * @generated
	 */
	private IParser getColumnNamePrimarySizeTypeUnique_5001Parser() {
		if (columnNamePrimarySizeTypeUnique_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					MyPackage.eINSTANCE.getNamedElement_Name(),
					MyPackage.eINSTANCE.getColumn_Primary(),
					MyPackage.eINSTANCE.getColumn_Size(),
					MyPackage.eINSTANCE.getColumn_Type(),
					MyPackage.eINSTANCE.getColumn_Unique() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnNamePrimarySizeTypeUnique_5001Parser = parser;
		}
		return columnNamePrimarySizeTypeUnique_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser fKRelationLabel_6001Parser;

	/**
	 * @generated
	 */
	private IParser getFKRelationLabel_6001Parser() {
		if (fKRelationLabel_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { MyPackage.eINSTANCE
					.getFKRelation_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fKRelationLabel_6001Parser = parser;
		}
		return fKRelationLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TableNameEditPart.VISUAL_ID:
			return getTableName_5002Parser();
		case ColumnPrimarySizeTypeNameUniqEditPart.VISUAL_ID:
			return getColumnNamePrimarySizeTypeUnique_5001Parser();
		case FKRelationLabelEditPart.VISUAL_ID:
			return getFKRelationLabel_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MyVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MyVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MyElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
