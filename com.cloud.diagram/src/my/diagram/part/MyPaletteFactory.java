package my.diagram.part;

import java.util.Collections;
import java.util.List;

import my.diagram.providers.MyElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MyPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMy1Group());
	}

	/**
	 * Creates "my" palette tool group
	 * @generated
	 */
	private PaletteContainer createMy1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.My1Group_title);
		paletteContainer.setId("createMy1Group"); //$NON-NLS-1$
		paletteContainer.add(createColumn1CreationTool());
		paletteContainer.add(createTable2CreationTool());
		paletteContainer.add(createFKRelation3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColumn1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Column1CreationTool_title,
				Messages.Column1CreationTool_desc,
				Collections.singletonList(MyElementTypes.Column_3001));
		entry.setId("createColumn1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes
				.getImageDescriptor(MyElementTypes.Column_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTable2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Table2CreationTool_title,
				Messages.Table2CreationTool_desc,
				Collections.singletonList(MyElementTypes.Table_2001));
		entry.setId("createTable2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes
				.getImageDescriptor(MyElementTypes.Table_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFKRelation3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.FKRelation3CreationTool_title,
				Messages.FKRelation3CreationTool_desc,
				Collections.singletonList(MyElementTypes.FKRelation_4001));
		entry.setId("createFKRelation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MyElementTypes
				.getImageDescriptor(MyElementTypes.FKRelation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
