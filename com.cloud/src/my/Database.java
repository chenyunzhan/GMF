/**
 */
package my;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link my.Database#getTables <em>Tables</em>}</li>
 *   <li>{@link my.Database#getFkrelations <em>Fkrelations</em>}</li>
 * </ul>
 * </p>
 *
 * @see my.MyPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link my.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see my.MyPackage#getDatabase_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Fkrelations</b></em>' containment reference list.
	 * The list contents are of type {@link my.FKRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fkrelations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fkrelations</em>' containment reference list.
	 * @see my.MyPackage#getDatabase_Fkrelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FKRelation> getFkrelations();

} // Database
